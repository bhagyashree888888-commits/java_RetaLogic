package org.example.abstractEx;

public abstract class a {

    double gst;
    double price;
    double discount;
    double gross;

     abstract void gst();

     abstract void discount();

     abstract void pay();

     void debit() {
         System.out.println("debit");
     }
     abstract void credit();
}
