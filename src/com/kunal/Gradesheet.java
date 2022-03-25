package com.kunal;

import java.util.Scanner;

public class Gradesheet {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String colName=scn.nextLine();
        String student=scn.nextLine();
        int rollNo=scn.nextInt();

        int percent=0;

        int[] marks=new int[5];
        for(int i=0;i<5;i++){
            marks[i]=scn.nextInt();
            percent+=marks[i];
        }

        percent/=5;



        System.out.println("Name of college : "+colName);
        System.out.println("Student name : "+student);
        System.out.println("Roll No : "+rollNo);

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
