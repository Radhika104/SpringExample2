package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

  public static void main(String gg[])
  {
	  //Resource rs=new ClassPathResource("beans.xml");
	  
	  //BeanFactory bn=new XmlBeanFactory(rs);
	  
	/*  ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	  
	  Customer c=(Customer) ctx.getBean("cst");
	  
	  c.display();
	  
	  Customer c1=(Customer) ctx.getBean("cst1");
	  
	  c1.display();*/
	  
	  ApplicationContext ctx1=new AnnotationConfigApplicationContext(ConfigTest.class);
	  
	  Customer c=(Customer) ctx1.getBean(Customer.class);
	  
	  c.display();
	  
	  HelloTest t= (HelloTest) ctx1.getBean(HelloTest.class);
	  
	  t.greetUser();
	  
  }

}
