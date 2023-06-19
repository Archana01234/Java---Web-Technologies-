package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class mylistener implements ServletContextListener {

   
    public void contextDestroyed(ServletContextEvent sce)  { 
    	 sce.getServletContext().getAttribute("counter");
         System.out.println("servlet context Destroyed");
   
    
    
    }

    public void contextInitialized(ServletContextEvent sce)  { 
          sce.getServletContext().getAttribute("counter");
          System.out.println("servlet context initialized");
    }
	
}
