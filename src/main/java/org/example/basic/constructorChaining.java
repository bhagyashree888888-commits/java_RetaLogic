package org.example.basic;

public class constructorChaining {

    String name;
    int AccNO;
    double balance;
    public constructorChaining(String n,int A)
    {
        this.name=n;
        this.AccNO=A;
        System.out.println(name + " " + AccNO + 00.00);
    }
    public constructorChaining(String n,int A,double b)
    {
        this.name=n;
        this.AccNO=A;
        this.balance=b;
        System.out.println(name + " " + AccNO +" "+ balance);
    }
//    String AccholderName;
//    int AN;
//    double bal;
//    public constructorChaining(String name,int Acc)
//    {
//        AccholderName=name;
//        AN=Acc;
//        System.out.println(AccholderName +AN+ 00.00);
//    }
//    public constructorChaining(String na,int Ano,double ba)
//    {
//       AccholderName=na;
//       AN=Ano;
//       bal=ba;
//        System.out.println(AccholderName + " " + AN +" "+ bal);
//    }
    public static void main(String[] args) {
        constructorChaining c1=new constructorChaining("owner",111111111);
        constructorChaining c=new constructorChaining("owner",111111,3456764567878.00);
    }
}
