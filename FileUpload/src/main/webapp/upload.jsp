<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload File Request Page</title>
</head>
<body>
	<Form method="POST" action="uploadFile" enctype="multipart/form-data"> 
	File to upload <input type="file" name="file"> <br/>
	Name <input type="submit" value="Upload"> Press here to upload the file!
	</Form>
		
</body>
</html>