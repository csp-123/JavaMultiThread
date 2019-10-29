package com.csp.test2_3_3;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        Thread.sleep(50);
        System.out.println("停止开启的线程 stopThread=" + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
