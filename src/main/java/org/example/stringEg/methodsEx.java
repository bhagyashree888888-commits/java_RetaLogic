package org.example.stringEg;

import java.util.Scanner;

public class methodsEx {
final static int w = 0;
    public static void main(String[] args) {
        String a="data structure";
        System.out.println(a.length());

        int[] b={2,3,4,5,1,0};
        System.out.println(b.length);
        //w =11;
        System.out.println(w);
        System.out.println("----------------------------------------------------");
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        final int MAX_LOGIN_ATTEMPTS = 3;
        int pn = 1234;

        while (attempts < MAX_LOGIN_ATTEMPTS) {

            System.out.println("Enter a pin :");
            int p = sc.nextInt();
            attempts++;

            if (p == pn) {
                System.out.println("correct pin");
                break; // stop asking after success
            } else {
                System.out.println("wrong pin");
            }
        }

        if (attempts == MAX_LOGIN_ATTEMPTS) {
            System.out.println("Login attempts exceeded");
        }


    }
}
