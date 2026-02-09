package org.example.basic;

public class staticAcessVariable {
    static int a;
   int b=1;
//a=77; error
    static  int c=12;
    static int d=33;
    public  static void main(String[] args) {
       // a = 8;
        System.out.println(a);
        System.out.println(staticAcessVariable.a);//assigned zero here by default
        System.out.println(staticAcessVariable.c);
        //System.out.println(staticAcessVariable.d); //2 ways to acess :1 is class.variable name
        staticAcessVariable s=new staticAcessVariable();
        System.out.println(s.a);     //2 way is obj wia
        //System.out.println(b);//here instance variable req obj creted to acess
        System.out.println(s.b);
    }
}
