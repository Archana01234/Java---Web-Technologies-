<%@page import="com.bean.Student"%>
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

 

   Student s=(Student)request.getAttribute("s");

   if(request.getAttribute("msg")!=null)
  {
	  out.println("<b style=color:blue;>"+request.getAttribute("msg")+"</style></b>");
  }
%>
<form name="insert" method="post" action="StudentController">
<table>
<tr>
<td><input type="hidden" name="id" value="<%=s.getId() %>"></td>
</tr>
<tr>
<td>First name</td>
<td><input type="text" name="fname" value="<%=s.getFname() %>"></td>
</tr>
<tr>
<td>last name</td>
<td><input type="text" name="lname" value="<%=s.getLname() %>"></td>
</tr>  
<tr>
<td>Email</td>
<td><input type="text" name="email" value="<%=s.getEmail() %>"></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name="mobile" value="<%=s.getMobile() %>"></td>
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