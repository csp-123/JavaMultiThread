package com.csp.test4112.test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2019/12/30 20:24
 */
public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        System.out.println(lock.isHeldByCurrentThread());
        lock.lock();
        System.out.println(lock.isHeldByCurrentThread());
        lock.unlock();
    }
}
