package org.example.accessSpecifier;

public class variableAccessB extends variableAccessA{
    public static void main(String[] args) {
       variableAccessB obj=new variableAccessB();
        System.out.println(obj.d);
        System.out.println(obj.c);
        //System.out.println(obj.b); private variable non-accessible



    }
}
