package org.example.basic;

public class classDemo {

    class product {           // Class names should start with uppercase by convention
        int a = 11;

    }

    public static void main(String[] args) {
        classDemo p = new classDemo();        // Outer class object
        product prod = p.new product();       // Inner class object
        System.out.println(prod.a);           // Access a through inner class object

    }
}
