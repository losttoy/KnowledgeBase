/**
 * @Title        DouBanMovieByTop250.java
 * @Package      per.zw.openplatform.douban.util
 * @Description  Top250榜单
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
 * @ClassName:   DouBanMovieByTop250
 * @Description: none
 * @author       Will
 * @date         2015年11月29日 上午8:43:42
 *
 */
public class DouBanMovieByTop250 {

	/**
	 * 创建一个新的实例 DouBanMovieByTop250.
	 *
	 */
	public DouBanMovieByTop250() {
	}

	/**
	 * @Title:       interAction
	 * @Description: Top250榜单
	 * @param        param 请求参数
	 * @return       DouBanMovieListABean
	 * @throws
	 */
	public static DouBanMovieListABean interAction(String param) {
		String prefixUrl = "https://api.douban.com/v2/movie/top250";
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
