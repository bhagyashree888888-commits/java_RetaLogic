package org.example.basic;

public class constructorOverload {

    public   constructorOverload()
    {
        System.out.println("overloaded constructor");
    }
    public   constructorOverload( String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args) {

      constructorOverload obj=new constructorOverload();
      constructorEx obj1=new constructorEx("2nd overloaded constructor");



    }
}
