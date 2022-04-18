package com.yaozi.demo;

import com.yaozi.demo.beans.Hello;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello bean = context.getBean(Hello.class);
		bean.sayHello();

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Hello bean1 = factory.getBean(Hello.class);
		bean1.sayHello();
	}
}
