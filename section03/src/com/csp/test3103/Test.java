package com.csp.test3103;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread1 t1 = new Thread1(lock);
        t1.start();
        Thread.sleep(3000);
        Thread2 t2 = new Thread2(lock);
        t2.start();
    }
}
