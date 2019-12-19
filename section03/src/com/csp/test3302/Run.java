package com.csp.test3302;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2019/12/16 20:29
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();

        for (int i = 0; i < 100; i++) {
            Tools.t1.set("Main" + (i + 1));
            System.out.println("Main get Value=" + Tools.t1.get());
            Thread.sleep(200);
        }
    }
}
