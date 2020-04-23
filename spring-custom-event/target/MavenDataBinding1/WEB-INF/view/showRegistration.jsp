<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration form form page</title>
</head>
<!-- value banded to property  -->
<body>

	<h1 align="center">User Registration Form</h1>

	<form:form action="processing_page" method="GET" modelAttribute="userReg">
		<div align="center">
			<label> name</label>
			<form:input path="firstName" />
			<br /> <input type="submit" value="Register" />
		</div>
	</form:form>
</body>
</html>