package com.cs.stru.core.aop.simple;

import com.cs.stru.core.ioc.simple.SimpleIOC;

import java.lang.reflect.Proxy;

/**
 * @author benjaminChan
 * @date 2018/10/8 0008 下午 3:17
 */
public class SimpleAOP {

    public static Object getProxy(Object bean, Advice advice) {
//        Exception in thread "main" java.lang.IllegalArgumentException: com.cs.stru.core.aop.simple.SimpleAOP is not an interface jdk动态代理代理的是接口，CGlib代理可以代理类
//        return Proxy.newProxyInstance(SimpleIOC.class.getClassLoader(), new Class<?>[]{SimpleAOP.class}, advice);
        return Proxy.newProxyInstance(SimpleIOC.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}
