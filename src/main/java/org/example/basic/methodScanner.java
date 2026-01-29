package org.example.basic;

import java.util.Scanner;

public class methodScanner {

    void calculate (){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter product price : ");
        double price = sc.nextDouble();
        //System.out.println("product price " +price );

        System.out.println("enter product discount percentage :");
        double dis =sc.nextDouble();
        double actual_Amount= price - (price * 50 /100 ) ;
        if (actual_Amount < 2500){
            double gross = (actual_Amount * 5 / 100) + actual_Amount;
            System.out.println("product Price is : " + price + "discount is : 50% off "+ " total price is :" + gross );
        }
        else {
            double gross = (actual_Amount * 18 / 100) + actual_Amount;
            System.out.println("product Price is : "+price + "discount is : 50% off "+ " total price is :" +  gross );

        }
        // Calculate GST based on price slabs ://another way to write
//        double gstRate;
//        if (total <= 2500) {
//            gstRate = 5;
//        } else {
//            gstRate = 18;
//        }
//        double gross = total + (total * gstRate / 100);

    }

    public static void main(String[] args) {
        methodScanner m =new methodScanner();
        m.calculate();

    }
}
