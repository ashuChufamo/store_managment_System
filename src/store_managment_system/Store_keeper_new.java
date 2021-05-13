package store_managment_system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Store_keeper_new implements Removable{
public static void main(String [] args){
    Store_keeper_new sk = new Store_keeper_new();
    Items item = new Items("Lapaatop","L125", 1234,"Electronics","not damaged", "brand");
    try {
        //sk.registerItem(item);
        sk.removeItem("L125");
    } catch (IOException ex) {
        Logger.getLogger(Store_keeper_new.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    public void register_department_head(String f_name, String l_name, String u_name, String password, String department_it_own, int number) throws FileNotFoundException, IOException {
        String[] value1 = {f_name, l_name, u_name, department_it_own, password};

//         Workbook workbook=new HSSFWorkbook();
//         Sheet sheet=workbook.createSheet("my store");
//         
//         Row row=sheet.createRow(0);
//         for(int k=0;k<5;k++){
//          Cell cell=row.createCell(k);
//          cell.setCellValue(value1[k]);
//         }
//         for (int i = 0; i < 4; i++) {
//            sheet.autoSizeColumn(i);
//        }
//         
//         
//         FileOutputStream file=new FileOutputStream("depHead.xls");
//         workbook.write(file);
//         file.close();
        //*************************************************************************************************************//
        FileInputStream x= new FileInputStream("depHead.xls");
        Workbook wo = new HSSFWorkbook(x);
        Sheet s = wo.getSheetAt(0);
        int y = s.getLastRowNum();
        System.out.println(y);

        Row row = s.createRow(y + 1);
        for (int k = 0; k < 5; k++) {
            Cell cell = row.createCell(k);
            cell.setCellValue(value1[k]);
        }
        for (int i = 0; i < 4; i++) {
            s.autoSizeColumn(i);
        }
//         
//         
//        
//        
//    
//    
//    }
//
        FileOutputStream file = new FileOutputStream("depHead.xls");
        wo.write(file);
        file.close();
        //*******************************************************************//
         FileInputStream v = new FileInputStream("department_student_info.xls");
         Workbook wb=new HSSFWorkbook(v);
         //Iterator< Sheet> sheetIterator = wb.sheetIterator();
       
         Sheet sheet=wb.createSheet(department_it_own);
         String varr=department_it_own;
         
         
         
         
         
         FileOutputStream filee=new FileOutputStream("department_teacher_info.xls");
         wb.write(filee);
         filee.close();
         FileInputStream c = new FileInputStream("department_teacher_info.xls");
         Workbook wc=new HSSFWorkbook(c);
         //Iterator< Sheet> sheetIterator = wb.sheetIterator();
       
         Sheet sheett=wc.createSheet(department_it_own);
         String varrr=department_it_own;
         
         
         
         
         
         FileOutputStream fileee=new FileOutputStream("department_student_info.xls");
         wc.write(fileee);
         fileee.close();
    }
public void register_librery_head(String f_name, String l_name, String u_name, String password, int number) throws FileNotFoundException, IOException {
        String[] value1 = {f_name, l_name, u_name, password};

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
//         FileOutputStream file=new FileOutputStream("libHead.xls");
//         workbook.write(file);
//         file.close();
        //*************************************************************************************************************//
        FileInputStream x = new FileInputStream("libHead.xls");
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
//         
//         
//        
//        
//    
//    
//    }
//
        FileOutputStream file = new FileOutputStream("libHead.xls");
        wo.write(file);
        file.close();
        
//         while(sheetIterator.hasNext()){
//             
//         sheetIterator.
         }
    
public void registerItem(Items item) throws FileNotFoundException, IOException {
        //String[] value1 = {item.getName(), item.getId(), item.getType(),item.getItemBrand()};

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
//         FileOutputStream file=new FileOutputStream("libHead.xls");
//         workbook.write(file);
//         file.close();
        //*************************************************************************************************************//
        FileInputStream fin = new FileInputStream(new File("item_store.xls"));
        Workbook workbook = new HSSFWorkbook(fin);
        Sheet sheet1 = workbook.getSheet("my store");
        int y = sheet1.getLastRowNum();
        System.out.println(y);
        fin.close();
        Row rowit =sheet1.createRow(y+1);
        rowit.createCell(0).setCellValue(item.getName());
        rowit.createCell(1).setCellValue(item.getId());
        rowit.createCell(2).setCellValue(Long.toString(item.getPrice()));
        rowit.createCell(3).setCellValue(item.getType());
        Cell cc = rowit.createCell(4);
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy  hh:mm aa");
        Calendar cal = Calendar.getInstance();
        String date = dateFormat.format(cal.getTime());
        cc.setCellValue(date);
        rowit.createCell(5).setCellValue(item.getStatus());
        for(int i =0;i<=5;i++){
            sheet1.autoSizeColumn(i);
        }
//*/
        FileOutputStream fout = new FileOutputStream(new File("item_store.xls"));
        workbook.write(fout);
        fout.close();
    }
public void notifyBuyingItem() throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream("item_store.xls");
       Workbook workbook = new HSSFWorkbook(fis);
        Sheet spreadsheet = workbook.getSheetAt(0);
        Iterator< Row> rowIterator = spreadsheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = (Row) rowIterator.next();
            Iterator< Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                System.out.print(
                        cell.getStringCellValue() + " \t\t ");

            }
            System.out.println();

            fis.close();
        }
    }
public void removeItem(String itemId) throws FileNotFoundException, IOException{
        FileInputStream fin = new FileInputStream(new File("item_store.xls"));
        HSSFWorkbook libworkbook = new HSSFWorkbook(fin);
        HSSFSheet sheet1 = libworkbook.getSheetAt(0);
        int lastcell =sheet1.getRow(0).getLastCellNum()-1;
        for(int i=1;i<=sheet1.getLastRowNum();i++){
            Row row = sheet1.getRow(i);
        Cell cel =row.getCell(1);
        String id =cel.getStringCellValue();
        if(id.equals(itemId)&&i!=sheet1.getLastRowNum()){
            sheet1.removeRow(row);
            int lastRow =0;
            for(int k =i;k<sheet1.getLastRowNum();k++){
                Row rowCre =sheet1.createRow(k);
            for(int j=0;j<=lastcell;j++){
              String val =sheet1.getRow(k+1).getCell(j).getStringCellValue();
              rowCre.createCell(j).setCellValue(val);   
            }
            
        }
            sheet1.removeRow(sheet1.getRow(sheet1.getLastRowNum()));
            break;
            }
        else if(id.equals(itemId)&&i==sheet1.getLastRowNum()){
            sheet1.removeRow(row);
        }
                }
        
        fin.close();
        FileOutputStream fout = new FileOutputStream(new File("item_store.xls"));
        libworkbook.write(fout);
        fout.close();
        libworkbook.close();
        
        
    
}
    @Override
    public void remove(String statusid,String path,int sheetIndex) throws IOException,FileNotFoundException{
        FileInputStream fin = new FileInputStream(new File("Libererian.xls"));
        HSSFWorkbook libworkbook = new HSSFWorkbook(fin);
        HSSFSheet sheet1 = libworkbook.getSheetAt(sheetIndex);
        int lastcell =sheet1.getRow(0).getLastCellNum()-1;
        for(int i=1;i<=sheet1.getLastRowNum();i++){
            Row row = sheet1.getRow(i);
        Cell cel =row.getCell(3);
        String id =cel.getStringCellValue();
        if(id.equals(statusid)&&i!=sheet1.getLastRowNum()){
            sheet1.removeRow(row);
            int lastRow =0;
            for(int k =i;k<sheet1.getLastRowNum();k++){
                Row rowCre =sheet1.createRow(k);
            for(int j=0;j<=lastcell;j++){
                String val =sheet1.getRow(k+1).getCell(j).getStringCellValue();
                rowCre.createCell(j).setCellValue(val);
            }
            lastRow=k;
            
        }
            sheet1.removeRow(sheet1.getRow(sheet1.getLastRowNum()));
            break;
            }
        else if(id.equals(statusid)&&i==sheet1.getLastRowNum()){
            sheet1.removeRow(row);
        }
                }
        
        fin.close();
        FileOutputStream fout = new FileOutputStream(new File("Libererian.xls"));
        libworkbook.write(fout);
        fout.close();
        libworkbook.close();
        
    }
        
        
    
}

