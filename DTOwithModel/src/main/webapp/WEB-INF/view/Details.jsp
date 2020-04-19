<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">About Myself</h1>
	<form action="processing-page" method="get">
		<div align="center">
			<p>
				<label for="fn"> first name </label> <input type="text" id="fn"
					name="first_name">
			</p>
			<p>
				<label for="ln"> last name </label> <input type="text" id="ln"
					name="last_name">
			</p>
			Enter name <input type="text" name="name"> <input
				type="submit" value="submit">
		</div>
	</form>
</body>
</html>