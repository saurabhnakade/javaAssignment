package com.kunal;

import java.util.Scanner;

class MathOpr{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a, b;
        double ans=0;
        System.out.println("Enter two integers");
        a = sc.nextInt();
        b = sc.nextInt();

        while(true)
        {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Divsion");
            System.out.println("5. Square");
            System.out.println("6. Square root");
            System.out.println("7. Exit");

            System.out.println("Select your choice");
            int x = sc.nextInt();

            switch(x)
            {
                case 1: ans = a+b;
                    System.out.println("Addition of two numbers is : " + ans);
                    break;
                case 2: ans = a-b;
                    System.out.println("Subtraction of two numbers is : " + ans);
                    break;
                case 3: ans = a*b;
                    System.out.println("Mutiplication of two numbers is : " + ans);
                    break;
                case 4: ans = a/b;
                    System.out.println("Division of two numbers is : " + ans);
                    break;
                case 5: ans = a*a;
                    System.out.println("Square of a is : " + ans);
                    break;
                case 6: ans = Math.sqrt(a);
                    System.out.println("Square root of a is : " + ans);
                    break;
                case 7: System.exit(0);
                    System.out.println("Thank You !");
                    break;
            }
        }
    }
}