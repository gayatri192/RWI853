package com.rwi.priorityThread;

class PriorityThreadEx extends Thread {
    public PriorityThreadEx(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <=3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        }
    }
}

public class PriorityThread {

	public static void main(String[] args) {
		
        PriorityThreadEx t1 = new PriorityThreadEx("Thread 1");
        PriorityThreadEx t2 = new PriorityThreadEx("Thread 2");
        PriorityThreadEx t3 = new PriorityThreadEx("Thread 3");

        
        t1.setPriority(Thread.MIN_PRIORITY); // Minimum priority (1)
        t2.setPriority(Thread.NORM_PRIORITY); // Normal priority (5)
        t3.setPriority(Thread.MAX_PRIORITY); // Maximum priority (10)
        
        t1.start();
        t2.start();
        t3.start();

    }
}