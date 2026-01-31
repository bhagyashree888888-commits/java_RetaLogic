package org.example.exceptionHandling;

public class tryeg {
    public static void main(String[] args) {

        int a=10;
        int b=0;
        //int c=a/b;
       // int d=b/a;System.out.println(d);//0
        try {
            int c=a/b;
        System.out.println(c);}
        //String s="no any code bet try catch";
        catch (ArithmeticException e) {
            System.out.println(e.getMessage()+" "+"error details");
        }
        System.out.println("checked exception check at compile time");

    }

}
