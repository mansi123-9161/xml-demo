package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing the bean life cycle");
    }
// this method does not print in first part of question
    @Override
    public void destroy() throws Exception {
        System.out.println("destroying bean");
    }
    //customDistroy method did not execue here after 2nd phase of question
    public void customInit()
    {
        System.out.println("Custom Bean Initialization method ... ");
    }
    public void customDestroy()
    {

        System.out.println("Custom Bean Destroy method ... ");
    }

}
