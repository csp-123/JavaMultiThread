package com.csp.test1;

public class Run1_1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(service, object);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(service, object);
        threadB.setName("b");
        threadB.start();
    }
}
