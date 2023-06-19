   package com.servlet;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.Servlet;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Myservlet1")
public class Myservlet1<ServletConfig, config, HttpServletRequest> extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
         ServletConfig config;
         ServletConfig context;
         String emailString,driver;
         
         public void init(ServletConfig config) throws ServletException {
                   this.config=config;
                   this.context=config.getServletContext();
         }
	protected void doGet(HttpServlet request, HttpServletRequest response) throws ServletException, IOException {
                      
	     emailString=config.getInitParameter("email");
            System.out.println("Email:"+emailString);
            driver=Context.getInitParameter("driver");
            System.out.println("driver:"+driver);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
