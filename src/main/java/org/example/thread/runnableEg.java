package org.example.thread;

public class runnableEg implements Runnable{
    @Override
    public void run() {
        System.out.println("it is only a task ,not thread \n" + "it is functional interface ");
    }
    public static void main(String[] args){
        System.out.println();
        runnableEg r= new runnableEg();
        Thread t=new Thread(r);
        t.run();
    }


}
