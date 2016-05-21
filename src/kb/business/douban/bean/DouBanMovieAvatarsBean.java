/**
 * @Title        DouBanMovieAvatarsBean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  豆瓣电影影人头像Bean
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
package kb.business.douban.bean;

/**
 * @ClassName:   DouBanMovieAvatarsBean
 * @Description: 豆瓣电影影人头像Bean
 * @author       Will
 * @date         2015年11月28日 下午8:23:08
 *
 */
public class DouBanMovieAvatarsBean {

	/**
	 * @Fields small : 70px x 100px(小)
	 */
	private String small;
	
	/**
	 * @Fields large : 420px x 600px(大)
	 */
	private String large;
	
	/**
	 * @Fields medium : 140px x 200px(中)
	 */
	private String medium;

	/**
	 * 创建一个新的实例 DouBanMovieAvatarsBean.
	 *
	 */
	public DouBanMovieAvatarsBean() {
	}

	/**
	 * @return small
	 */
	public String getSmall() {
		return small;
	}

	/**
	 * @param small the small to set
	 */
	public void setSmall(String small) {
		this.small = small;
	}

	/**
	 * @return large
	 */
	public String getLarge() {
		return large;
	}

	/**
	 * @param large the large to set
	 */
	public void setLarge(String large) {
		this.large = large;
	}

	/**
	 * @return medium
	 */
	public String getMedium() {
		return medium;
	}

	/**
	 * @param medium the medium to set
	 */
	public void setMedium(String medium) {
		this.medium = medium;
	}

}
