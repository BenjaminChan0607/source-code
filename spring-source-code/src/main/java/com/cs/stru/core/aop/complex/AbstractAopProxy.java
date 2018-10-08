package com.cs.stru.core.aop.complex;

import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.aop.framework.AopProxy;

/**
 * @author benjaminChan
 * @date 2018/10/8 0008 下午 4:18
 */
public class AbstractAopProxy implements AopProxy{

    protected AdvisedSupport advisedSupport;

    @Override
    public Object getProxy() {
        return null;
    }

    @Override
    public Object getProxy(ClassLoader classLoader) {
        return null;
    }
}
