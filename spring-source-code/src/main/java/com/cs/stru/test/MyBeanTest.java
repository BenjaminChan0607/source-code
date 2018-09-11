package com.cs.stru.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author benjaminChan
 * @date 2018/9/10 0010 下午 3:22
 *
 * BeanFactory
 * ApplicationContext
 */
public class MyBeanTest {

    @Test
    public void test() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        MyBean myBean = (MyBean) beanFactory.getBean("myBeanS");
        System.out.println(myBean.getStr());
    }
}
