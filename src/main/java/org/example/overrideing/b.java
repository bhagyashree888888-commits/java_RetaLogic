package org.example.overrideing;

public class b extends  a{

    void  a(){
        System.out.println(" b method");
    }

    public static void main(String[] args) {
        a bb=new b();
        bb.a();
    }
}
