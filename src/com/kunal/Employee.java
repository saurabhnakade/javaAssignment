package com.kunal;

public class Employee {
    private String fName;
    private String lName;
    private double mSalary;

    Employee(String fName, String lName, double salary){
        this.fName=fName;
        this.lName=lName;
        this.mSalary =salary;
    }

    void EmployeeTest(){
        System.out.println("Employee name is "+fName+" "+lName);
        System.out.println("Employee's monthly salary is "+mSalary);
    }

    String getFName(){
        return fName;
    }
    String getLName(){
        return lName;
    }
    double getSalary(){
        return mSalary;
    }

    void setFName(String fName){
        this.fName=fName;
    }
    void setLName(String lName){
        this.lName=lName;
    }
    void setSalary(double salary){
        if(salary>=0){
            this.mSalary =salary;
        }else{
            this.mSalary =0;
        }
    }

    public static void main(String[] args) {
        Employee e1=new Employee("Meet","Patel",300);
        Employee e2=new Employee("Saurabh","Nakade",400);

        System.out.println("e1's yearly salary is "+e1.getSalary()*12);
        System.out.println("e2's yearly salary is "+e2.getSalary()*12);

        System.out.println();

        System.out.println("e1's yearly salary after 15% increment "+(e1.getSalary()*12*1.15));
        System.out.println("e2's yearly salary after 15% increment "+(e2.getSalary()*12*1.15));

        System.out.println();

        e1.EmployeeTest();
        System.out.println();
        e2.EmployeeTest();

    }
}
