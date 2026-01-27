package org.example.accessSpecifier;

public class variableAccessA {

    int a=77;
    private   int b=88;
    protected int c=44;
    public int d =66;

    public static void main(String[] args) {

        variableAccessA obj=new variableAccessA();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
