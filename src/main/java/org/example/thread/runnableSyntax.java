package org.example.thread;

public class runnableSyntax {


    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Running...");
        });
        t.start();

    }
}
