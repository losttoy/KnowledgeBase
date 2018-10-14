# -*- coding: utf-8 -*- 
#ref1 https://blog.csdn.net/u010087956/article/details/50500071
#ref2 https://blog.csdn.net/xhw88398569/article/details/49179967

#!/usr/bin/python
import json
import urllib
from Credit import Credit
from BaseHTTPServer import BaseHTTPRequestHandler,HTTPServer

PORT_NUMBER = 8081

#This class will handles any incoming request from
#the browser 
class CreditHttpHandler(BaseHTTPRequestHandler):

        
    def do_POST(self):
        #获取post提交的数据
        datas = self.rfile.read(int(self.headers['content-length']))
        datas = urllib.unquote(datas).decode("utf-8", 'ignore')
        
        print datas
        json_str = json.loads(datas)
        try:
            buf = Credit(json_str['mod'], json_str['month'], json_str['principal'], json_str['pi'])
        except BaseException:
            buf = '出现异常'
        print buf


        # buf = '''<!DOCTYPE HTML>
        #         <html>
        #         <head><title>Get page</title></head>
        #         <body>
                
        #         <form action="post_page" method="post">
        #           username: <input type="text" name="username" /><br />
        #           password: <input type="text" name="password" /><br />
        #           <input type="submit" value="POST" />
        #         </form>
                
        #         </body>
        #         </html>'''

        self.send_response(200)
        self.send_header("Content-type","text/html;charset=UTF-8")
        self.send_header("Content-Length", len(bytes(buf)))
        self.end_headers()
        self.wfile.write(buf)


try:
    #Create a web server and define the handler to manage the
    #incoming request
    server = HTTPServer(('', PORT_NUMBER), CreditHttpHandler)
    print 'Started httpserver on port ' , PORT_NUMBER

    #Wait forever for incoming htto requests
    server.serve_forever()

except KeyboardInterrupt:
    print '^C received, shutting down the web server'
    server.socket.close()

