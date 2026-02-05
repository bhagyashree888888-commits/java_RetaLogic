package org.example.thread;

class LifeCycleDemo implements Runnable {

    static final Object lock = new Object();

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " RUNNING");

            // TIMED_WAITING
            Thread.sleep(1000);

            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " acquired lock");

                // WAITING
                lock.wait();

                System.out.println(Thread.currentThread().getName() + " resumed after wait");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " TERMINATED");
    }

    public static void main(String[] args) throws Exception {

        // NEW
        Thread t1 = new Thread(new LifeCycleDemo(), "Thread-1");
        Thread t2 = new Thread(new LifeCycleDemo(), "Thread-2");

        System.out.println(t1.getState()); // NEW

        // RUNNABLE
        t1.start();
        t2.start();

        // BLOCKED (t2 waits for lock)
        Thread.sleep(500);

        synchronized (lock) {
            System.out.println("Main thread holding lock");
            Thread.sleep(2000); // keeps lock → other thread BLOCKED
        }

        // Wake waiting thread
        synchronized (lock) {
            lock.notify();
        }

        // WAITING (main waits for t1)
        t1.join();

        System.out.println("Main thread ends");
    }
}

