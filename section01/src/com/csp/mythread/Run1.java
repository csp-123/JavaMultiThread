package com.csp.mythread;

public class Run1 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                if(Thread.currentThread().isInterrupted()) {
                    System.out.println("线程终止");
                    break;
                }
                System.out.println("i=" + i);
            }
        });

        t1.start();
        Thread.sleep(10);
        t1.interrupt();
        System.out.println("是否停止1？ = " + t1.isInterrupted());
        System.out.println("是否停止2？ = " + t1.isInterrupted());
        /*Thread.currentThread().interrupt();
        System.out.println("是否停止3？ = " + Thread.interrupted());
        System.out.println("是否停止4？ = " + Thread.interrupted());*/
    }
}
