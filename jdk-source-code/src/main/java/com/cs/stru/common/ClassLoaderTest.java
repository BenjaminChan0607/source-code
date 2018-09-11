package com.cs.stru.common;

/**
 * @author benjaminChan
 * @date 2018/8/23 0023 下午 3:37
 *
 * 类加载机制
 * JVM把class文件加载到内存，并对数据进行校验，解析，初始化，成为JVM可以使用的Java类型的过程就是加载机制
 * 类从被加载到内存到从内存中卸载出去，生命周期包括：加载，验证，准备，解析，初始化，使用，卸载七个阶段，验证，准备，解析统称为链接
 *
 * 类加载器用来将Java字节码加载到Java虚拟机中
 * .java 经由 javac 编译成 java字节码文件 .class 类加载器负责读取Java字节码文件并转换成java.lang.Class的一个实例即代表java类；
 */
public class ClassLoaderTest {


}
