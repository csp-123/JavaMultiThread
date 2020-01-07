package com.csp.test4112.test1;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2019/12/30 20:17
 */
public class Run {

    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        final Service service2 = new Service(false);
        runnable = new Runnable() {
            @Override
            public void run() {
                service2.serviceMethod();
            }
        };

        thread = new Thread(runnable);
        thread.start();
    }
}
