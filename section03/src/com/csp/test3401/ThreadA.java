package com.csp.test3401;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2019/12/19 20:36
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
