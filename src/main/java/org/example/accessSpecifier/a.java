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

        System.out.println("default class type here ");
    }}

    public  class  type{
        void type(){
            System.out.println("public class type here ");
        }
    }
    public static void main(String[] args) {
 a bb= new a();
 bb.defaultM();
 bb.privateM();
 bb.protectedM();
 bb.publicM();
 //OuterClass.InnerClass obj = outerObject.new InnerClass();
        // A.Dmethod d = bb.new Dmethod();
 a.Dmethod i=bb.new Dmethod();
 i.dmethod();
 a.type obj=bb.new type();
 obj.type();
    }
}
