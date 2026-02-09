package org.example.basic;

public class staticOverideB extends staticOverideA{
    static void method(){
        System.out.println("child class method");
    }
    public static void main(String[] args) {
        //staticOverideB b=new staticOverideB();
        staticOverideA a=new staticOverideA();
        a.method();
        //b.method();
    }
}
