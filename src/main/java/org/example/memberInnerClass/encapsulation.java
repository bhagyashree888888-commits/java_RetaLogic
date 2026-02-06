package org.example.memberInnerClass;

public class encapsulation {

    private int accNo;
    private double balance;
    //accNo = 2234;
    // balance = 2234;
    private  void crediential(int an,double bal){
        accNo =accNo ;
        balance=bal;
    }
    void set(){
        accNo= 1860550;
        balance=1860550;
        System.out.println(accNo
        +" "+balance);
    }
    public static void main(String[] args) {
        encapsulation obj=new encapsulation();
        obj.set();
    }
}
