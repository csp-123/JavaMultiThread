package com.csp.test63;

/**
 * @author csp
 * @email chengsipeng@ebaolife.com
 * @date 2020/3/9
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
