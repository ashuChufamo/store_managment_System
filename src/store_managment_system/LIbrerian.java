
package store_managment_system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class LIbrerian {
    public void registerItem(String name,String role,String type,String item_name, String  item_amount) throws FileNotFoundException, IOException {
        String[] value1 = {name,role,type, item_name, item_amount};

//         Workbook workbook=new HSSFWorkbook();
//         Sheet sheet=workbook.createSheet("my store");
//         
//         Row row=sheet.createRow(0);
//         for(int k=0;k<5;k++){
//          Cell cell=row.createCell(k);
//          cell.setCellValue(value1[k]);
//         }
//         
//         
//         
//         FileOutputStream file=new FileOutputStream("request_for_item.xls");
//         workbook.write(file);
//         file.close();
        //*************************************************************************************************************//
        FileInputStream x = new FileInputStream("C:\\Users\\solina\\Documents\\NetBeansProjects\\store_managment_System\\request_for_item.xls");
        Workbook wo = new HSSFWorkbook(x);
        Sheet s = wo.getSheet("my store");
        int y = s.getLastRowNum();
        System.out.println(y);

        Row row = s.createRow(y + 1);
        for (int k = 0; k < 4; k++) {
            Cell cell = row.createCell(k);
            cell.setCellValue(value1[k]);
        }
for (int i = 0; i < 4; i++) {
            s.autoSizeColumn(i);
        }
        FileOutputStream file = new FileOutputStream("C:\\Users\\solina\\Documents\\NetBeansProjects\\store_managment_System\\request_for_item.xls");
        wo.write(file);
        file.close();
    
}
    public void register_Student(){
    
    
    
    }
    public void register_teacher(){
    
    
    }
    
    
}
