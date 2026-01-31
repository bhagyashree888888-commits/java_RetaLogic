package org.example.exceptionHandling;

public class throwsEg {
    static void divide() throws ArithmeticException {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
            divide();

        System.out.println("throws is used with method signature");

    }
}
