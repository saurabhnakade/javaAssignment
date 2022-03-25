package com.kunal;

public class DefData {

    public static void main(String[] args) {
        Trial t1= new Trial();
        t1.print();

    }
}
class Trial{
    int i;
    double d;
    float f;

    char c;
    boolean b;

    void print(){
        System.out.println("Default Value of Integer: "+i);
        System.out.println("Default Value of Double: "+d);
        System.out.println("Default Value of Float: "+f);
        System.out.println("Default Value of Character: "+c);
        System.out.println("Default Value of Boolean: "+b);
    }

}
