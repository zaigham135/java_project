package jspiders.p1;

public class Employee {
    private int eId;
    private String ename;
    private String desgn;
    private double sal;
    private int age;

    public Employee(int eId, String ename, String desgn, double sal, int age) {
        this.eId = eId;
        this.ename = ename;
        this.desgn = desgn;
        this.sal = sal;
        this.age = age;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDesgn() {
        return desgn;
    }

    public void setDesgn(String desgn) {
        this.desgn = desgn;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "eId=" + eId +
                ", ename='" + ename + '\'' +
                ", desgn='" + desgn + '\'' +
                ", sal=" + sal +
                ", age=" + age;
    }
}
