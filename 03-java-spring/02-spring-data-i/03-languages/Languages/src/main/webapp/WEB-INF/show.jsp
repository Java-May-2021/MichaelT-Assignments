<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/">Dashboard</a>

<p><c:out value="${oneLanguage.name}"/></p>
<p><c:out value="${oneLanguage.creator}"/></p>
<p><c:out value="${oneLanguage.version}"/></p>
<p><a href="/edit/${oneLanguage.id}">Edit</a></p>
<p><a href="/delete/${oneLanguage.id}">Delete</a></p>
</body>
</html>