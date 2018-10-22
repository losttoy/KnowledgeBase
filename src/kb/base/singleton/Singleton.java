/**
 * @Title        Singleton.java
 * @Package      kb.base.singleton
 * @Description  双重锁检测
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
 * @ClassName:   Singleton
 * @Description: 双重锁检测
 * @author       zhuwei
 * @date         2018年10月16日 下午10:27:20
 */
public class Singleton {
  private Singleton() {}  //私有构造函数
  private volatile static Singleton instance = null;  //单例对象
  //静态工厂方法
  public static Singleton getInstance() {
    if (instance == null) {      //双重检测机制
      synchronized (Singleton.class){  //同步锁
        if (instance == null) {     //双重检测机制
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}