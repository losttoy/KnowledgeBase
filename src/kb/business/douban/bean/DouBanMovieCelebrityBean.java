/**
 * @Title        DouBanMovieCelebrityBean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  豆瓣电影影人条目Bean
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
 * @ClassName:   DouBanMovieCelebrityBean
 * @Description: 豆瓣电影影人条目Bean
 * @author       Will
 * @date         2015年11月28日 下午9:08:21
 *
 */
public class DouBanMovieCelebrityBean {

	/**
	 * @return String
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ID：" + id
				+ "，中文名：" + name
				+ "，代表作：" + works[0];
	}

	/**
	 * @Fields id : 条目id
	 */
	private String id;
	/**
	 * @Fields name : 中文名
	 */
	private String name;
	/**
	 * @Fields name_en : 英文名
	 */
	private String name_en;
	/**
	 * @Fields alt : 条目页URL
	 */
	private String alt;
	/**
	 * @Fields mobile_url : 条目移动版URL
	 */
	private String mobile_url;
	/**
	 * @Fields avatars : 影人头像
	 */
	private DouBanMovieAvatarsBean avatars;
	/**
	 * @Fields aka : 更多中文名
	 */
	private String aka[];
	/**
	 * @Fields aka_en : 更多英文名
	 */
	private String aka_en[];
	/**
	 * @Fields gender : 性别
	 */
	private String gender;
	/**
	 * @Fields born_place : 出生地
	 */
	private String born_place;
	/**
	 * @Fields works : 影人作品，最多5部，简版电影条目结构
	 */
	private DouBanMovieSubjectBean works[];

	/**
	 * 创建一个新的实例 DouBanMovieCelebrityBean.
	 *
	 */
	public DouBanMovieCelebrityBean() {
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
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return name_en
	 */
	public String getName_en() {
		return name_en;
	}

	/**
	 * @param name_en the name_en to set
	 */
	public void setName_en(String name_en) {
		this.name_en = name_en;
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
	 * @return mobile_url
	 */
	public String getMobile_url() {
		return mobile_url;
	}

	/**
	 * @param mobile_url the mobile_url to set
	 */
	public void setMobile_url(String mobile_url) {
		this.mobile_url = mobile_url;
	}

	/**
	 * @return avatars
	 */
	public DouBanMovieAvatarsBean getAvatars() {
		return avatars;
	}

	/**
	 * @param avatars the avatars to set
	 */
	public void setAvatars(DouBanMovieAvatarsBean avatars) {
		this.avatars = avatars;
	}

	/**
	 * @return aka
	 */
	public String[] getAka() {
		return aka;
	}

	/**
	 * @param aka the aka to set
	 */
	public void setAka(String[] aka) {
		this.aka = aka;
	}

	/**
	 * @return aka_en
	 */
	public String[] getAka_en() {
		return aka_en;
	}

	/**
	 * @param aka_en the aka_en to set
	 */
	public void setAka_en(String[] aka_en) {
		this.aka_en = aka_en;
	}

	/**
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return born_place
	 */
	public String getBorn_place() {
		return born_place;
	}

	/**
	 * @param born_place the born_place to set
	 */
	public void setBorn_place(String born_place) {
		this.born_place = born_place;
	}

	/**
	 * @return works
	 */
	public DouBanMovieSubjectBean[] getWorks() {
		return works;
	}

	/**
	 * @param works the works to set
	 */
	public void setWorks(DouBanMovieSubjectBean[] works) {
		this.works = works;
	}

}
