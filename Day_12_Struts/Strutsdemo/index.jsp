<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %>
    

<html>
<head>
<title>Struts Demo</title>
</head>
<body>
<h1> Hello from Struts</h1>
<form action = "hello"> 
<label for="name">Please enter your name</label><br>
<input type="text" name="name"/>
<input type="submit" value="say hello"/>
</form>
</body>
</html>