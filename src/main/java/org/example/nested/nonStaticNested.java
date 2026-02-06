package org.example.nested;

import java.util.Scanner;

public class nonStaticNested {

    int balance = 500000;
    int creditA = 700000;
    int debitA = 100000;
    int openingBalance = 1000;
    int enquiryBalance = balance;
    int trasfera;
    int trasferb;


    public  class payment{
        void payment(){
            System.out.println("upi request genrated for 1000 $  for 25488******");
        }
    }
    public  class credit{
        void credit(){
            System.out.println(creditA +"$monery creadited on account 11111******55");
        }
    }
    public  class debit{
        void debit(){
            System.out.println(debitA +"$ money debited from account 11151********77");
        }
    }
    public class moneytrasfer {
        void trasfer(){
            Scanner sc=new Scanner(System.in);
            System.out.println("please choose correct option\n" +" 1. credit amount \n" + " 2. debit amount ");
            int a = sc.nextInt();
            //int b = sc.nextInt();
            if(a == 1 ){
                System.out.println("enter amount to credit :");
                int am=sc.nextInt();
                trasfera = am + balance;
                System.out.println(" amount credited with " + am + "total balance is :" + trasfera);
            }
            else {
                int am1=sc.nextInt();
                trasferb = balance - am1 ;
                System.out.println("amount debited with :" +trasferb);
            }
        }

    }
    public  static void main(String[] args) {
        nonStaticNested bb = new nonStaticNested();
        //nonStaticNested.payment p=new bb.payment();  this is incorrect pls check
        nonStaticNested.payment p = bb.new payment();
        p.payment();
        nonStaticNested.credit c = bb.new credit();
        c.credit();
        nonStaticNested.debit d = bb.new debit();
        d.debit();
        nonStaticNested.moneytrasfer m=bb.new moneytrasfer();
        m.trasfer();
       // nonStaticNested n;

    }
}
