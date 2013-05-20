package it.geek.annunci.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceFactory {
	
	private static ApplicationContext cxt = null;

	static{
		cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static AnnuncioServiceInterface getAnnuncioService(){
		return (AnnuncioServiceInterface)cxt.getBean("aservice");
	}

	
	public static UtenteServiceInterface getUtenteService(){
		return (UtenteServiceInterface)cxt.getBean("uservice");
	}
}
