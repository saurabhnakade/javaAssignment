package com.kunal;

import java.util.Scanner;

public class Gradesheet {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter Name of college : ");
        String colName=scn.nextLine();

        System.out.println("Enter your name : ");
        String student=scn.nextLine();

        System.out.println("Enter your Roll No : ");
        int rollNo=scn.nextInt();

        int percent=0;

        int[] marks=new int[5];
        System.out.println("Enter 5 subject marks : ");
        for(int i=0;i<5;i++){
            marks[i]=scn.nextInt();
            percent+=marks[i];
        }
        percent/=5;

        System.out.println("Name of college : "+colName);
        System.out.println("Student name : "+student);
        System.out.println("Roll No : "+rollNo);

        System.out.println("Percentage : "+percent);

        if(percent >= 90)
            System.out.println("Grade A");
        else if(percent >= 70)
            System.out.println("Grade B");
        else if(percent >= 50)
            System.out.println("Grade C");
        else if(percent >= 40)
            System.out.println("Grade D");
        else
            System.out.println("Grade Fail");

    }
}
