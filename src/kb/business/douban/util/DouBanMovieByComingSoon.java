/**
 * @Title        DouBanMovieByComingSoon.java
 * @Package      per.zw.openplatform.douban.util
 * @Description  即将上映榜单
 *
 * @author       Will
 * @designer     none
 * @reviewer     none
 * @version      1.0,2015年11月29日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2015年11月29日 Will Created
 ****************
 *               1.1,2015年11月29日 Will Update
 *                          修改原因:
 *                          需求提交人:
 *                          代码检视人:
 ****************
 *
 * CopyRight 2015 Will. All rights reserved.
 */
package kb.business.douban.util;

import kb.base.http.HttpRequest;
import kb.business.douban.bean.DouBanMovieListABean;

import com.google.gson.Gson;


/**
 * @ClassName:   DouBanMovieByComingSoon
 * @Description: 即将上映榜单
 * @author       Will
 * @date         2015年11月29日 上午8:40:00
 *
 */
public class DouBanMovieByComingSoon {

	/**
	 * 创建一个新的实例 DouBanMovieByComingSoon.
	 *
	 */
	public DouBanMovieByComingSoon() {
	}

	/**
	 * @Title:       interAction
	 * @Description: 即将上映榜单
	 * @param        param 请求参数
	 * @return       DouBanMovieListABean
	 * @throws
	 */
	public static DouBanMovieListABean interAction(String param) {
		String strGet = interActionStr(param);
		if(null == strGet) {
			return null;
		}
		Gson gson = new Gson();
		return (DouBanMovieListABean) gson.fromJson(strGet, DouBanMovieListABean.class);
	}

	/**
	 * @Title:       interActionStr
	 * @Description: 即将上映榜单
	 * @param        param 请求参数
	 * @return       String
	 * @throws
	 */
	public static String interActionStr(String param) {

		String prefixUrl = "https://api.douban.com/v2/movie/coming_soon";
		String strGet = null;
		try {
			strGet = HttpRequest.sendGet(prefixUrl, param, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strGet;
	}
}
