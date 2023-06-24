package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Dept;
import com.bean.Emp;
import com.dao.EmpDao;


@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
	String action=request.getParameter("action");
	
	if(action.equalsIgnoreCase("insert dept"))
	{
		Dept dept=new Dept();
		dept.setDname(request.getParameter("dname"));
		dept.setLoc(request.getParameter("loc"));
        EmpDao.insertDept(dept);
        response.sendRedirect("dept.jsp");
	
	}
	else if(action.equalsIgnoreCase("insert emp"))
	{
		int did=Integer.parseInt(request.getParameter("dept"));
		Dept dept=EmpDao.getDept(did);
		Emp emp=new Emp();
		emp.setFname(request.getParameter("fname"));
        emp.setLname(request.getParameter("lname" ));
	   emp.setDept(dept);
	    EmpDao.insertEmp(emp);
	    response.sendRedirect("emp.jsp");
	}
	
	}

}
