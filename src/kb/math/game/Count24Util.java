package kb.math.game;

import java.util.ArrayList;

public class Count24Util {

  public static void main(String[] args) {
    System.out.println(calc24("9 9 3 7"));
  }
  
  static String calc24 (String in24) {
    
    String[] arr = in24.split("\\s+");
    if (4 != arr.length) {
      return "格式非法";
    }
    
    int[] nums4 = new int[4];
    try {
      for (int i = 0; i < nums4.length; ++i) {
        nums4[i] = Integer.parseInt(arr[i]);
      }
    } catch (NumberFormatException e) {
      return "格式非法";
    }
    
    ArrayList<String> result = calc(nums4, 24);
    
    if ((null == result) || (0 == result.size())) {
      return "无可用组合";
    }
    
    StringBuffer sb = new StringBuffer();
    for (String str : result) {
      sb.append(str + "\r\n");
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
  private static ArrayList<String> calc(int[] nums, int need) {
    
    ArrayList<String> retArrStr = new ArrayList<String>();
    
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

}