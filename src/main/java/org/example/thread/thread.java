package org.example.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class thread extends Thread{
    public void run()   {
        System.out.println(" • Priority is only a suggestion, not a command\n " +
                "• Actual execution order depends on the OS scheduler,\n "
    + "default priority is 5");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
         thread th=new thread();
         th.run();
         Thread t=new Thread(() -> {
             System.out.println("Lambda Expression");
         });
        //t.start();   // starts thread
        t.run();     // normal method call (no new thread)
        t.join();    // wait for thread to finish
        t.sleep(4000); // pause thread
        t.getName();
        t.getId();




    }
}
