package jspiders.p1;

import java.util.Scanner;

public class EmployeeAap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      EmpService e2 = new EmpServiceImp();
        System.out.println("=====Welcome to employee-DB=======");
        while (true){
            System.out.println("======Menu======");
            System.out.println("1.Create Employee-Db \n2.AvailableIndex   \n3.addEmployee   \n4.   \n5.");
            System.out.println("6.   \n7.Exit");
            System.out.println("Enter your Option:  ");
            int op = sc.nextInt();
            switch (op){
                case 1:System.out.println("Enter the size of Db: ");
                      int size = sc.nextInt();
                      e2.createEmpInDB(size);
                case 2: e2.availableIndex();break;
                case 3:System.out.println("Enter the index number: ");
                    int index = sc.nextInt();
                    e2.addEmployee(index);break;
                case 4:e2.DisplayAllEmp();break;
                case 5:System.out.println("Enter the Employee id: ");
                      int eid = sc.nextInt();
                      e2.getEmployeeDetailsById(eid); break;
                case 7: System.out.println("====Thank you visit again=====");
                    System.exit(0);

                default:System.out.println("Invalid input");
            }
        }
    }

}
