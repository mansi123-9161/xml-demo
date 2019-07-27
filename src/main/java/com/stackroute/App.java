package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static java.lang.System.*;
// From the constructor-injection branch of spring-xml-demo repo create a
// autowire-xml branch.
// For the Movie bean, delete the constructor based object injection in the bean definition file
// (beans.xml) that injects an Actor bean.
// Use autowire byName in the Movie bean to inject an Actor bean.
// Run the application.
// Create another Movie bean and try autowire byType.
// Run the application and note the exception thrown.
// Fix the Movie bean by removing autowire byType and using constructor injection instead.
// Push the code to autowire-xml branch.
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext;
        applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=  applicationContext.getBean("movie1",Movie.class);
        out.println( movie1.getActor());

       Movie movie2=  applicationContext.getBean("movie1",Movie.class);
         out.println( movie2.getActor());
        out.println(movie1==movie2);

//        XmlBeanFactory value;
//        value = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie1=value.getBean("movie",Movie.class);
//        out.println(movie1.getActor());

       // RootBeanDefinition beanDefinition=new RootBeanDefinition();
    }
}
