package com.csp.test4202;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2020/1/6 19:37
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
