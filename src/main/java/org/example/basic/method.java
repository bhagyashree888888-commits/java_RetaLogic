package org.example.basic;

public class method {

    void sum()
    {
        int a = 1000;
        int offPercent = 50 ;
        int discount = a * 50 /100 ;
        int  total = a - discount ;
        int gross;
        if (total < 2500){
             gross = (total * 5 /100) + total;
        }
        else {
             gross = (total * 18/100) + total;
        }
        //int gross = (total * tax/100) + total;

        System.out.println("total price is : " + gross);

    }

    public static void main(String[] args) {
        method m =new method();
        m.sum();
    }
}
