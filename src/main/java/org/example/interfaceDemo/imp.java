package org.example.interfaceDemo;

public class imp implements payment{
    public static void main(String[] args) {
        imp obj = new imp();
        obj.pay();
    }
    @Override
    public void pay() {
        System.out.println("Hello from Interface");
    }
}
