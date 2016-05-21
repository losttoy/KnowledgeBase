/**
 * @Title        DouBanMovieShortBean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  豆瓣电影电影条目结构简版
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
 * @ClassName:   DouBanMovieShortBean
 * @Description: 豆瓣电影电影条目结构简版
 * @author       Will
 * @date         2015年11月28日 下午9:19:58
 *
 */
public class DouBanMovieShortBean implements Serializable {

	/**
	 * @Fields serialVersionUID : 序列ID
	 */
	private static final long serialVersionUID = 7213382119489701008L;

	/**
	 * @return String
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return title;
	}

	/**
	 * @Fields id : 条目id
	 */
	private String id;
	/**
	 * @Fields title : 中文名
	 */
	private String title;
	/**
	 * @Fields original_title : 原名
	 */
	private String original_title;
	/**
	 * @Fields alt : 条目URL
	 */
	private String alt;
	/**
	 * @Fields images : 电影海报图
	 */
	private DouBanMovieImagesBean images;
	/**
	 * @Fields rating : 评分
	 */
	private DouBanMovieRatingBean rating;
	/**
	 * @Fields year : 年代
	 */
	private String year;
	/**
	 * @Fields subtype : 条目分类, movie或者tv
	 */
	private String subtype;

	/**
	 * 创建一个新的实例 DouBanMovieShortBean.
	 *
	 */
	public DouBanMovieShortBean() {
	}

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return original_title
	 */
	public String getOriginal_title() {
		return original_title;
	}

	/**
	 * @param original_title the original_title to set
	 */
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	/**
	 * @return alt
	 */
	public String getAlt() {
		return alt;
	}

	/**
	 * @param alt the alt to set
	 */
	public void setAlt(String alt) {
		this.alt = alt;
	}

	/**
	 * @return images
	 */
	public DouBanMovieImagesBean getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(DouBanMovieImagesBean images) {
		this.images = images;
	}

	/**
	 * @return rating
	 */
	public DouBanMovieRatingBean getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(DouBanMovieRatingBean rating) {
		this.rating = rating;
	}

	/**
	 * @return year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return subtype
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * @param subtype the subtype to set
	 */
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

}
