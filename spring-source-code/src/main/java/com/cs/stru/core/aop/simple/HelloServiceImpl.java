package com.cs.stru.core.aop.simple;

/**
 * @author benjaminChan
 * @date 2018/10/8 0008 下午 3:19
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("hello!");
    }
}
