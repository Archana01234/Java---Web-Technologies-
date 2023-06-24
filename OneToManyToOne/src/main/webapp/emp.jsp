<%@ page import="com.dao.EmpDao"%>
<%@page import="com.bean.Dept"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<style type="text/css">
tr,td{
padding: "10px";
}
</style>
<body>
<form name="insert" method="post" action="EmpController">
<table>
<tr>
<td>Department</td>
<td>
<select name="dept">  
<option>---select department---</option>
<%
List<Dept> list=EmpDao.getallDepts();
for(Dept d:list)
{
%>
<option value="<%=d.getDid() %>"><%=d.getDname()%></option>

<%	
}
%>
</select>

</td>
</tr>
<tr>
<td>First name</td>
<td><input type="text" name="fname"></td>
</tr>
<tr>
<td>last name</td>
<td><input type="text" name="lname"></td>
</tr>  
<tr>
<td colspan="2" align="center">
<input type="submit" name="action" value="INSERT EMP" class="btn-btn primary">
</td>
</tr>
</table>
</form>
</body>
</html>