package com.csp.test2_2;

public class Service {
    public synchronized static void printA() {
        try {
            System.out.println("printA getLock time=" + System.currentTimeMillis() + " run ThreadName="
                    + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("printA releaseLock time=" + System.currentTimeMillis() + " run ThreadName="
                    + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printB() {
        synchronized (Service.class) {
            System.out.println("printB getLock time=" + System.currentTimeMillis() + " run ThreadName="
                    + Thread.currentThread().getName());
            System.out.println("printB releaseLock time=" + System.currentTimeMillis() + " run ThreadName="
                    + Thread.currentThread().getName());
        }
    }

    public static void printC() {
        System.out.println("printC getLock time=" + System.currentTimeMillis() + " run ThreadName="
                + Thread.currentThread().getName());
        System.out.println("printC releaseLock time=" + System.currentTimeMillis() + " run ThreadName="
                + Thread.currentThread().getName());
    }
}
