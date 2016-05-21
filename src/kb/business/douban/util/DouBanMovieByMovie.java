/**
 * @Title        DouBanMovieByMovie.java
 * @Package      per.zw.openplatform.douban.util
 * @Description  电影条目信息查询
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
import kb.business.douban.bean.DouBanMovieBean;

import com.google.gson.Gson;


/**
 * @ClassName:   DouBanMovieByMovie
 * @Description: 电影条目信息查询
 * @author       Will
 * @date         2015年11月28日 下午10:18:48
 *
 */
public class DouBanMovieByMovie {

	/**
	 * 创建一个新的实例 DouBanMovieByMovie.
	 *
	 */
	public DouBanMovieByMovie() {
	}

	/**
	 * @Title:       interAction
	 * @Description: 电影条目信息查询
	 * @param        id 电影条目ID
	 * @return       DouBanMovieBean
	 * @throws
	 */
	public static DouBanMovieBean interAction(String id) {
		String prefixUrl = "https://api.douban.com/v2/movie/subject/";
		String strGet = null;
		try {
			strGet = HttpRequest.sendGet(prefixUrl + id, "", "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(null == strGet) {
			return null;
		}

		Gson gson = new Gson();
		return (DouBanMovieBean) gson.fromJson(strGet, DouBanMovieBean.class);
	}
}
