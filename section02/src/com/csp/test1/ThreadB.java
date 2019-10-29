package com.csp.test1;

public class ThreadB extends Thread {
    private Service service;
    private MyObject myObject;

    public ThreadB(Service service, MyObject myObject) {
        super();
        this.service = service;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(myObject);
    }
}
