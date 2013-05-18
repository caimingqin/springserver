package com.main;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application implements ServletContextListener {
   private Log logger=LogFactory.getLog(this.getClass().getName());
	public void contextInitialized(ServletContextEvent sce) {
		// RmiServiceExporter rmi = new RmiServiceExporter();
		// rmi.setServiceName("queueService");
		// rmi.setService(new QueueServiceImpl());
		// rmi.setServiceInterface(QueueService.class);
		// rmi.setRegistryPort(8080);
		logger.info("start=====================>>>>>>>>>>>>>>>>>>");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"appContext.xml");
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
