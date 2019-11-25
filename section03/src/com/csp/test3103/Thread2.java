package com.csp.test3103;

public class Thread2 extends Thread {
    private Object lock;

    public Thread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("start notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("end notify time=" + System.currentTimeMillis());
        }
    }
}
