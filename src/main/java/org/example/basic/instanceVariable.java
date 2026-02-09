package org.example.basic;

public class instanceVariable {

    String BranchName;
    static int accNo;
    double balance;

    static void method(){
        accNo=3345;
        //BranchName="karad";  here we trying to access instance variable but bez of non-static it is not accessible
        System.out.println("it is static method");
    }
    public static void main(String[] args) {

        instanceVariable i =new instanceVariable();
        i.accNo=186077536;
        instanceVariable i1=new instanceVariable();
        i1.BranchName="USA : TEXAX";
        i1.balance=738578325;
        i1.accNo=253461254;
        System.out.println(" It prints the object reference (hashcode), ");
        System.out.println(i1);
        System.out.println(i);
        System.out.println("----------------------------------------------------");
        System.out.println(i.accNo);
        System.out.println("----------------------------------------------------");
        System.out.println(i1.accNo +"\n"+ i1.balance + "\n" + i1.BranchName);


    }
}
