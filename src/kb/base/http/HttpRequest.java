/**
 * @Title        HttpRequest.java
 * @Package      per.zw.util.http
 * @Description  发送Http的get，post请求
 *
 * @author       Will
 * @designer     none
 * @reviewer     none
 * @version      1.0,2015年11月27日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2015年11月27日 Will Created
 ****************
 *               1.1,2016年5月7日 Will Update
 *                          修改原因:测试超长返回，最大一次支持约20w BYTE
 *                          需求提交人:Will
 *                          代码检视人:none
 ****************
 *
 * CopyRight 2015 Will. All rights reserved.
 */
package kb.base.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName:   HttpRequest
 * @Description: 发送Http的get，post请求
 * @author       Will
 * @date         2015年11月27日 下午10:02:46
 *
 */
public class HttpRequest {

	/**
	 * 创建一个新的实例 HttpRequest.
	 *
	 */
	public HttpRequest() {
	}

	/**
	 * @Title:       sendPost
	 * @Description: 向指定URL发送POST方法的请求<br/>
	 *               测试超长返回，最大一次支持约20w BYTE 20160507
	 * @param        url 发送请求的URL
	 * @param        param 请求参数
	 * @param        charset 远端字符集
	 * @return       远程资源的响应结果
	 * @throws       
	 */
	public static String sendPost(String url, String param, String charset) {
		
		//获取远端返回
		OutputStream out = null;
		InputStream in = null;
        String result = null;
		try {
			//打开和URL之间的连接
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			// 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            //发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            //获得输出流，发送请求参数
            if((null != param) && !("".equals(param))) {
            	out = conn.getOutputStream();
            	out.write(param.getBytes(charset));
            	out.flush();
            }
            int rCode = conn.getResponseCode();
            if(200 != rCode) {
            	System.out.println("HTTP错误：" + rCode +" "
            			+ conn.getResponseMessage());
            }/*
            // 获取所有响应头字段
            Map<String, List<String>> map = conn.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }*/
            //获得输出流
            in = conn.getInputStream();
            //MAX 202902
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] byInPer = new byte[1024 * 10];
            int readedNum;
			while(-1 != (readedNum = in.read(byInPer))) {
				bos.write(byInPer, 0, readedNum);
            }
            result = new String(bos.toByteArray(), charset);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null != in){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(null != out){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result.trim();
	}

	/**
	 * @Title:       sendGet
	 * @Description: 向指定URL发送GET方法的请求<br/>
	 *               测试超长返回，最大一次支持约20w BYTE 20160507
	 * @param        url 发送请求的URL
	 * @param        param 请求参数
	 * @param        charset 远端字符集
	 * @return       远程资源的响应结果
	 * @throws       
	 */
	public static String sendGet(String url, String param, String charset) {
		
		//组合完整URL
		String urlNameString = "";
		if((null != param) && !("".equals(param))) {
			urlNameString = url + "?" + param;
		} else {
			urlNameString = url;
		}
		
		//获取远端返回
		InputStream in = null;
        String result = null;
		try {
			//打开和URL之间的连接
			HttpURLConnection conn = (HttpURLConnection) new URL(urlNameString).openConnection();
			// 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            conn.connect();
            int rCode = conn.getResponseCode();
            if(200 != rCode) {
            	System.out.println("HTTP错误：" + rCode +" "
            			+ conn.getResponseMessage());
            }/*
            // 获取所有响应头字段
            Map<String, List<String>> map = conn.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }*/
            in = conn.getInputStream();
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] byInPer = new byte[1024 * 10];
            int readedNum;
			while(-1 != (readedNum = in.read(byInPer))) {
				bos.write(byInPer, 0, readedNum);
            }
            result = new String(bos.toByteArray(), charset);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null != in){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result.trim();
	}

}


