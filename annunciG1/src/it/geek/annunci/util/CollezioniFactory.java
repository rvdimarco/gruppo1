package it.geek.annunci.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollezioniFactory {

	private static ApplicationContext ctx = null;
	
	static{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static CollezioniInterface getCollezioni(){
		return (CollezioniInterface)ctx.getBean("col");
	}
}
