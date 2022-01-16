<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Create a Dojo</title>
</head>
<body class="p-5">
	<h1>New Dojo</h1>
	<a href="/dojos">Dojo Dashboard</a>
	<form:form class="mt-5" action="/dojos/new" method="post"
		modelAttribute="newDojo">
		<p>
			<form:label path="name">Name: </form:label>
			<form:input path="name" />
			<form:errors path="name" class="text-danger" />
		</p>
		<input type="submit" value="Submit" class="btn btn-primary" />
	</form:form>
</body>
</html>