// File: TestCustomException.java
package org.example.exceptionHandling;

public class TestCustomException {
    public static void main(String[] args) {
        try {
            // Here we "throw" our custom exception
            throw new MyException("This is my custom exception!");
        } catch (MyException e) {
            // Here we "catch" the exception and print the message
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
