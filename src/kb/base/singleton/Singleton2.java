/**
 * @Title        Singleton2.java
 * @Package      kb.base.singleton
 * @Description  静态内部类
 *
 * @author       zhuwei
 * @designer     (模块设计人)
 * @reviewer     (代码检视人)
 * @version      1.0,2018年10月16日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2018年10月16日 zhuwei Created
 ****************
 *               1.1,2018年10月16日 zhuwei Update
 *                          修改原因:
 *                          需求提交人:
 *                          代码检视人:
 ****************
 *
 * CopyRight 2018 LostToy. All rights reserved.
 */
package kb.base.singleton;

/**
 * @ClassName:   Singleton2
 * @Description: 静态内部类
 * @author       zhuwei
 * @date         2018年10月16日 下午10:30:38
 */
public class Singleton2 {
  private static class LazyHolder {
      private static final Singleton2 INSTANCE = new Singleton2();
  }
  private Singleton2 (){}
  public static Singleton2 getInstance() {
      return LazyHolder.INSTANCE;
  }
}