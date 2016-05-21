/**
 * @Title        DouBanMovieByUsBox.java
 * @Package      per.zw.openplatform.douban.util
 * @Description  北美票房榜
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
import kb.business.douban.bean.DouBanMovieListUsBoxBean;

import com.google.gson.Gson;


/**
 * @ClassName:   DouBanMovieByUsBox
 * @Description: 北美票房榜
 * @author       Will
 * @date         2015年11月29日 上午8:53:28
 *
 */
public class DouBanMovieByUsBox {

	/**
	 * 创建一个新的实例 DouBanMovieByUsBox.
	 *
	 */
	public DouBanMovieByUsBox() {
	}

	/**
	 * @Title:       interAction
	 * @Description: 北美票房榜
	 * @return       DouBanMovieListABean
	 * @throws
	 */
	public static DouBanMovieListUsBoxBean interAction() {
		String prefixUrl = "https://api.douban.com/v2/movie/us_box";
		String strGet = null;
		try {
			strGet = HttpRequest.sendGet(prefixUrl, "", "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(null == strGet) {
			return null;
		}

		Gson gson = new Gson();
		return (DouBanMovieListUsBoxBean) gson.fromJson(strGet, DouBanMovieListUsBoxBean.class);
	}

}
