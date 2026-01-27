package org.example.accessSpecifier;

public class a {

    public void publicM(){
        System.out.println("public method ");
    }
     void defaultM(){
        System.out.println("default method ");
    }
    private void privateM(){
        System.out.println("private method ");
    }
    protected void protectedM(){
        System.out.println("protected method ");
    }
     class Dmethod{
        void dmethod(){

        System.out.println("default class ");
    }}
    public static void main(String[] args) {
 a bb= new a();
 bb.defaultM();
 bb.privateM();
 bb.protectedM();
 bb.publicM();
 b aa=new a();
 aa.dm
    }
}
