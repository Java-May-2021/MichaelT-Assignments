<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/result" method="POST">
	<label>Name: </label>
	<input type=text name="name">
	<br>
	<label>Dojo Location: </label>
	<select name="location">
		<option value="Burbank" >Burbank</option>
		<option value="San Jose" >San Jose</option>
		<option value="San Diego" >San Diego</option>
		<option value="Sacremento" >Sacramento</option>
	</select>
	<br>
	<label>Favorite Language: </label>
	<select name="language">
		<option value="Python" >Python</option>
		<option value="Java" >Java</option>
		<option value="Mern" >MERN</option>
		<option value="C++" >C++</option>
	</select>
	<br>
	<label>Comments: </label>
	<textarea rows="5" cols="30" placeholder="Type Here" name="comment" ></textarea>
	<br>
	<button>Submit</button>
</form>
</body>
</html>