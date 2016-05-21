/**
 * @Title        DouBanMovieImagesBean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  豆瓣电影电影海报图Bean
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

import java.io.Serializable;

/**
 * @ClassName:   DouBanMovieImagesBean
 * @Description: 豆瓣电影电影海报图Bean
 * @author       Will
 * @date         2015年11月28日 下午8:37:34
 *
 */
public class DouBanMovieImagesBean implements Serializable {

	/**
	 * @Fields serialVersionUID : 序列ID
	 */
	private static final long serialVersionUID = -6728240390867030976L;

	/**
	 * @Fields small : 64px x 103px(小)
	 */
	private String small;
	
	/**
	 * @Fields large : 288px x 465px
	 */
	private String large;
	
	/**
	 * @Fields medium : 96px x 155px(中)
	 */
	private String medium;

	/**
	 * 创建一个新的实例 DouBanMovieImagesBean.
	 *
	 */
	public DouBanMovieImagesBean() {
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
