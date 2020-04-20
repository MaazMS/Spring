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
			<form:input path="name" />
			<br /> <label>Enter Password</label>
			<form:password path="password" />
			<br /> <label>Country</label>
			<form:select path="country">
				<form:option value="Ind" label="india" />
				<form:option value="us" label="USA" />
				<form:option value="pak" label="pakistan" />
				<form:option value="UAE" label="UAE" />
			</form:select>
			<br /> <label>Hobbies</label><br />
			 cricket
			<form:checkbox path="hobbies" value="cricket" />
			travel
			<form:checkbox path="hobbies" value="travel" />
			programming
			<form:checkbox path="hobbies" value="programming" />
			<br /> <label>gender</label> Male
			<form:radiobutton path="gender" value="Male" />
			Female
			<form:radiobutton path="gender" value="Male" />
			<br /> <input type="submit" value="Register" />
		</div>
	</form:form>
</body>
</html>