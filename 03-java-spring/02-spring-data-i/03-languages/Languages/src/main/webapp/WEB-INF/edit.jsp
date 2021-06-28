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
<h2>Update ${language.name}</h2>
<form:form action="/edit/${language.id}" method="post" modelAttribute="language"> 	
	<p>
		<form:label path="name">Language</form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
	</p>
	<p>
		<form:label path="creator">Creator</form:label>
		<form:errors path="creator"/>
		<form:input path="creator"/>
	</p>
	<p>
		<form:label path="version">Version</form:label>
		<form:errors path="version"/>
		<form:input path="version"/>
	</p>
	<button>Submit</button>

<input type="hidden" name="_method" value="put">
</form:form>
</body>
</html>