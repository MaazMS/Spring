<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Manager</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>

	
	<jsp:include page="../views/fragments/header.jsp"></jsp:include>			

	<div class="container">
		
		<h2>Current Project</h2>
		<ul class="list-group">
  			<li class="list-group-item"><label>Project Id:</label><span>${CurrentProject.projectid} </span></li>
  			<li class="list-group-item"><label>name:</label><span>${CurrentProject.name}</span></li>
  			<li class="list-group-item"><label>Description:</label><br/><span>${CurrentProject.description}</span></li>
		
			<li class="list-group-item"><label>sponsor:</label><span>${CurrentProject.sponsor}</span></li>
  			<li class="list-group-item"><label>authorizedHours:</label><span>${CurrentProject.authorizedHours}</span></li>
  			<li class="list-group-item"><label>anthorizedFound:</label><br/><span>${CurrentProject.anthorizedFound}</span></li>
			
			<li class="list-group-item"><label>year:</label><span>${CurrentProject.year}</span></li>
  			<li class="list-group-item"><label>type:</label><span>${CurrentProject.type}</span></li>
  			<li class="list-group-item"><label>special:</label><br/><span>${CurrentProject.special}</span></li>
			
		
		</ul>
		
	</div>
</body>
</html>