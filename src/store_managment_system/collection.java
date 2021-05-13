
package store_managment_system;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

interface collection {
    
    Workbook admin_info =new HSSFWorkbook();
    Workbook Store_keeper_info =new HSSFWorkbook();
    //Sheet sheet1=Auditor_info.createSheet("Store_keeper info");
    Workbook Auditor_info =new HSSFWorkbook();
     Sheet sheet1=Auditor_info.createSheet("Store_keeper info");
     FileInputStream file=new FileInputStream("Auditor_info.xls");
}
