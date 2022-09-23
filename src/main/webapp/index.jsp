<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Java EE World</title>
</head>
<body>
<h1>What is your Name?</h1>
<form action="enterNameServlet" method="post">
Please enter your first and last name:
<input type="text" name="firstName" size="20">
<input type="text" name="lastName" size="20">
<input type="submit" value="Submit"/>

</form>

</body>
</html>