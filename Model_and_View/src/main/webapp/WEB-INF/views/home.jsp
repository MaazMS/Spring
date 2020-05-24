<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Management</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="type/css"/>

<script src="https://ajax.googleapis.com/ajax/lib/jquery/1.11.2/jquery.min.js"></script>
<script src="htts://maxcdn.bootstapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
	<div class="container"> 
	<h3> Current project </h3>
	<ul class="list-group">

			<li class="list-group-item"> 
		<label>Project project id</label>
		<span>${CurrentProject.projectid} </span>
		</li>  
		
		<li class="list-group-item"> 
		<label>Project Name</label>
		<span>${CurrentProject.name} </span>
		</li> 
		<li class="list-group-item"> 
		<label>Project Description</label>
		<span>${CurrentProject.description} </span>
		</li>
		<li class="list-group-item"> 
		<label>Project sponsor</label>
		<span>${CurrentProject.sponsor} </span>
		</li>
		<li class="list-group-item"> 
		<label>Project AuthorizedHours</label>
		<span>${CurrentProject.authorizedHours} </span>
		</li>
		<li class="list-group-item"> 
		<label>Project AnthorizedFound</label>
		<span>${CurrentProject.anthorizedFound} </span>
		</li>
		<li class="list-group-item"> 
		<label>Project Year</label>
		<span>${CurrentProject.year} </span>
		</li>
		<li class="list-group-item"> 
		<label>Project Type</label>
		<span>${CurrentProject.type} </span>
		</li>
		<li class="list-group-item"> 
		<label>Project special</label>
		<span>${CurrentProject.special} </span>
		</li>
		
	</ul>
	</div>
</body>
</html>