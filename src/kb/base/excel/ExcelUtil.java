/**
 * @Title        ExcelUtil.java
 * @Package      kb.base
 * @Description  POI Excel操作演示
 *               演示如何生成一个Excel（读取数据库表，存放到Excel）
 *               http://my.oschina.net/zimingforever/blog/101142
 *               JAVA使用POI操作excel
 *
 * @author       Will
 * @designer     (模块设计人)
 * @reviewer     (代码检视人)
 * @version      1.0,2016年5月30日
 *
 * @ReqPresenter 需求提交人:内部工具
 *
 * @UpdateHist   1.0,2016年5月30日 Will Created
 ****************
 *               1.1,2016年5月30日 Will Update
 *                          修改原因:
 *                          需求提交人:
 *                          代码检视人:
 ****************
 *
 * CopyRight 2016 LostToy. All rights reserved.
 */
package kb.base.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import kb.base.db.DataBaseUtil;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @ClassName:   ExcelUtil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author       Will
 * @date         2016年5月30日 下午9:24:47
 */
public class ExcelUtil {

  /**
   * 创建一个新的实例 ExcelUtil.
   *
   */
  public ExcelUtil() {
    // TODO Auto-generated constructor stub
  }
  
  public static void main(String[] args) {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/shiyu";
    String username = "shiyu";
    String password = "shiyu";
    String tableName = "shiyu.message";
    String fileTo = "/" + tableName + ".xls";
    
    Connection conn = DataBaseUtil.getConnectionJDBC(driver, url, username, password);
    long t1 = System.currentTimeMillis();
    downloadTable(conn, tableName, fileTo);
    long t2 = System.currentTimeMillis();
    System.out.println((t2 - t1) / 1000.0 + "s");
    DataBaseUtil.closeConnection(conn);
  }

  /**
   * @Title:       downloadTable
   * @Description: TODO(这里用一句话描述这个方法的作用)
   * @param conn
   * @param tableName
   * @param fileTo
   * @return       void
   * @throws
   */
  public static void downloadTable(Connection conn, String tableName,
		  String fileTo) {
    HSSFWorkbook workbook= new HSSFWorkbook();
    HSSFSheet sheet= workbook.createSheet(tableName);
    FileOutputStream os = null;
    
    String SELECT_SQL = "select * from " + tableName;
    try {
      PreparedStatement pstmt = conn.prepareStatement(SELECT_SQL);
      ResultSet rs = pstmt.executeQuery();
      
      //Head
      ResultSetMetaData metaData = rs.getMetaData();
      HSSFRow row = sheet.createRow(0);
      int size = metaData.getColumnCount();
      for (int i = 0; i < size; ++i) {
        HSSFCell cell= row.createCell(i);
        cell.setCellValue(metaData.getColumnName(i + 1));
      }
      
      //Content
      int index = 0;
      while (rs.next()) {
        ++index;
        row = sheet.createRow(index);
        for (int i = 0; i < size; ++i) {
          HSSFCell cell= row.createCell(i);
          cell.setCellValue(rs.getString(i + 1));
        }
      }
      os = new FileOutputStream(fileTo);
      workbook.write(os);
      os.flush();
      
	} catch (SQLException e) {
      e.printStackTrace();
	} catch (FileNotFoundException e) {
	  e.printStackTrace();
	} catch (IOException e) {
	  e.printStackTrace();
	} finally {
      try {
        if (null != os) {
          os.close();
          os = null;
        }
        if (null != workbook) {
          workbook.close();
          workbook = null;
        }
	  } catch (IOException e) {
        e.printStackTrace();
      }
		
	}
    
  }
}
