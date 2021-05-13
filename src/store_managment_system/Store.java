
package store_managment_system;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public interface Store {
    Workbook admin_info =new HSSFWorkbook();
    Workbook Store_keeper_info =new HSSFWorkbook();
    Workbook Auditor_info =new HSSFWorkbook();
}
