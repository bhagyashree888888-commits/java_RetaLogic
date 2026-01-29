package org.example.basic;

public class syntaxes {
    //class syntax
//    public class ClassName {
//        // fields
//        // constructors
//        // methods
//    }

//    //Method Syntax
//    accessModifier returnType methodName(parameters) {
//        // method body
//    }

    //constructor syntax
//    accessModifier ClassName(parameters) {
//        // constructor body
//    }
    public static class Product {

        String item;

        // Constructor
        public Product(String itemName) {
            item = itemName;
        }

        // Method
        public void displayItem() {
            System.out.println(item);
        }

        public static void main(String[] args) {
            Product p = new Product("earbuds"); // constructor runs
            p.displayItem();                     // method runs
        }
    }

}
