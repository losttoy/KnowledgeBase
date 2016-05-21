/**
 * @Title        DouBanMovieCelebrityShortBean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  豆瓣电影影人条目简化描述Bean
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
 * @ClassName:   DouBanMovieCelebrityShortBean
 * @Description: 豆瓣电影影人条目简化描述Bean
 * @author       Will
 * @date         2015年11月28日 下午8:18:56
 *
 */
public class DouBanMovieCelebrityShortBean {

	/**
	 * @return String
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
	}

	/**
	 * @Fields id : 影人条目id
	 */
	private String id;

	/**
	 * @Fields name : 中文名
	 */
	private String name;
	
	/**
	 * @Fields alt : 影人条目URL
	 */
	private String alt;
	
	/**
	 * @Fields avatars : 影人头像
	 */
	private DouBanMovieAvatarsBean avatars;
	
	/**
	 * 创建一个新的实例 DouBanMovieCelebrityShortBean.
	 *
	 */
	public DouBanMovieCelebrityShortBean() {
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

}
