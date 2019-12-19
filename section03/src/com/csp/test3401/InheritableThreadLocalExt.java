package com.csp.test3401;

import java.util.Date;

/**
 * @Description
 * @Author csp
 * @Email chengsipeng@ebaolife.com
 * @CreateTime 2019/12/19 20:34
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "  子线程加的";
    }
}
