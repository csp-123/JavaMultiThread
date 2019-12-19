package com.csp.test3401;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2019/12/19 20:38
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("       在Main线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            Thread a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
