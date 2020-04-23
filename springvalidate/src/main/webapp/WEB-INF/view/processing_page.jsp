<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dispay</title>
</head>
<body>
	<h1 align="center">registration success</h1>

	name ${Display.name}
	<br /> password ${Display.password}
	<br /> Country ${Display.country}
	<br /> Hobbies
	<c:forEach var="temp" items="${Display.hobbies}">
	${temp} 
	</c:forEach>
	<br /> gender ${Display.gender}
	<br />


</body>
</html>