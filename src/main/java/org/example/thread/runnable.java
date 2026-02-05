package org.example.thread;

public class runnable implements Runnable{
    @Override
    public void run() {
        System.out.println("runnable");
    }

    public static void main(String[] args) {
        new runnable().run();
    }
}
