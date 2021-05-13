package oop.storemanagementsystem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
public class Liberarian  extends Person{
    public static void main(String[] args){
         Liberarian l = new Liberarian("@AlexAlexa4","name");
         l.requestItem("Laptop");
    }
    public Liberarian(String fName, String lName, String User_id, String password) {
        super(fName, lName, User_id, password);
    }

    public Liberarian(String User_id, String password) {
        super(User_id, password);
    }

    public Liberarian() {
    }
public void requestItem(String name, String role, String type_name, String item_id, String damagedd,int num1) throws FileNotFoundException, IOException {
        String[] value1 = {item_name, brand_name, type_name, item_id,damagedd};

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
        FileInputStream x = new FileInputStream("C:\\Users\\solina\\Documents\\NetBeansProjects\\store_managment_System\\item_store.xls");
        Workbook wo = new HSSFWorkbook(x);
        Sheet s = wo.getSheet("my store");
        int y = s.getLastRowNum();
        System.out.println(y);

        Row row = s.createRow(y + 1);
        for (int k = 0; k < 4; k++) {
            Cell cell = row.createCell(k);
            cell.setCellValue(value1[k]);
        }
//         
//         
//        
//        
//    
//    
//    }
//
        FileOutputStream file = new FileOutputStream("C:\\Users\\solina\\Documents\\NetBeansProjects\\store_managment_System\\item_store.xls");
        wo.write(file);
        file.close();
    
    

    
    
    public void requestItem(String item){
        try{
        FileInputStream fin = new FileInputStream(new File("Libererian.xls"));
        
        HSSFWorkbook libworkbook = new HSSFWorkbook(fin);
        HSSFSheet sheet1 = libworkbook.getSheet("Sheet1");
        int row =sheet1.getLastRowNum()+1;
        for (int i=1;i<=sheet1.getLastRowNum();i++){
            Row rowit = sheet1.getRow(i);
            if(rowit.getCell(3).getStringCellValue().equals(this.getUser_id())){
                rowit.createCell(4).setCellValue(item+"\n");
            }
             
        }
        fin.close();
        FileOutputStream fout = new FileOutputStream(new File("Libererian.xls"));
        libworkbook.write(fout);
        fout.close();
        libworkbook.close();
        }catch(FileNotFoundException ee){
        }
        catch (IOException ex) {   
            
        }
    }
    public String viewNewItem(){
        try{
        FileInputStream fin = new FileInputStream(new File("Libererian.xls"));
        HSSFWorkbook libworkbook = new HSSFWorkbook(fin);
        HSSFSheet sheet1 = libworkbook.getSheet("Sheet1");
        for(int i=1;i<=sheet1.getLastRowNum();i++){
            String username = sheet1.getRow(i).getCell(3).getStringCellValue();
        
        if(this.getUser_id().equals(username)){
            String item =sheet1.getRow(i).getCell(4).getStringCellValue();
            String[] items = item.split("\n");
            for(int j =0;j<=items.length;j++){
                System.out.println(i+"\n");
            }
            sheet1.getRow(i).getCell(4).setCellValue("");
            String oldItem = sheet1.getRow(i).getCell(4).getStringCellValue();
            
        }
        }
        }catch (FileNotFoundException ex) {
            
        }catch (IOException ex) {
            
        }
        
        
    }
    public String viewOldItem(){
        return null;
        
    }
    
}
