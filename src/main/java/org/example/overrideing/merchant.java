package org.example.overrideing;

public class merchant {
public double amount;
    void  payment(double amt){
        amount = amt;
        System.out.println("welcome to SBI Bank");
        System.out.println("Merchant Payment processing starts .....");
        System.out.println("enter amount to proceeds : ");
        System.out.println("Merchant Payment processing starts for amount :" + amount);
        System.out.println("----------------------------------------");

    }

}
