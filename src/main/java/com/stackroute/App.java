package com.stackroute;

import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


import static java.lang.System.*;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext;
        applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=  applicationContext.getBean("movie1",Movie.class);
        out.println( movie1.getActor());

        Movie movie2=  applicationContext.getBean("movie2",Movie.class);
        out.println( movie2.getActor());
   

//        XmlBeanFactory value;
//        value = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie1=value.getBean("movie",Movie.class);
//        out.println(movie1.getActor());

       // RootBeanDefinition beanDefinition=new RootBeanDefinition();
    }
}
