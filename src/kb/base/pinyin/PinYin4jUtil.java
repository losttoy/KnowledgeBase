/**
 * @Title        PinYin4jUtil.java
 * @Package      kb.base.pinyin
 * @Description  汉字转拼音、ASCII工具类
 *
 * @author       Will copy from http://blog.csdn.net/ziwen00/article/details/5436123#
 * @designer     (模块设计人)
 * @reviewer     (代码检视人)
 * @version      1.0,2016年5月7日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2016年5月7日 Will Created
 ****************
 *               1.1,2016年5月7日 Will Update
 *                          修改原因:
 *                          需求提交人:
 *                          代码检视人:
 ****************
 *
 * CopyRight 2016 Will. All rights reserved.
 */
package kb.base.pinyin;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * @ClassName:   PinYin4jUtil
 * @Description: 汉字转拼音、ASCII工具类
 * @author       Will
 * @date         2016年5月7日 下午11:29:32
 */
public class PinYin4jUtil {

	/**
	 * 创建一个新的实例 PinYin4jUtil.
	 *
	 */
	public PinYin4jUtil() {
		// TODO Auto-generated constructor stub
	}

	  
	/** 
	 * 将汉字转换为全拼 
	 *  
	 * @param src 
	 * @return String 
	 */  
	public static String getPinYin(String src)  
	{  
		char[] srcChar = src.toCharArray();
		
		// 设置汉字拼音输出的格式  
		HanyuPinyinOutputFormat hpof = new HanyuPinyinOutputFormat();  
		hpof.setCaseType(HanyuPinyinCaseType.LOWERCASE);  
		hpof.setToneType(HanyuPinyinToneType.WITH_TONE_MARK);  
		hpof.setVCharType(HanyuPinyinVCharType.WITH_U_UNICODE); 
		
		StringBuffer result = new StringBuffer();
		int srcLength = srcChar.length;  
		try  
		{  
			for (int i = 0; i < srcLength; i++)  
			{  
				// 判断是否为汉字字符   
				if (Character.toString(srcChar[i]).matches("[\\u4E00-\\u9FA5]+"))  
				{  
					String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(srcChar[i], hpof);  
					result.append(pinyinArray[0]);
				}  
				else  
				{
					result.append(Character.toString(srcChar[i]));
				}  
			}  
		}  
		catch (BadHanyuPinyinOutputFormatCombination e)  
		{  
			e.printStackTrace();  
		}  
		return result.toString();  
	}   
	  
	/** 
	 * 提取每个汉字的首字母 
	 *  
	 * @param str 
	 * @return String 
	 */  
	public static String getPinYinHeadChar(String str)  
	{  
		StringBuffer pinyinHead = new StringBuffer();
		int strLength = str.length();
		for (int j = 0; j < strLength; j++)  
		{  
			char word = str.charAt(j);  
			// 提取汉字的首字母  
			String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);  
			if (pinyinArray != null)  
			{  
				pinyinHead.append(pinyinArray[0].charAt(0));
			}  
			else  
			{  
				pinyinHead.append(word);
			}  
		}  
		return pinyinHead.toString();  
	}   
	  
	/** 
	 * 将字符串转换成ASCII码 
	 *  
	 * @param cnStr 
	 * @return String 
	 */  
	public static String getCnASCII(String cnStr)  
	{  
		StringBuffer strBuf = new StringBuffer();  
		// 将字符串转换成字节序列  
		byte[] bGBK = cnStr.getBytes();  
		for (byte b : bGBK)  
		{  
			// 将每个字符转换成ASCII码  
			strBuf.append(Integer.toHexString(b & 0xff));  
		}  
		return strBuf.toString();  
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

		String cnStr = "诸伟666走路去旅游";  
		System.out.println(getPinYin(cnStr));  
		System.out.println(getPinYinHeadChar(cnStr));  
		System.out.println(getCnASCII(cnStr));  
	}

}
