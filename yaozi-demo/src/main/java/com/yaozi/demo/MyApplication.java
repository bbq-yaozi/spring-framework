package com.yaozi.demo;

import com.yaozi.demo.beans.Hello;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello bean = applicationContext.getBean(Hello.class);
		bean.sayHello();


		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Hello hello = beanFactory.getBean(Hello.class);
		hello.sayHello();
	}
}
