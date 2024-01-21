package jspiders.p1;

import java.util.Scanner;

public class EmpServiceImp implements EmpService {
    Scanner sc = new Scanner(System.in);
    Employee[] DB;
    @Override
    public void createEmpInDB(int size) {
        DB = new Employee[size];
        System.out.println("your database of size "+size+" created");
    }

    @Override
    public void availableIndex() {
        int c=0;
        for(int i=0;i<DB.length; i++){
            if(DB[i]==null){
                System.out.print(i+" ");
                c++;
            }
        }
        if(c==0){
                System.out.println("Database is Full..!!");
        }
        System.out.println();
    }

    @Override
    public void addEmployee(int index) {
        if(index >= DB.length){
            System.out.println("invalid Index number.");
        }
       else if(DB[index]!=null){
            System.out.println("Its already accuppied");
        }
       else{
           System.out.println("Enter Emp id: ");
           int eid = sc.nextInt();
           System.out.println("Enter Emp Name: ");
           String name=sc.next();
           System.out.println("Enter Emp desgn: ");
           String dsg = sc.next();
           System.out.println("Enter Emp Sal: ");
           double sal = sc.nextDouble();
           System.out.println("Enter The Emp Age: ");
           int age = sc.nextInt();
           Employee e4 = new Employee(eid,name,dsg,sal,age);
           DB[index]=e4;
           System.out.println("Employee had been successfully added.");

        }

    }

    @Override
    public void DisplayAllEmp() {
        int c=0;
        for(int i=0; i<DB.length; i++){
            if(DB[i]!=null){
                System.out.println(DB[i]);
                c++;
            }
            if(c==0){
                System.out.println("DataBase is empty.");
            }
        }

    }

    @Override
    public void getEmployeeDetailsById(int eid) {
        int c=0;
        for(int i=0; i<DB.length; i++){
            if(DB[i]!=null) {
                if (DB[i].geteId() == eid) {
                    System.out.println(DB[i].geteId() + " " + DB[i].getEname() + " " + DB[i].getSal() + " " + DB[i].getAge() + " " + DB[i].getDesgn());
                    c++;
                }
                else{
                    System.out.println("Employee id not available");
                    break;
                }
            }
            if(c==0){
                System.out.println("DataBase is Empty");
            }
        }
    }
}
