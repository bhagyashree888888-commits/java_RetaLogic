package org.example.exceptionHandling;

//public class throwVSthrows {
//
//    static void divide() throws ArithmeticException {
//        int a = 10 / 0;   // JVM throws ArithmeticException automatically
//    }
//    public static void main(String[] args) {
//        divide();
//        System.out.println("This line will not execute");
//}
//}

import java.io.IOException;

public class throwVSthrows {

    // throw
    static void divide() {
        int a = 10 / 0;   // JVM throws ArithmeticException here
        System.out.println("before line of unreachable statement code");
        throw new ArithmeticException("/ by zero"); // ❌ never reached
        //System.out.println("unreachable code "); //compile time error
    }
 static void call(){
     System.out.println("here is call method");
 }
    public static void main(String[] args) {
//        throwVSthrows.call();
        divide();
        throwVSthrows.call();
        System.out.println("This line will not execute");
        //checked excp
//        try {
//            int a = 10 / 2;   // no checked exception possible
//        } catch (IOException e) {
//            System.out.println("Error");
//        }
        try {
            int a = 10 / 2;
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }


    }
}


