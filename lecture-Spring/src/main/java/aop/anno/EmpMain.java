package aop.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * SPRING AOP Ư¡1
 * 1. Runtime ���
 * 2. Proxy ���
 * 3. interface ���
 */

public class EmpMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aop-anno.xml");
		
		Employee programmer = context.getBean("programmer", Employee.class);
		programmer.work();
		
		Employee designer = context.getBean("designer", Employee.class);
		designer.work();
		
	}

}