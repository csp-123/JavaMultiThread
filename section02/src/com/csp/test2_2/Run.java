package com.csp.test2_2;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("b");
        threadB.start();
        ThreadC threadC = new ThreadC(service);
        threadC.setName("b");
        threadC.start();
    }
}
