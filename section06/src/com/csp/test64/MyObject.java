package com.csp.test64;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 序列化和反序列化单例
 * @author csp
 * @email chengsipeng@ebaolife.com
 * @date 2020/3/9
 */
public class MyObject implements Serializable {

    private static final long serialVersionUID = 1L;

    private MyObject() {

    }

    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法");
        return MyObjectHandler.myObject;
    }
}
