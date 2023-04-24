package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ust.iocautowiring.B;

public class TestDrawings {

	public static void main(String[] args) {

//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
//		Object obj = factory.getBean("line");
//		Line li = (Line)obj;
//		li.drawLine();
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*
		 * ConfigurableApplicationContext context = new
		 * ClassPathXmlApplicationContext("beans.xml"); context.registerShutdownHook();
		 * boolean exists = context.containsBean("line"); System.out.println(exists);
		 * if(exists) { Object object = context.getBean("line"); if(object instanceof
		 * Line) { Line line = (Line) object; line.drawLine(); } } boolean type =
		 * context.isSingleton("line"); System.out.println(type); Object obj =
		 * context.getBean("line"); Object obj2= context.getBean("line");
		 * if(obj.hashCode()==obj2.hashCode()) { System.out.println("singleton"); } else
		 * { System.out.println("not a singleton "); }
		 * 
		 * Line l1= (Line)context.getBean("line"); Line
		 * l2=(Line)context.getBean("line");
		 * 
		 * if(l1.hashCode()==l2.hashCode()) { System.out.println("singleton"); } else {
		 * System.out.println("not a singleton "); }
		 */
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		B b = (B)context.getBean("b");
		System.out.println(b);
		context.registerShutdownHook();
		
	}
}
