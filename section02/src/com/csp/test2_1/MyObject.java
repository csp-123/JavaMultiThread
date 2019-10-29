package com.csp.test2_1;

public class MyObject {

    public synchronized void speedPrintString() {
        System.out.println("speedPrintString getLock time=" + System.currentTimeMillis() + " run ThreadName="
                + Thread.currentThread().getName());
        System.out.println("----------------------------");
        System.out.println("speedPrintString releaseLock time=" + System.currentTimeMillis() + " run ThreadName="
                + Thread.currentThread().getName());
    }
}
