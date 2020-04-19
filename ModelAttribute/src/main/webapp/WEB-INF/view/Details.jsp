<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"> About Myself</h1>
<form:form action="processing-page" method="get" modelAttribute="userInfo">
  <div align="center">
<p> 
	<label for="fn"> first name </label> 
	<form:input  id="fn" path="first_name" /> 
	
</p>
<p> 
	<label for="ln"> last name </label> 
	<form:input  id="ln" path="last_name" />
	
	Enter name <form:input  path="name" />
</p>

<input type="submit" value="submit"> 
</div>
</form:form>
</body>
</html>
