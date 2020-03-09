package com.csp.test63;

/**
 * @author csp
 * @email chengsipeng@ebaolife.com
 * @date 2020/3/9
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
