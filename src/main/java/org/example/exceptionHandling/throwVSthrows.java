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

public class throwVSthrows {

    // throw
    static void divide() {
        int a = 10 / 0;   // JVM throws ArithmeticException here
        throw new ArithmeticException("/ by zero"); // ❌ never reached
    }

    public static void main(String[] args) {
        divide();
        System.out.println("This line will not execute");
    }
}


