package com.cs.stru.common;

/**
 * @author benjaminChan
 * @date 2018/8/23 0023 下午 2:50
 * <p>
 * static详解
 * static用途：方便在没有创建对象的情况下来调用方法，只要类被加载，可以通过类名取访问，static代码块可以用来优化程序性能
 * 静态方法不能访问非静态方法，因为非静态方法都是依赖于对象(this)来访问的
 * static变量被所有对象共享，内存中只有一个副本，仅在类初次加载时初始化，非静态变量则在没有对象中都有自己的副本
 * static成员的初始化顺序是按照定义的顺序开始加载的
 */
public class StaticTest {


    static {
        b = 1;
    }

    private static int a = 1;
    private static int b;


    public static void main(String[] args) {
        System.out.println(b + "," + a);
    }
}
