/**
 * @Title        CRC32Util.java
 * @Package      kb.base.crc
 * @Description  TODO(用一句话描述该文件做什么)
 *
 * @author       Will
 * @designer     (模块设计人)
 * @reviewer     (代码检视人)
 * @version      1.0,2016年5月21日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2016年5月21日 Will Created
 ****************
 *               1.1,2016年5月21日 Will Update
 *                          修改原因:
 *                          需求提交人:
 *                          代码检视人:
 ****************
 *
 * CopyRight 2016 LostToy. All rights reserved.
 */
package kb.base.crypto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/**
 * @ClassName:   CRC32Util
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author       Will
 * @date         2016年5月21日 下午11:30:00
 */
public class CRC32Util {
	
	 /**
	 * @Fields BYTE_SIZE_FILE : 计算文件消息摘要时每次读入的字节数
	 *                          1000KB
	 */
	 private static final int BYTES_SIZE = 1000 * 1024;

	/**
	 * 创建一个新的实例 CRC32Util.
	 *
	 */
	public CRC32Util() {
		// TODO Auto-generated constructor stub
	}

	public static String encode(byte[] b) {
		CRC32 c32 = new CRC32();
		c32.update(b);
		return Long.toHexString(c32.getValue());
	}
	
	public static String encodeFile(String dir) {
		CRC32 c32 = new CRC32();
		File f = new File(dir);
		byte[] b = new byte[BYTES_SIZE];
		InputStream is = null;
		try {
			is = new FileInputStream(f);
			int readed;
			while (-1 != (readed = is.read(b))) {
				c32.update(b, 0, readed);
			}
			return Long.toHexString(c32.getValue());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != is) {
				try {
					is.close();
					is = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != f) {
				f = null;
			}
		}
		 
		return null;
	}

	/**
	 * @Title:       main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return       void
	 * @throws
	 */
	public static void main(String[] args) {
		/*
		 * 6cc0c796
		 * 计算耗费41.41s
		 * 6cc0c796
		 * 计算耗费42.1s
		 * 6cc0c796
		 * 计算耗费61.059s
		 */
		for (int i = 0; i < 10; ++i) {
			long t1 = System.currentTimeMillis();
			System.out.println(CRC32Util.encodeFile
					 ("C:\\Users\\Will\\Desktop\\cn_visual_studio_2010_ultimate_x86_dvd_532347.iso"));
			long t2 = System.currentTimeMillis();
			System.out.println("计算耗费" + (t2 - t1) / 1000.0 + "s");
		}

	}

}
