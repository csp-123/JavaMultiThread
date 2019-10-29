package com.csp.test2_2_10;

public class Service {

    public static void print(String str) {
        try {
            synchronized (str) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
