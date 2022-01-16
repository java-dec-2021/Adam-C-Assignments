<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Dojo List</title>
</head>
<body class="p-5">
	<h1>Dojo List</h1>
	<a href="/dojos/new">Add Dojo</a>
	<a href="/ninjas/new">Add a new Ninja</a>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Dojo Name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dojos}" var="dojo">
				<tr>
					<td scope="row">
						<a href="/dojos/${dojo.id}"><c:out value="${dojo.name}" /></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>