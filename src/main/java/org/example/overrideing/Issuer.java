package org.example.overrideing;

public class Issuer extends merchant {
    double a;
    @Override
    void  payment(double amt){
        this.a = amt;
        System.out.println(" for amount payement credited : "+ a );
        System.out.println("Thank you for using digital services" );
        System.out.println("----------------------------------------");

    }
    static void main(String[] args) {
//     Issuer i = new merchant();
//     i.payment(10000);          not valid

//        merchant m;
//
//        m = new merchant();
//        m.payment(10000);
//
//        m = new Acquirer();
//        m.payment(10000);
//
//        m = new Issuer();
//        m.payment(10000);

        merchant mm = new merchant();
        mm.payment(10000);


    }
}
