package org.example.basic;

public class objAsArgumentPass {

    void innerClass() {
        System.out.println("in inner class method");
    }

    // method that receives object as argument
    static void display(objAsArgumentPass obj) {
        obj.innerClass();   // using the passed object
    }

    public static void main(String[] args) {

        objAsArgumentPass a = new objAsArgumentPass();

        display(a);   // passing object
    }
}
