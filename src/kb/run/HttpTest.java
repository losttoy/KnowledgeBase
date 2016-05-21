/**
 * @Title        HttpTest.java
 * @Package      kb.run
 * @Description  TODO(用一句话描述该文件做什么)
 *
 * @author       Will
 * @designer     (模块设计人)
 * @reviewer     (代码检视人)
 * @version      1.0,2016年5月7日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2016年5月7日 Will Created
 ****************
 *               1.1,2016年5月7日 Will Update
 *                          修改原因:
 *                          需求提交人:
 *                          代码检视人:
 ****************
 *
 * CopyRight 2016 Will. All rights reserved.
 */
package kb.run;

import kb.base.http.HttpRequest;

/**
 * @ClassName:   HttpTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author       Will
 * @date         2016年5月7日 下午7:09:50
 */
public class HttpTest {
public static void main(String[] args) {
	//测试超长的返回，评估返回的上限
	//String str = HttpRequest.sendPost("http://zjuttt.imwork.net/LostToy/books/txt/%E8%AE%A9%E6%88%91%E7%95%99%E5%9C%A8%E4%BD%A0%E8%BA%AB%E8%BE%B9.txt", "", "GBK");
	String str = HttpRequest.sendGet("http://zjuttt.imwork.net/LostToy/books/txt/%E8%AE%A9%E6%88%91%E7%95%99%E5%9C%A8%E4%BD%A0%E8%BA%AB%E8%BE%B9.txt", "", "GBK");
	System.out.println(str.length());
}
}
