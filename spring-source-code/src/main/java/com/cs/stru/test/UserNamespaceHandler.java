package com.cs.stru.test;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author benjaminChan
 * @date 2018/9/13 0013 下午 3:07
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport{

    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
