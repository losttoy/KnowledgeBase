/**
 * @Title        DouBanMovieRatingBean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  豆瓣电影评分Bean
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
 * @ClassName:   DouBanMovieRatingBean
 * @Description: 豆瓣电影评分Bean
 * @author       Will
 * @date         2015年11月28日 下午6:52:19
 *
 */
public class DouBanMovieRatingBean implements Serializable {

	/**
	 * @Fields serialVersionUID : 序列ID
	 */
	private static final long serialVersionUID = 4470967437189841174L;

	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[max=" + max + ", average=" + average
				+ ", min=" + min + ", stars=" + stars + "]";
	}

	/**
	 * @Fields max : 最高评分
	 */
	private double max;

	/**
	 * @Fields average : 评分
	 */
	private double average;

	/**
	 * @Fields min : 最低评分
	 */
	private double min;

	/**
	 * @Fields stars : 评星数
	 */
	private String stars;
	
	/**
	 * 创建一个新的实例 DouBanMovieRatingBean.
	 *
	 */
	public DouBanMovieRatingBean() {
	}

	/**
	 * @return max
	 */
	public double getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(double max) {
		this.max = max;
	}

	/**
	 * @return average
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}

	/**
	 * @return min
	 */
	public double getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(double min) {
		this.min = min;
	}

	/**
	 * @return stars
	 */
	public String getStars() {
		return stars;
	}

	/**
	 * @param stars the stars to set
	 */
	public void setStars(String stars) {
		this.stars = stars;
	}

}
