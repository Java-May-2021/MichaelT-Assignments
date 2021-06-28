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
<table>
	<thead>
		<tr>
			<th>Language</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${getLanguage}" var="lang">
		<tr>
			<td><a href="/${lang.id}">${lang.name}</a></td>
			<td>${lang.creator}</td>
			<td>${lang.version}</td>
			<td><a href="/edit/${lang.id}">Edit</a> | <a href="/delete/${lang.id}">Delete</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<h2>Add New Language</h2>
<form:form action="/" method="post" modelAttribute="lang">
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
</form:form>
</body>
</html>