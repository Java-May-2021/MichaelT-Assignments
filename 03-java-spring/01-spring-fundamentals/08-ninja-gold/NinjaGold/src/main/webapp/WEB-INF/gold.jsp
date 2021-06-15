<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gold</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container">
	<p>Your Gold: <c:out value="${gold}"/> </p>
	<div class="form" > 
	    <form class="earn" action="/addGold" method="POST">
	        <h3>Farm</h3>
	        <p>(Earns 10-20 Golds)</p>
	        <input type="hidden" name="location" value="farm">
	        <button>Find Gold</button>
	    </form>
	    <form class="earn" action="/addGold" method="POST">
	        <h3>Cave</h3>
	        <p>(Earns 5-10 Golds)</p>
	        <input type="hidden" name="location" value="cave">
	        <button>Find Gold</button>
	    </form>
	    <form class="earn" action="/addGold" method="POST">
	        <h3>House</h3>
	        <p>(Earn 2-5 Golds)</p>
	        <input type="hidden" name="location" value="house">
	        <button>Find Gold</button>
	    </form>
	    <form class="earn" action="/addGold" method="POST">
	        <h3>Casino</h3>
	        <p>(Earn/Take 30-50 Golds)</p>
	        <input type="hidden" name="location" value="casino">
	        <button>Find Gold</button>
	    </form>
	</div>
	<div class="activities">
	    <c:forEach items="${activity}" var="act" >
	    	<p class='${act.contains("lost")? "red" : "green"}'>${act}</p>
	    </c:forEach>
	</div> 
</div>
</body>
</html>