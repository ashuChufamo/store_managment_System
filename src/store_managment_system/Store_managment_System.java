package store_managment_system;

import java.io.IOException;
import java.util.Scanner;

public class Store_managment_System {

    public static void main(String[] args) throws IOException {
        Store_managment_System s=new Store_managment_System();
        s.main_method();
        

    }
    public void main_method() throws IOException{
    Store_managment_System s = new Store_managment_System();
        Scanner input = new Scanner(System.in);
        System.out.println("____Welcome to our Store System___");
        System.out.println("who are you");
        System.out.println("_Admin");
        System.out.println("____print 1");
        System.out.println("_Store_keeper");
        System.out.println("____print 2");
        System.out.println("Librerian");
        System.out.println("____print 3");
        System.out.println("department_head");
        System.out.println("____print 4");
        System.out.println("EXIT");
        System.out.println("____print 0");

        //int valuee=input.nextInt(); 
        while (true) {
            int valuee = input.nextInt();
            switch (valuee) {
                case 1:
                    s.Admin_method();
                    break;
                case 2:
                    s.Store_keeper_method();
                    break;
                case 3:s.librerian_method();
                    break;
                case 4:s.head_department_method();
                    break;
                case 0:s.main_method();
                    break;
            }
        }

    }
    

    public void Admin_method() throws IOException {
        Store_managment_System s = new Store_managment_System();
        Scanner input = new Scanner(System.in);
        System.out.println("what do you want to add?");
        System.out.println("_Store_keeper");
        System.out.println("_____print 1");
        System.out.println("_Auditor");
        System.out.println("____print 2");
        System.out.println("back");
        System.out.println("____print 3");
        Admin1 a = new Admin1();
        //int value=input.nextInt();
        while (true) {
            int value = input.nextInt();
            switch (value) {
                case 1:
                    System.out.println("how many StoreKeeper do you want to add");
                    int num1 = input.nextInt();

                    for (int i = 0; i < num1; i++) {
                        System.out.println("what is Store_keeper first name");
                        String f_name = input.next();
                        System.out.println("what is Store_keeper last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();

                        a.register_StoreKeeper(f_name, l_name, u_name, password, 1);
                    }
                case 2:
                    System.out.println("how many Auditor  do you want to add");
                    int num2 = input.nextInt();

                    for (int i = 0; i < num2; i++) {
                        System.out.println("what is Auditor first name");
                        String f_name = input.next();
                        System.out.println("what is Auditor last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();

                        a.register_Auditor(f_name, l_name, u_name, password, 1);
                    }

                case 3:
                    s.Admin_method();
                case 4:
                    s.head_department_method();
            }

        }

    }

    public void Store_keeper_method() throws IOException {
        Store_managment_System s = new Store_managment_System();
        Scanner input = new Scanner(System.in);
        System.out.println("what do you want to do?");
        System.out.println("add_department_head");
        System.out.println("_____print 1");
        System.out.println("add_item");
        System.out.println("____print 2");
        System.out.println("add librery_head");
        System.out.println("_____print 3");
        System.out.println("add_other_head");
        System.out.println("____print 4");
        System.out.println("notify buying item");
        System.out.println("____print 5");
        System.out.println("back");
        System.out.println("____print 0");

        Store_keeper_new a = new Store_keeper_new();
        int value = input.nextInt();
        while (true) {
            switch (value) {
                case 1:
                    System.out.println("how many department head  do you want to add");
                    int num2 = input.nextInt();

                    for (int i = 0; i < num2; i++) {
                        System.out.println("what is department head first name");
                        String f_name = input.next();
                        System.out.println("what is department head last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();
                        System.out.println("what is the department it owns?");
                        String department = input.next();

                        a.register_department_head(f_name, l_name, u_name, password, department, num2);
                    }
                    s.Store_keeper_method();
                    break;
                case 2:
                    System.out.println("how many item do you want to add");
                    int num1 = input.nextInt();

                    for (int i = 0; i < num1; i++) {
                        System.out.println("what is the item name");
                        String item_name = input.next();
                        System.out.println("what is the item brand");
                        String brand_name = input.next();
                        System.out.println("what is the item_type");
                        String type_name = input.next();
                        System.out.println("what is item_id");
                        String item_id = input.next();
                        System.out.println("is item damaged or not?");
                        String damagedd = input.next();

                        a.registerItem(item_name, brand_name, type_name, item_id, damagedd, num1);
                    }
                    s.Store_keeper_method();
                    break;
                case 3:
                    System.out.println("how many librery head  do you want to add");
                    int num3 = input.nextInt();

                    for (int i = 0; i < num3; i++) {
                        System.out.println("what is librery head first name");
                        String f_name = input.next();
                        System.out.println("what is libreryhead last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();

                        a.register_librery_head(f_name, l_name, u_name, password, num3);
                    }
                    s.Store_keeper_method();
                    break;

                case 5:
                    System.out.println("thise is the item view method");
                    a.notifyBuyingItem();
                    s.Store_keeper_method();
                    break;
                case 0:s.main_method();
                    break;
            }
        }
    }

    public void librerian_method() throws IOException {
        Store_managment_System s = new Store_managment_System();
        Scanner input = new Scanner(System.in);
        System.out.println("what do you want to do?");
        System.out.println("register_Student");
        System.out.println("_____print 1");
        System.out.println("register_staff");
        System.out.println("____print 2");
        System.out.println("request_for_item");
        System.out.println("_____print 3");
        System.out.println("back");
        System.out.println("_____print 0");
        

        LIbrerian a = new LIbrerian();
        int value = input.nextInt();
        while (true) {
            switch (value) {
                case 1:
                    System.out.println("how many student  do you want to add");
                    int num2 = input.nextInt();

                    for (int i = 0; i < num2; i++) {
                        System.out.println("what is student  first name");
                        String f_name = input.next();
                        System.out.println("what is student last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();

                        //a.(f_name, l_name, u_name, password,department, num2);
                    }
                    s.Store_keeper_method();
                    break;
                case 3:
                    System.out.println("how many item do you want to request");
                    int num1 = input.nextInt();

                    for (int i = 0; i < num1; i++) {
                        System.out.println("What is your name");
                        String name = input.next();
                        System.out.println("what is your role");
                        String role = input.next();
                        System.out.println("what is the item_type");
                        String type_name = input.next();
                        System.out.println("what is the item name");
                        String item_name = input.next();
                        System.out.println("what is the item amount");
                        String amount = input.next();

                        a.registerItem(name, role, type_name, item_name, amount);
                    }
                    s.librerian_method();
                    break;
                case 0:s.librerian_method();
                    break;
//                case 3: System.out.println("how many librery head  do you want to add");
//                    int num3 = input.nextInt();
//
//                    for (int i = 0; i < num3; i++) {
//                        System.out.println("what is librery head first name");
//                        String f_name = input.next();
//                        System.out.println("what is libreryhead last name");
//                        String l_name = input.next();
//                        System.out.println("give a user_name");
//                        String u_name = input.next();
//                        System.out.println("give a password");
//                        String password = input.next();
//                        
//                        
//
//                       a.register_librery_head(f_name, l_name, u_name, password, num3);
//                    }
//                    s.Store_keeper_method();
//                    break;

//                case 5:System.out.println("thise is the item view method");
//                    a.notifyBuyingItem();
//                    s.Store_keeper_method();
//                    break;
//               
//                    
//            }
//        }
//    }
            }
        }
    }
     public void head_department_method() throws IOException {
        Store_managment_System s = new Store_managment_System();
        Scanner input = new Scanner(System.in);
        System.out.println("what do you want to do?");
        System.out.println("register_Student");
        System.out.println("_____print 1");
        System.out.println("register_teacher");
        System.out.println("____print 2");
        System.out.println("request_for_item");
        System.out.println("_____print 3");
        System.out.println("add_other_head");
        
        Department_head a = new  Department_head();
        int value = input.nextInt();
        while (true) {
            switch (value) {
                case 1:
                    System.out.println("how many student  do you want to add");
                    int num2 = input.nextInt();

                    for (int i = 0; i < num2; i++) {
                        System.out.println("what department do you want to add");
                        String dep=input.next();
                        System.out.println("what is student  first name");
                        String f_name = input.next();
                        System.out.println("what is student last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();

                        a.register_Student(f_name, l_name, u_name, password,num2,dep);
                    }
                    s.head_department_method();
                    break;
                
                case 2: System.out.println("how many teacher do you want to add");
                    int num3 = input.nextInt();

                    for (int i = 0; i < num3; i++) {
                        System.out.println("what is teacher's first name");
                        String f_name = input.next();
                        System.out.println("what is teacher's last name");
                        String l_name = input.next();
                        System.out.println("give a user_name");
                        String u_name = input.next();
                        System.out.println("give a password");
                        String password = input.next();
                        
                        

                       a.register_teacher(f_name, l_name, u_name, password, num3);
                    }
                    s.head_department_method();
                    break;

//                case 5:System.out.println("thise is the item view method");
//                    a.notifyBuyingItem();
//                    s.Store_keeper_method();
//                    break;
//               
//                    
//            }
//        }
//    }
            }
        }
    }
}
