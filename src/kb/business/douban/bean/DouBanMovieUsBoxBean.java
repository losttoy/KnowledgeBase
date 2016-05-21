/**
 * @Title        DouBanMovieUsBoxBean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  豆瓣电影UsBox条目列表Bean
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
 * @ClassName:   DouBanMovieUsBoxBean
 * @Description: 豆瓣电影UsBox条目列表Bean
 * @author       Will
 * @date         2015年11月29日 下午1:16:24
 *
 */
public class DouBanMovieUsBoxBean implements Serializable  {

	/**
	 * @Fields serialVersionUID : 序列ID
	 */
	private static final long serialVersionUID = -8084991764083999754L;

	/**
	 * @return String
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return subject.toString();
	}

	/**
	 * @Fields rank : 排名
	 */
	private int rank;
	/**
	 * @Fields box : 票房
	 */
	private int box;
	/**
	 * @Fields subject : 电影条目
	 */
	private DouBanMovieShortBean subject;
	
	//private boolean new;
	
	/**
	 * 创建一个新的实例 DouBanMovieUsBoxBean.
	 *
	 */
	public DouBanMovieUsBoxBean() {
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return box
	 */
	public int getBox() {
		return box;
	}

	/**
	 * @param box the box to set
	 */
	public void setBox(int box) {
		this.box = box;
	}

	/**
	 * @return subject
	 */
	public DouBanMovieShortBean getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(DouBanMovieShortBean subject) {
		this.subject = subject;
	}

}
