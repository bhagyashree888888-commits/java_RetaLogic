package org.example.abstractEx;

public class b extends a{

    public static void main(String[] args) {
        b bb=new b();
        bb.credit();
    }

    @Override
    void gst() {
         gst = (price  -gst/100);
    }

    @Override
    void discount() {
        discount =  (price - discount/100);
    }

    @Override
    void pay() {
           gross = price + gst - discount;
    }

    @Override
    void credit() {
        System.out.println("use credit card services ");
    }


}
