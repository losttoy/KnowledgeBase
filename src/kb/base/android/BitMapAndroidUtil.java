/**
 * @Title        BitMapAndroidUtil.java
 * @Package      per.zw.android.util
 * @Description  BitMap工具类-Android用
 *
 * @author       Will
 * @designer     none
 * @reviewer     none
 * @version      1.0,2015年12月5日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2015年12月5日 Will Created
 ****************
 *               1.1,2015年12月5日 Will Update
 *                          修改原因:
 *                          需求提交人:
 *                          代码检视人:
 ****************
 *
 * CopyRight 2015 Will. All rights reserved.
 */
package kb.base.android;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * @ClassName:   BitMapAndroidUtil
 * @Description: BitMap工具类-Android用
 * @author       Will
 * @date         2015年12月5日 下午7:06:00
 */
public class BitMapAndroidUtil {

	/**
	 * 创建一个新的实例 BitMapAndroidUtil.
	 *
	 */
	public BitMapAndroidUtil() {
	}

	/**
	 * @Title:       urlToBitMap
	 * @Description: 将url转换成Android的ImageView可以展示的BitMap
	 * @param        url
	 * @return       Bitmap
	 * @throws
	 */
	public static Bitmap urlToBitMap(String url) {
		HttpURLConnection conn = null;
		InputStream is = null;
		Bitmap bitmap = null;
		try {
			URL tUrl = new URL(url);
			conn = (HttpURLConnection) tUrl.openConnection();
			conn.setDoInput(true);
			conn.connect();
			is = conn.getInputStream();
			bitmap = BitmapFactory.decodeStream(is);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
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
			if (null != conn) {
				conn.disconnect();
				conn = null;
			}
		}
		return bitmap;
	}

}
