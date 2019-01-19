package com.cs.stru.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author benjaminChan
 * @date 2018/9/10 0010 下午 3:22
 * <p>
 * BeanFactory
 * ApplicationContext
 *
 * BeanFactory/ApplicationContext
 */
public class SpringTest {

    @Test
    public void test() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        Hello hello = (Hello) beanFactory.getBean("hello");
        System.out.println(hello.getStr());
    }

    @Test
    public void testSelfTag() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user.xml");
        User user = (User) applicationContext.getBean("testBean");
        System.out.println(user.getUserName() + "," + user.getEmail());
    }

    @Test
    public void testCircle() {
        try {
            new ClassPathXmlApplicationContext("circle.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
