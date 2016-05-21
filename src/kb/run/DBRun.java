/**
 * @Title        DBRun.java
 * @Package      kb.run
 * @Description  TODO(用一句话描述该文件做什么)
 *
 * @author       Will
 * @designer     (模块设计人)
 * @reviewer     (代码检视人)
 * @version      1.0,2016年5月9日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2016年5月9日 Will Created
 ****************
 *               1.1,2016年5月9日 Will Update
 *                          修改原因:
 *                          需求提交人:
 *                          代码检视人:
 ****************
 *
 * CopyRight 2016 LostToy. All rights reserved.
 */
package kb.run;

import kb.base.db.DataBaseUtil;

/**
 * @ClassName:   DBRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author       Will
 * @date         2016年5月9日 下午9:12:28
 */
public class DBRun {

	/**
	 * 创建一个新的实例 DBRun.
	 *
	 */
	public DBRun() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Title:       main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return       void
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseUtil.getConnectionDS("shiyu");
	}

}
