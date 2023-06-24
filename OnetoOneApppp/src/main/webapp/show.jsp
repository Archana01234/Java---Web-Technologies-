<%@page import="com.dao.EmpDao"%>
<%@page import="com.bean.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<table border="5" width="100%" cellpadding="10px" sellspacing="10px">
<tr>
<th>EPID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>
<th>EID</th>
<th>JOB</th>
<th>DEPT</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>

<% 
      List<Emp> list=EmpDao.getallEmps();
     
      for (Emp e:list)
      {
%>


  
        <tr>
        <td><%=e.getEinfo().getEpid() %></td>
        <td><%=e.getEinfo().getFname() %></td>
        <td><%=e.getEinfo().getLname() %></td>
        <td><%=e.getEinfo().getEmail() %></td>
        <td><%=e.getEid() %></td>
        <td><%=e.getJob()%></td>
        <td><%=e.getDept() %></td>
        <td>
        <form name="edit" method="post" action="EmpController">
        <input type="hidden" name="eid" value="<%=e.getEid()%>">
        <input type="submit" name="action" value="EDIT" class="btn btn-primary">
        </form>
        </td>
        <td>
         <form name="delete" method="post" action="EmpController">
        <input type="hidden" name="eid" value="<%=e.getEid()%>">
        <input type="submit" name="action" value="DELETE" class="btn btn-danger">
        </form>
        </td> 
     <%
     
         }
     
     %>
   
</table>
</body>
</html>