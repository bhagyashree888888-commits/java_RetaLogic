package org.example.basic;

public class constructorEx {

    constructorEx()
    {
        String s = "default constrcutor ";
        System.out.println(s);
    }

    String bb;
    constructorEx(String b)
    {
        bb = b;
        System.out.println(bb);
    }

    public  static void main(String[] args) {

       constructorEx a=new constructorEx();
        constructorEx aa=new constructorEx("parameter constructor");

    }
}
