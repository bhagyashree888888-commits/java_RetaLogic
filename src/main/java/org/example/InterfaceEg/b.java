package org.example.InterfaceEg;

public class b implements a.payment {
    @Override
    public void pay() {
        System.out.println("payment");

    }

    public static void main(String[] args) {
        b obj=new b();
        obj.pay();
    }
}
