package com.cs.stru.core.ioc.simple;

/**
 * @author benjaminChan
 * @date 2018/10/8 0008 下午 2:49
 */
public class SimpleIOCTest {

    public static void main(String[] args) throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("spring-simple-test.xml").getFile();
        SimpleIOC bean = new SimpleIOC(location);
        Wheel wheel = (Wheel) bean.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bean.getBean("car");
        System.out.println(car);
    }

}
