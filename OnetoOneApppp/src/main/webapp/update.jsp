<%@page import="com.bean.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 

   Emp e=(Emp)request.getAttribute("e");

   if(request.getAttribute("msg")!=null)
  {
	  out.println("<b style=color:blue;>"+request.getAttribute("msg")+"</style></b>");
  }
%>
<form name="insert" method="post" action="EmpController">
<table>
<tr>
<td><input type="hidden" name="eid" value="<%=e.getEid() %>"></td>
</tr>
<tr>
<td>First name</td>
<td><input type="text" name="fname" value="<%=e.getEinfo().getFname()%>"></td>
</tr>
<tr>
<td>last name</td>
<td><input type="text" name="lname" value="<%=e.getEinfo().getLname() %>"></td>
</tr>  
<tr>
<td>Email</td>
<td><input type="text" name="email" value="<%=e.getEinfo().getFname() %>"></td>
</tr>
<tr>
<td>Job</td>
<td><input type="text" name="job" value="<%=e.getJob() %>"></td>
</tr>
<tr>
<td>department</td>
<td><input type="text" name="dept" value="<%=e.getDept() %>"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name="action" value="UPDATE" class="btn-btn primary">
</td>
</tr>
</table>
</form>
</body>
</html>