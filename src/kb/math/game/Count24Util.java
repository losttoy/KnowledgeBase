package kb.math.game;

import java.util.HashSet;
import java.util.Set;

public class Count24Util {

  public static void main(String[] args) {
    calc24(1, 2, 3, 4);
  }
  
  static String calc24 (int ...in24) {
    
    StringBuffer sb = new StringBuffer();
    for (Temp temp : calcAll(in24)) {
      if (24 == temp.getResult()) {
        sb.append(""+temp.getCalc() + "\r\n");
      }
    }

    if ("".equals(sb.toString())) {
      sb.append("无可用组合");
    }
    return sb.toString();
    
  }
  
  /**
   * 
   * @Title:       calc
   * @Description: 使用加减乘除组合nums的所有数字，产出need
   * @param nums 待计算的数字集合 例如 9 9 3 7
   * @param need 需要产出的结果 例如 24
   * @return
   * @return       ArrayList<String> 符合条件的表达式集合(((7*9)+9)/3)
   *                                                 (((9*7)+9)/3)
   *                                                 (((7*9)+9)/3)
   *                                                 (((9*7)+9)/3)
   *                                                 (((9/9)+7)*3)
   *                                                 (((9/9)+7)*3)
   * @throws
   */
  @SuppressWarnings("unused")
  @Deprecated
  private static Set<String> calc(int[] nums, int need) {
    
    Set<String> retArrStr = new HashSet<String>();
    
    if (1 == nums.length) {
      if (nums[0] == need) {
        retArrStr.add("" + need);
      }
      return retArrStr;
    }
    
    for (int i = 0; i < nums.length; ++i) {
      
      int[] numsRemain = new int[nums.length - 1];
      
      int index = 0;
      for (int j = 0; j < nums.length; ++j) {
        if (j != i) {
          numsRemain[index++] = nums[j];
        }
      }

      for (String str : calc(numsRemain, need + nums[i])) {
        retArrStr.add("(" + str + "-" + nums[i] + ")");
      }
      for (String str : calc(numsRemain, need - nums[i])) {
        retArrStr.add("(" + str + "+" + nums[i] + ")");
      }
      for (String str : calc(numsRemain, need * nums[i])) {
        retArrStr.add("(" + str + "/" + nums[i] + ")");
      }
      if (0 == need % nums[i]) {
        for (String str : calc(numsRemain, need / nums[i])) {
          retArrStr.add("(" + str + "*" + nums[i] + ")");
        }
      }
    }
    
    return retArrStr;
  }
  
  private static Set<Temp> calcAll(int... nums) {
    
    Set<Temp> retArrStr = new HashSet<Temp>();
    
    int size = nums.length;
    assert size <= 4 : "Size Bigger Than 4";

    switch (size) {
    case 1:
      Temp temp = new Temp();
      temp.setCalc("" + nums[0] + "");
      temp.setResult(nums[0]);
      retArrStr.add(temp);
      return retArrStr;
    case 2:
      Set<Temp> a = calcAll(nums[0]);
      Set<Temp> b = calcAll(nums[1]);
      retArrStr.addAll(combine(a, b));
      break;
    case 3:
      //1+2
      //nums[0] nums[1] nums[2] 
      a = calcAll(nums[0]);
      b = calcAll(nums[1], nums[2]);
      retArrStr.addAll(combine(a, b));
      //nums[1] nums[0] nums[2] 
      a = calcAll(nums[1]);
      b = calcAll(nums[0], nums[2]);
      retArrStr.addAll(combine(a, b));
      //nums[2] nums[0] nums[1] 
      a = calcAll(nums[2]);
      b = calcAll(nums[0], nums[1]);
      retArrStr.addAll(combine(a, b));
      break;
    case 4:
      //1+3
      //nums[0] nums[1] nums[2] nums[3] 
      a = calcAll(nums[0]);
      b = calcAll(nums[1], nums[2], nums[3]);
      retArrStr.addAll(combine(a, b));
      //nums[1] nums[0] nums[2] nums[3] 
      a = calcAll(nums[1]);
      b = calcAll(nums[0], nums[2], nums[3]);
      retArrStr.addAll(combine(a, b));
      //nums[2] nums[0] nums[1] nums[3] 
      a = calcAll(nums[2]);
      b = calcAll(nums[0], nums[1], nums[3]);
      retArrStr.addAll(combine(a, b));
      
      //2+2
      // 01 23
      a = calcAll(nums[0], nums[1]);
      b = calcAll(nums[2], nums[3]);
      retArrStr.addAll(combine(a, b));
      // 02 13
      a = calcAll(nums[0], nums[2]);
      b = calcAll(nums[1], nums[3]);
      retArrStr.addAll(combine(a, b));
      // 03 12
      a = calcAll(nums[0], nums[3]);
      b = calcAll(nums[1], nums[2]);
      retArrStr.addAll(combine(a, b));
      break;
    }
    
    return retArrStr;
    
  }

  private static Set<Temp> combine(Set<Temp> a, Set<Temp> b) {
    
    Set<Temp> retArrStr = new HashSet<Temp>();

    for (Temp aa : a) {
      for (Temp bb : b) {
        Temp temp = new Temp();
        temp.setCalc("(" + aa.getCalc() + "+" + bb.getCalc() + ")");
        temp.setResult(aa.getResult() + bb.getResult());
        retArrStr.add(temp);
        temp = new Temp();
        temp.setCalc("(" + aa.getCalc() + "-" + bb.getCalc() + ")");
        temp.setResult(aa.getResult() - bb.getResult());
        retArrStr.add(temp);
        temp = new Temp();
        temp.setCalc("(" + aa.getCalc() + "*" + bb.getCalc() + ")");
        temp.setResult(aa.getResult() * bb.getResult());
        retArrStr.add(temp);
        if ((bb.getResult() != 0)&&((aa.getResult() % bb.getResult()) == 0)){
          temp = new Temp();
          temp.setCalc("(" + aa.getCalc() + "/" + bb.getCalc() + ")");
          temp.setResult(aa.getResult() / bb.getResult());
          retArrStr.add(temp);
        }

        temp = new Temp();
        temp.setCalc("(" + bb.getCalc() + "+" + aa.getCalc() + ")");
        temp.setResult(bb.getResult() + aa.getResult());
        retArrStr.add(temp);
        temp = new Temp();
        temp.setCalc("(" + bb.getCalc() + "-" + aa.getCalc() + ")");
        temp.setResult(bb.getResult() - aa.getResult());
        retArrStr.add(temp);
        temp = new Temp();
        temp.setCalc("(" + bb.getCalc() + "*" + aa.getCalc() + ")");
        temp.setResult(bb.getResult() * aa.getResult());
        retArrStr.add(temp);
        if ((aa.getResult() != 0)&&((bb.getResult() % aa.getResult()) == 0)){
          temp = new Temp();
          temp.setCalc("(" + bb.getCalc() + "/" + aa.getCalc() + ")");
          temp.setResult(bb.getResult() / aa.getResult());
          retArrStr.add(temp);
        }
      }
    }

    return retArrStr;
  }
  

}

class Temp {
  String calc;//表达式
  int result;//结果
  public String getCalc() {
    return calc;
  }
  public void setCalc(String calc) {
    this.calc = calc;
  }
  public int getResult() {
    return result;
  }
  public void setResult(int result) {
    this.result = result;
  }
}