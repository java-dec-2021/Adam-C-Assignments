<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Insert title here</title>
</head>
<body class="p-5">
	<h1><c:out value="${dojoName}"/> - Dojo Roster</h1>
	<a href="/dojos">Dojo Dashboard</a>
	<a href="/ninjas/new">Add a new Ninja</a>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Ninja Name</th>
				<th scope="col">Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dojoRoster}" var="ninja">
				<tr>
					<td scope="row"><c:out
							value="${ninja.lastName}, ${ninja.firstName}" /></td>
					<td scope="row"><c:out value="${ninja.age}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>