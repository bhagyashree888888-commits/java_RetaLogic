package org.example.thread;

public class runnableLamda implements Runnable {

    public static void main(String[] args) {
        //Thread t = new Thread(new runnableLamda());
        //t.start();
        Runnable r = () -> {
            System.out.println("Thread running using lambda expression");
        };

        //Thread t = new Thread(r);
        Thread t1 = new Thread(new runnableLamda());

        t1.start();
    }
    @Override
    public void run() {
        System.out.println("Implement Runnable and override run(), OR\n" +
                "\n" +
                "Directly use a Runnable lambda expression\n" +
                "\n" +
                "Both are valid because:\n" +
                "\n" +
                "Runnable is a functional interface (has exactly one abstract method: run())");
    }
}
