package org.example.exceptionHandling;

public class throwsEx {

        public static void main(String[] args) {
            try {
                int balance = 1000;
                int withdraw = 2000;

                if (withdraw > balance) {
                    throw new Exception("Insufficient balance");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


