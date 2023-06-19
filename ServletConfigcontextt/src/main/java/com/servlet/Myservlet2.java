package com.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Myservlet2")
public class Myservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  
    ServletConfig config;
    ServletContext context;
    String emailstriString,driver;
    
 public void init(ServletConfig config) throws ServletException {
       this.config=config;
       this.context=config.getServletContext();
         }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	emailstriString=config.getInitParameter("email");
	System.out.println("Email:"+emailstriString);
	driver=context.getInitParameter("driver");
	System.out.println("driver:"+driver);
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}



