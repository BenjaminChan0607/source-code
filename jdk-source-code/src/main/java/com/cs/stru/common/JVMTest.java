package com.cs.stru.common;

/**
 * @author benjaminChan
 * @date 2018/8/23 0023 下午 3:10
 *
 * JVM内存管理和JVM垃圾回收
 *
 * JVM内存结构（内存组成）：堆，栈，本地方法栈，方法区组成
 * new创建的对象都在堆中分配，大小可以通过 -Xmx和-Xms 来控制
 * 每个线程执行每个方法时会在栈中申请一个栈帧，用来存放临时变量，参数和中间结果
 * 本地方法栈用于支持native方法的执行
 * 方法区存放了要加载的类信息，静态变量，final常量，属性和方法信息，可以通过 XX:PermSize和-XX:MaxPermSize 来指定最大最小值
 *
 * JVM的垃圾回收机制
 *
 *
 */
public class JVMTest {
}
