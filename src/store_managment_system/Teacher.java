package oop.storemanagementsystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Teacher extends Person {
    File requestPaper = new File("my request.txt");
    File complainPaper = new File("my complain.txt");
    File file = new File("My Items.xlsx");
    XSSFWorkbook listOfownedItems;
    static XSSFSheet spreadsheet;
    public void requestItemFromTheDepHead(Item item) throws FileNotFoundException, IOException {
        FileWriter fout = new FileWriter(DepHead.requestes);
        FileWriter fout1 = new FileWriter(requestPaper);
        String[] specification = new String[]{"Item Name: ", "Item Brand: ", "Item Id: ", "Item Type: "};
        String[] specificationValue = new String[]{item.itemName, item.itemBrand, item.getItemID(), item.getItemType()};
        int i = 0;
        fout.write("NEW REQUEST\n");
        for (String args : specificationValue) {
            fout1.write(specification[i] + args);

            fout.write(specification[i] + args + "\n");
            i++;
        }
        fout.write("Requested by:\n" + this.fName + " " + this.lName + "\n WITH REGARDS\n");
        fout1.flush();

        fout1.close();
        fout.flush();
        fout.close();
    }
//    abstract void borrowItem();

    public void reportComplain(Item item) throws IOException {
        if (item.isDamaged()) {
            FileWriter fout = new FileWriter(DepHead.complaints);
            FileWriter fout1 = new FileWriter(complainPaper);
            String[] specification = new String[]{"Item Name: ", "Item Brand: ", "Item Id: ", "Item Type: "};
            String[] specificationValue = new String[]{item.itemName, item.itemBrand, item.getItemID(), item.getItemType()};
            int i = 0;
            fout.write("NEW COMPLAIN \n");
            for (String args : specificationValue) {
                fout1.write(specification[i] + args);

                fout.write(specification[i] + args + "\n");
                i++;
            }
            fout.write("Reported by:\n" + this.fName + " " + this.lName + "\n WITH REGARDS\n");
            fout1.flush();

            fout1.close();
            fout.flush();
            fout.close();
        }
        else{System.out.println("sorry there is no problem with this item");}
    } 
}
