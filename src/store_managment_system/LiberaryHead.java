package oop.storemanagementsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LiberaryHead extends Person {
    
    
    public static void main(String[] args){
         LiberaryHead gh = new  LiberaryHead();
        Liberarian lin = new Liberarian("Alex","Kbede","@AlexAlexa5","@alex");
        //gh.deleteLibereian("@AlexAlexa2");
        //gh.addLiberian(lin);
        //gh.viewRequest();
    }
    public void requestItem(){
        
        
    }
    public void viewRequest( ){
        try{
        FileInputStream fin = new FileInputStream(new File("Libererian.xls"));
        HSSFWorkbook libworkbook = new HSSFWorkbook(fin);
        HSSFSheet sheet1 = libworkbook.getSheet("Sheet1");
        for(int i =1;i<=sheet1.getLastRowNum();i++){
            Row row =sheet1.getRow(i);
            String fname =row.getCell(0).getStringCellValue();
            String lname =row.getCell(1).getStringCellValue();
            String itemname =row.getCell(4).getStringCellValue();
            String[] item = itemname.split("\n");
            String itemnames ="";
            for(int j=0;j<item.length;j++){
            itemnames +=item[j]+", ";
        }
            System.out.println(fname+"  "+lname+" : "+itemnames);
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LiberaryHead.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LiberaryHead.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ArrayIndexOutOfBoundsException er){
            System.out.println("Index out of bounds");
        }
        
    }
    public void addLiberian(Liberarian librerian){
        try{
        FileInputStream fin = new FileInputStream(new File("Libererian.xls"));
        HSSFWorkbook libworkbook = new HSSFWorkbook(fin);
        HSSFSheet sheet1 = libworkbook.getSheet("Sheet1");
        int row =sheet1.getLastRowNum()+1;
        HSSFRow row1 = sheet1.createRow(row);
        row1.createCell(0).setCellValue(librerian.getfName());
        row1.createCell(1).setCellValue(librerian.getlName());
        row1.createCell(2).setCellValue(librerian.getPassword());
        row1.createCell(3).setCellValue(librerian.getUser_id());
        row1.createCell(4).setCellValue("");
        row1.createCell(5).setCellValue("");
        row1.createCell(6).setCellValue("");
        FileOutputStream fout = new FileOutputStream(new File("Libererian.xls"));
        for(int i =0;i<=5;i++){
            sheet1.autoSizeColumn(i);
        }
        libworkbook.write(fout);
        fout.close();
        libworkbook.close();
        }catch(FileNotFoundException ee){
        }
        catch (IOException ex) {
            
        }
    }
    public void deleteLibereian(String libId){
        try{
        
        FileInputStream fin = new FileInputStream(new File("Libererian.xls"));
        HSSFWorkbook libworkbook = new HSSFWorkbook(fin);
        HSSFSheet sheet1 = libworkbook.getSheet("Sheet1");
        int lastcell =sheet1.getRow(0).getLastCellNum()-1;
        for(int i=1;i<=sheet1.getLastRowNum();i++){
            Row row = sheet1.getRow(i);
        Cell cel =row.getCell(3);
        String id =cel.getStringCellValue();
        if(id.equals(libId)&&i!=sheet1.getLastRowNum()){
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
        else if(id.equals(libId)&&i==sheet1.getLastRowNum()){
            sheet1.removeRow(row);
        }
                }
        
        fin.close();
        FileOutputStream fout = new FileOutputStream(new File("Libererian.xls"));
        libworkbook.write(fout);
        fout.close();
        libworkbook.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        
        catch(NullPointerException e){System.out.println("Null pointer");}
        
    }
    
}
