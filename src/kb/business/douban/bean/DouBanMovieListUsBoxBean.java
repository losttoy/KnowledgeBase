/**
 * @Title        DouBanMovieListUsBoxBean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  豆瓣电影北美票房榜Bean
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
package kb.business.douban.bean;

import java.io.Serializable;

/**
 * @ClassName:   DouBanMovieListUsBoxBean
 * @Description: 豆瓣电影北美票房榜Bean
 * @author       Will
 * @date         2015年11月29日 下午1:11:43
 *
 */
public class DouBanMovieListUsBoxBean implements Serializable {

	/**
	 * @Fields serialVersionUID : 序列ID
	 */
	private static final long serialVersionUID = 5733157867179485050L;

	/**
	 * @return String
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("排行榜名称：" + title);
		sb.append("，排行榜日期范围：" + date);
		sb.append("，榜内电影数：" + subjects.length);
		sb.append("，电影条目：");
		for(DouBanMovieUsBoxBean subject : subjects) {
			sb.append("【" + subject.toString() + "】");
		}
		return sb.toString();
	}

	/**
	 * @Fields title : 排行榜名称
	 */
	private String title;
	/**
	 * @Fields date : 排行榜日期范围
	 */
	private String date;
	/**
	 * @Fields subjects : usbox条目列表
	 */
	private DouBanMovieUsBoxBean subjects[];

	/**
	 * 创建一个新的实例 DouBanMovieListUsBoxBean.
	 *
	 */
	public DouBanMovieListUsBoxBean() {
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
	 * @return date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return subjects
	 */
	public DouBanMovieUsBoxBean[] getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(DouBanMovieUsBoxBean[] subjects) {
		this.subjects = subjects;
	}

}
