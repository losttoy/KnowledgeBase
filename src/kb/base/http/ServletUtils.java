/**
 * @Title        ServletUtils.java
 * @Package      kb.base.http
 * @Description  Servlet工具类
 *
 * @author       zhuwei
 * @designer     (模块设计人)
 * @reviewer     (代码检视人)
 * @version      1.0,2018年2月18日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2018年2月18日 zhuwei Created
 ****************
 *               1.1,2018年2月18日 zhuwei Update
 *                          修改原因:
 *                          需求提交人:
 *                          代码检视人:
 ****************
 *
 * CopyRight 2018 LostToy. All rights reserved.
 */
package kb.base.http;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName:   ServletUtils
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author       zhuwei
 * @date         2018年2月18日 下午12:10:04
 */
public class ServletUtils {
	
	/**
	 * @Title:       getIpAddr
	 * @Description: get real ip
	 *               ref:http://blog.csdn.net/c929833623lvcha/article/details/8509269
	 * @param        request
	 * @return       String
	 * @throws
	 */
	public static String getIpAddr(HttpServletRequest request) {
	      String ip = request.getHeader("X-Real-IP");
	      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
	          ip = request.getHeader("X-Forwarded-For");
	      }
	      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	          ip = request.getHeader("Proxy-Client-IP");
	      }
	      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	          ip = request.getHeader("WL-Proxy-Client-IP");
	      }
	      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	          ip = request.getRemoteAddr();
	      }
	      // 多次反向代理后会有多个IP值，第一个为真实IP。
	      if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	          if(ip.indexOf(",") > 0){
	              return ip.substring(0,ip.indexOf(","));
	          }else {
	              return ip;
	          }
	      }
	      return ip;
	  }
}