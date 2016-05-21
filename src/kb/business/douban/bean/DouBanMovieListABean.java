/**
 * @Title        DouBanMovieListABean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  豆瓣电影榜单Bean A
 *               适用于正在热映
 *                   即将上映
 *                   Top250
 *                   搜索结果
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
 * @ClassName:   DouBanMovieListABean
 * @Description: 豆瓣电影榜单Bean A
 * @author       Will
 * @date         2015年11月28日 下午10:03:58
 *
 */
public class DouBanMovieListABean {

	/**
	 * @return String
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("榜单：" + title);
		sb.append("，榜单总数：" + total);
		sb.append("，返回起始：" + start);
		sb.append("，当次返回数量：" + count);
		sb.append("，电影条目：");
		for(DouBanMovieShortBean subject : subjects) {
			sb.append("【" + subject.toString() + "】");
		}
		return sb.toString();
	}

	private int start;
	private int count;
	private int total;
	/**
	 * @Fields subjects : 电影条目
	 */
	private DouBanMovieShortBean subjects[];
	/**
	 * @Fields title : 标题
	 */
	private String title;

	/**
	 * 创建一个新的实例 DouBanMovieListABean.
	 *
	 */
	public DouBanMovieListABean() {
	}

	/**
	 * @return start
	 */
	public int getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(int start) {
		this.start = start;
	}

	/**
	 * @return count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * @return subjects
	 */
	public DouBanMovieShortBean[] getSubjects() {
		return subjects;
	}

	/**
	 * @param subject the subjects to set
	 */
	public void setSubject(DouBanMovieShortBean[] subjects) {
		this.subjects = subjects;
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

}
