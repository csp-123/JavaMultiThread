package com.csp.test3103;

public class Thread1 extends Thread {
    private Object lock;

    public Thread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                System.out.println("start wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("end wait time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
