package org.example.overrideing;

public class Acquirer extends merchant {
    @Override
    void  payment(double amt){

        System.out.println("validating request ");
        System.out.println("request verified successfully... ");
        System.out.println("----------------------------------------");

    }

}
