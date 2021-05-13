package myproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DepHead extends Person {

    static File file = new File("TeacherList.xlsx");
    static File file2 = new File("StudentsList.xlsx");

    static FileOutputStream fos;
    static FileInputStream fin;
    static XSSFWorkbook teacherlist;
    static XSSFWorkbook studentslist;
    static XSSFSheet spreadsheet2;
    static XSSFSheet spreadsheet;
    static File requestes = new File("requests.txt");
    static File complaints = new File("complaints.txt");
        static File teacherObjects = new File("teacher objects.txt");
                static File studentObjects = new File("student objects.txt");


   

    DepHead() throws IOException {
    }

    public void RegisterTeachers(String fname, String lname, String id, String passwor) throws FileNotFoundException, IOException {
        FileOutputStream filout=new FileOutputStream(teacherObjects);
        ObjectOutputStream oos=new ObjectOutputStream(filout);
        oos.writeObject(oos);
        oos.flush();
        oos.close();
        filout.close();
        fin = new FileInputStream(file);
        teacherlist = new XSSFWorkbook(fin);
        spreadsheet = teacherlist.getSheetAt(0);
        int index = spreadsheet.getLastRowNum() + 1;
        XSSFRow row = spreadsheet.createRow((short) index);
        row.createCell(0).setCellValue(fname);
        row.createCell(1).setCellValue(lname);
        row.createCell(2).setCellValue(id);
        row.createCell(3).setCellValue(passwor);
        fin.close();
        for (int i = 0; i < 4; i++) {
            spreadsheet.autoSizeColumn(i);
        }
        fos = new FileOutputStream(file);
        teacherlist.write(fos);
        //System.out.println("teacher registered seccussfully");
        fos.close();
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
        FileInputStream x = new FileInputStream("C:\\Users\\solina\\Documents\\NetBeansProjects\\store_managment_System\\libHead.xls");
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
        FileOutputStream file = new FileOutputStream("C:\\Users\\solina\\Documents\\NetBeansProjects\\store_managment_System\\libHead.xls");
        wo.write(file);
        file.close();
    }
public void registerItem(String item_name, String brand_name, String type_name, String item_id, String damagedd,int num1) throws FileNotFoundException, IOException {
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
    }

    public void RegisterStudents(String fname, String lname, String id, String passwor) throws FileNotFoundException, IOException {

        fin = new FileInputStream(file2);
        studentslist = new XSSFWorkbook(fin);
        spreadsheet = studentslist.getSheetAt(0);
        int index = spreadsheet.getLastRowNum() + 1;
        XSSFRow row = spreadsheet.createRow((short) index);
        row.createCell(0).setCellValue(fname);
        row.createCell(1).setCellValue(lname);
        row.createCell(2).setCellValue(id);
        row.createCell(3).setCellValue(passwor);
        fin.close();
        fos = new FileOutputStream(file2);
        studentslist.write(fos);

        fos.close();

    }

    public void getListOfStudents() throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream(file2);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet spreadsheet = workbook.getSheetAt(0);
        Iterator< Row> rowIterator = spreadsheet.iterator();
        while (rowIterator.hasNext()) {
            XSSFRow row = (XSSFRow) rowIterator.next();
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

    public void getListOfTeachers() throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet spreadsheet = workbook.getSheetAt(0);
        Iterator< Row> rowIterator = spreadsheet.iterator();
        while (rowIterator.hasNext()) {
            XSSFRow row = (XSSFRow) rowIterator.next();
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

    public static void main(String[] args) throws IOException {
        DepHead head = new DepHead();
//        head.RegisterTeachers("getachew", "tebikew", "rueoe", "gopach");
//        head.RegisterTeachers("wuyhuwehuw", "erjerh", "rhejr", "gopach");
//
//        head.RegisterStudents("getachew2", "tebikew", "rueoe", "gopach");
//        head.RegisterStudents("getachew2", "tebikew", "rueoe", "gopach");
//
//        head.RegisterStudents("getachew2", "tebikew", "rueoe", "gopach");
//        head.getListOfStudents();
//        System.out.println("TEACHERS\n-------------------------------------");
//
//        head.getListOfTeachers();
//         head.seeMembersRequest();
        System.out.println("---------------------------------------------");
        Teacher t = new Teacher();
        t.fName = "getachew";
        t.lName = "tebkew";
        Item item = new Item();
        item.setDamaged(Boolean.TRUE);
        item.itemBrand = "tecno";
        item.itemName = "cellPhone";
        item.setItemID("a/545/45");
        item.setItemType("teaching material");
        //t.requestItemFromTheDepHead(item);
        //t.reportComplain(item);
        head.seeMembersRequest();
        System.out.println("-----------------------------------------");
        //head.seeComplaints();
    }

    public void seeComplaints() throws FileNotFoundException, IOException {

        FileReader fis = new FileReader(complaints);
        //       FileWriter fw=new FileWriter(complaints);
        //fw.write();
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }

    public void approveComplaint(Item item, Person person) {
        if (item.isDamaged()) {

        }
    }

    public void seeMembersRequest() throws IOException {

        FileReader fis = new FileReader(requestes);
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }

    public void giveResponseForRequests() {

    }
//
//    abstract void requestForItemFromStore();

}
