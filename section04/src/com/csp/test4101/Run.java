package com.csp.test4101;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2019/12/20 14:15
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread(myService);
            myThread.start();
        }
    }
}
