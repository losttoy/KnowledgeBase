# -*- coding: utf-8 -*-
import requests
import json
import time

from bilibili.grabP import getPages

def getVlist(pn):

    URL = "https://api.bilibili.com/x/space/arc/search?mid=39694771&ps=30&tid=0&pn=%s&keyword=&order=pubdate&jsonp=jsonp"\
          %pn
    response = requests.get(URL)
    assert response.status_code == 200
    text = response.text
    returnMap = json.loads(text)

    vlist = returnMap.get('data').get('list').get('vlist')
    print(vlist)
    print(len(vlist))
    return vlist

def one2Desc(one):
    desc = "ID：【%s】,标题：【%s】，描述：【%s】，时间：【%s】，长度：【%s】，播放次数：【%s】，评论：【%s】"\
           %(one.get('bvid'), one.get('title'),one.get('description')
             ,time.strftime("%Y-%m-%d %H:%M:%S", time.localtime(one.get('created')))
             ,one.get('length'),one.get('play'),one.get('comment'))
    return desc

vlist = []

for i in range(2):
    vlist = vlist + getVlist(i+1)

vlist.reverse()

print("反转后的列表：" + str(vlist))

seq = 1
for one in vlist:
    # print(one)
    print(str(seq) + "、" + one2Desc(one))
    getPages(one['bvid'])
    print()
    seq += 1