package com.adil.dependancyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student obj = context.getBean("student", Student.class);
		obj.display();

		Student obj1 = context.getBean("std", Student.class);
		obj1.display();

	}

}
