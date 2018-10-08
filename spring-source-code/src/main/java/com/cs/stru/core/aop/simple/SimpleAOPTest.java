package com.cs.stru.core.aop.simple;

/**
 * @author benjaminChan
 * @date 2018/10/8 0008 下午 3:20
 *
 * AOP：前置切面
 * 1）定义一个包含切面逻辑的对象
 * 2）定义Advice对象（实现了InvocationHandler），将目标对象和Advice的实现作为构造参数
 * 3）将目标对象和Advice的实现对象传递给JDK动态代理方法，为目标对象生成代理
 */
public class SimpleAOPTest {

    public static void main(String[] args) {
        MethodInvocation logTask = new MethodInvocation() {
            @Override
            public void invoke() {
                System.out.println("log task start!");
            }
        };

        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();
        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl, logTask);
        HelloService helloService = (HelloService) SimpleAOP.getProxy(helloServiceImpl, beforeAdvice);
        helloService.sayHello();
    }
}
