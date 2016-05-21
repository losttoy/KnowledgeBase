/**
 * @Title        DouBanMovieSubjectBean.java
 * @Package      per.zw.openplatform.douban.bean
 * @Description  中转Bean
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
 * @ClassName:   DouBanMovieSubjectBean
 * @Description: 中转Bean
 * @author       Will
 * @date         2015年11月28日 下午11:43:47
 *
 */
public class DouBanMovieSubjectBean {
	
	/**
	 * @return String
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return subject.toString();
	}

	DouBanMovieShortBean subject;

	/**
	 * 创建一个新的实例 DouBanMovieSubjectBean.
	 *
	 */
	public DouBanMovieSubjectBean() {
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
