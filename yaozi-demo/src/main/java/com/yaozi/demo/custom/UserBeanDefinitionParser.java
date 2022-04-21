package com.yaozi.demo.custom;

import com.yaozi.demo.model.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String userId = element.getAttribute("userId");
		String userName = element.getAttribute("userName");

		if(StringUtils.hasText(userId)) {
			builder.addPropertyValue("userId", userId);
		}
		if(StringUtils.hasText(userName)) {
			builder.addPropertyValue("userName", userName);
		}
	}
}
