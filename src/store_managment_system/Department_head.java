
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

public class Department_head {
    public void register_Student(String f_name, String l_name, String u_name, String password, int number,String department) throws FileNotFoundException, IOException {
        String[] value1 = {f_name, l_name, u_name, password};

//         Workbook workbook=new HSSFWorkbook();
//         Sheet sheet=workbook.createSheet("my store");
//         
//         Row row=sheet.createRow(0);
//         for(int k=0;k<4;k++){
//          Cell cell=row.createCell(k);
//          cell.setCellValue(value1[k]);
//         }
//         for (int i = 0; i < 4; i++) {
//            sheet.autoSizeColumn(i);
//        }
//         
//         
//         FileOutputStream file=new FileOutputStream("department_student_info.xls");
//         workbook.write(file);
//         file.close();
        //*************************************************************************************************************//
        FileInputStream x = new FileInputStream("department_student_info.xls");
        Workbook wo = new HSSFWorkbook(x);
        Sheet s = wo.getSheet(department);
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

        FileOutputStream file = new FileOutputStream("department_student_info.xls");
        wo.write(file);
        file.close();
    }

    public void register_teacher(String f_name, String l_name, String u_name, String password, int number) throws FileNotFoundException, IOException {
        String[] value1 = {f_name, l_name, u_name, password};

//         Workbook workbook=new HSSFWorkbook();
//         Sheet sheet=workbook.createSheet("my store");
//         
//         Row row=sheet.createRow(0);
//         for(int k=0;k<4;k++){
//          Cell cell=row.createCell(k);
//          cell.setCellValue(value1[k]);
//         }
//         for (int i = 0; i < 4; i++) {
//            sheet.autoSizeColumn(i);
//        }
//         
//         
//         FileOutputStream file=new FileOutputStream("department_teacher_info.xls");
//         workbook.write(file);
//         file.close();
        //*************************************************************************************************************//
        FileInputStream x = new FileInputStream("department_teacher_info.xls");
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

        FileOutputStream file = new FileOutputStream("department_teacher_info.xls");
        wo.write(file);
        file.close();
    }
}

