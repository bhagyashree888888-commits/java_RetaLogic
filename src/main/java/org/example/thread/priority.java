package org.example.thread;

public class priority extends Thread {

    @Override
    public void run()
    {
        System.out.println("default method ");
    }
    public static void main(String[] args) {
        new priority().run();

    }
}
