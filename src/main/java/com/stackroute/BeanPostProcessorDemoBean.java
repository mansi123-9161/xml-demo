package com.stackroute;

import org.springframework.beans.factory.config.BeanPostProcessor;

import static java.lang.System.*;

public class BeanPostProcessorDemoBean implements BeanPostProcessor{
@Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
    {
        out.println("after Initialization process "+beanName);
        return  bean;
    }
    @Override
    public  Object postProcessBeforeInitialization(Object bean, String beanName)
    {
        out.println("before Initialization process "+beanName);
        return bean;
    }
}
