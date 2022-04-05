package com.yaozi.demo;

import com.yaozi.demo.beans.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello bean = applicationContext.getBean(Hello.class);
		bean.sayHello();
	}
}
