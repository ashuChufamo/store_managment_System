
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

public class Adminn {
    public void register_StoreKeeper( String f_name,String l_name,String u_name,String password,int number) throws FileNotFoundException, IOException{
         String[] value1={"Name","b_date","age","field"};
//         
//         Workbook workbook=new HSSFWorkbook();
//         Sheet sheet=workbook.createSheet("my store");
//         for(int i=0;i<3;i++){
//         Row row=sheet.createRow(i);
//         for(int k=0;k<4;k++){
//          Cell cell=row.createCell(k);
//          cell.setCellValue(value1[k]);
//         }
//         
//         }
//         
//         FileOutputStream file=new FileOutputStream("yared.xls");
//         workbook.write(file);
//         file.close();
         FileInputStream x=new FileInputStream("yared.xls");
         Workbook wo=new HSSFWorkbook(x);
         Sheet s=wo.getSheet("my store");
         int y=s.getLastRowNum();
         System.out.println(y);
         for(int i=y+1;i<3+y+1;i++){
           Row row=s.createRow(i);
         for(int k=0;k<4;k++){
          Cell cell=row.createCell(k);
          cell.setCellValue(value1[k]);
//         }
         
         
        
        
    
    
    }
}
         FileOutputStream file=new FileOutputStream("yared.xls");
         wo.write(file);
         file.close();
    }
    public 
}
