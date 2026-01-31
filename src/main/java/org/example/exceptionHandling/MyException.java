// File: MyException.java
package org.example.exceptionHandling;

// This is the custom exception
public class MyException extends Exception {
    public MyException(String s) {
        System.out.println("MyException: " + s);
    }
}
