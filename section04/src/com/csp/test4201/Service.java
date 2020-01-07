package com.csp.test4201;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2020/1/6 19:34
 */
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
