package com.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Myservlet1")
public class Myservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	ServletConfig config;
	String emailstring;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	emailstring=config.getInitParameter("email");
	System.out.println("Email:"+emailstring);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
