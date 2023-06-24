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
<tr>
<table><tr><td>Department Name </td>
<td><input type="text" name="dname"></td>
</tr>
<tr>
<td>Location</td>
<td><input type="text" name="loc"></td>
</tr>  
<tr>
<td colspan="2" align="center">
  <input type="submit" name="action" value="INSERT DEPT" class="btn-btn primary">
</td>
</tr>
</table>
</form>
</body>
</html>