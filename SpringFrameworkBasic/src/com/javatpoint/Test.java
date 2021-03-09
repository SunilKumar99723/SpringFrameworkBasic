package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	/*
	 * There are two types of IoC containers: 1. BeanFactory 2. ApplicationContext (Both are Interfaces)
	 */
	
//	1. BeanFactory 
//	Resource resource=new ClassPathResource("applicationContext.xml");
//	BeanFactory factory=new XmlBeanFactory(resource);
//	Student student=(Student)factory.getBean("studentbean");
//	student.displayInfo();
	
	/*
	 * 2. ApplicationContext - The ApplicationContext interface is built on top of
	 * the BeanFactory interface. It adds some extra functionality than BeanFactory
	 * such as simple integration with Spring's AOP, message resource handling (for
	 * I18N), event propagation, application layer specific context (e.g.
	 * WebApplicationContext) for web application. So it is better to use
	 * ApplicationContext than BeanFactory.
	 */
	ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");  
	Student student=(Student)context.getBean("studentbean");
	student.displayInfo();
	
	/*
	 * Constructor Injection: Dependency Injection by constructor
	 */
	Employee employee = (Employee)context.getBean("employee");
	employee.show();

	/*
	 * Constructor Injection(CI): with Dependent Object
	 */
	Doctor doctor = (Doctor)context.getBean("doctor");
	doctor.show();
	/*
	 * Constructor Injection with Collection Example
	 */
	Question question= (Question)context.getBean("question");
	question.displayInfo();
	
	QuestionTwo questiontwo= (QuestionTwo)context.getBean("questiontwo");
	questiontwo.displayInfo();
	
}
}
