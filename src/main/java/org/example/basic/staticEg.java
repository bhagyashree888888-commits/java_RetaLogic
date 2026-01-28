package org.example.basic;

public class staticEg {
    static int a;
    static {
        System.out.println("static block executed first ");
    }
     static void staticEg (){
         //static int b;
        System.out.println("static method executed later ");
    }
    void staticEg (int aa){
        //static int b;    not allowed
        System.out.println("non-static method executed later " +aa);
    }

    public  static void main(String[] args) {
        a=8;
        a=55;
        System.out.println("static / initializer");
        System.out.println(a);
        staticEg();
        staticEg s =new staticEg();
        s.staticEg(22);

    }
}
