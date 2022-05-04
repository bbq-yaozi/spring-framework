package com.yaozi.demo;

import com.yaozi.demo.beans.Hello;
import com.yaozi.demo.model.User;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyApplication {
	public static void main(String[] args) {
		/**
		 * XmlBeanFactory 继承自DefaultListableBeanFactory，内部有XmlBeanDefinitionReader。
		 * 1、DefaultListableBeanFactory：是整个bean加载的核心，是Spring注册及bean加载的默认实现。
		 * 2、XmlBeanDefinitionReader：支持XML配置文件的读取。
		 */
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Hello bean1 = factory.getBean(Hello.class);
		bean1.sayHello();

		User testUser = (User) factory.getBean("testUser");
		System.out.println(testUser);

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello bean = context.getBean(Hello.class);
		bean.sayHello();
	}
}
