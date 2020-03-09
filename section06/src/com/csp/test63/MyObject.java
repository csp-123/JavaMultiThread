package com.csp.test63;

/**
 * 静态内部类获取单例
 * @author csp
 * @email chengsipeng@ebaolife.com
 * @date 2020/3/9
 */
public class MyObject {

    private MyObject() {

    }

    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }
}
