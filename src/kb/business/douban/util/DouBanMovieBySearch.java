/**
 * @Title        DouBanMovieBySearch.java
 * @Package      per.zw.openplatform.douban.util
 * @Description  电影榜单搜索
 *
 * @author       Will
 * @designer     none
 * @reviewer     none
 * @version      1.0,2015年11月28日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2015年11月28日 Will Created
 ****************
 *               1.1,2015年11月28日 Will Update
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
 * @ClassName:   DouBanMovieBySearch
 * @Description: 电影榜单搜索
 * @author       Will
 * @date         2015年11月28日 下午10:52:28
 *
 */
public class DouBanMovieBySearch {

	/**
	 * 创建一个新的实例 DouBanMovieBySearch.
	 *
	 */
	public DouBanMovieBySearch() {
	}

	/**
	 * @Title:       interAction
	 * @Description: 电影榜单搜索
	 * @param        param 请求参数
	 * @return       DouBanMovieListABean
	 * @throws
	 */
	public static DouBanMovieListABean interAction(String param) {
		String prefixUrl = "https://api.douban.com/v2/movie/search";
		String strGet = null;
		try {
			strGet = HttpRequest.sendGet(prefixUrl, param, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(null == strGet) {
			return null;
		}

		Gson gson = new Gson();
		return (DouBanMovieListABean) gson.fromJson(strGet, DouBanMovieListABean.class);
	}

}
