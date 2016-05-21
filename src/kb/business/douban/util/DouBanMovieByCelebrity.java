/**
 * @Title        DouBanMovieByCelebrity.java
 * @Package      per.zw.openplatform.douban.util
 * @Description  影人条目信息查询
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
import kb.business.douban.bean.DouBanMovieCelebrityBean;

import com.google.gson.Gson;


/**
 * @ClassName:   DouBanMovieByCelebrity
 * @Description: 影人条目信息查询
 * @author       Will
 * @date         2015年11月28日 下午10:43:44
 *
 */
public class DouBanMovieByCelebrity {

	/**
	 * 创建一个新的实例 DouBanMovieByCelebrity.
	 *
	 */
	public DouBanMovieByCelebrity() {
	}

	/**
	 * @Title:       interAction
	 * @Description: 影人条目信息查询
	 * @param        id 影人条目ID
	 * @return       DouBanMovieCelebrityBean
	 * @throws
	 */
	public static DouBanMovieCelebrityBean interAction(String id) {
		String prefixUrl = "https://api.douban.com/v2/movie/celebrity/";
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
		return (DouBanMovieCelebrityBean) gson.fromJson(strGet, DouBanMovieCelebrityBean.class);
	}

}
