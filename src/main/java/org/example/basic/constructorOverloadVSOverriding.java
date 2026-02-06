package org.example.basic;

public class constructorOverloadVSOverriding {
    public constructorOverloadVSOverriding(){
        System.out.println("Constructor overload ");
    }
    public constructorOverloadVSOverriding(int a ,int b){
        System.out.println("Constructor overload ");
    }
    public constructorOverloadVSOverriding(int a){
        int n;
        n=a;
        System.out.println("Constructor overload ");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        constructorOverloadVSOverriding c = new constructorOverloadVSOverriding();


    }
}
