package com.csp.test4112.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2019/12/30 20:14
 */
public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("公平锁情况：" + lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}
