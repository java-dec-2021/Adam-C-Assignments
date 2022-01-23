<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title><c:out value="${currentCategory.name}" /></title>
</head>
<body class="p-5">
	<a href="/">Dashboard</a>
	<h1>Category - <c:out value="${currentCategory.name}" /></h1>
	<div class="mt-5 col-6">
		<h2>Products:</h2>
		<ul>
			<c:forEach var="p" items="${productsAssigned}">
				<li>${p.name}</li>
			</c:forEach>
		</ul>
	</div>
	<div class="col-6">
		<form:form class="mt-5" action="/categories/${currentCategory.id}" method="post" modelAttribute="addProduct">
				<form:label path="id">Add Product: </form:label>
				<form:select path="id">
					<c:forEach var="p" items="${productsNotAssigned}">
						<form:option value="${p.id}" label="${p.name}" />
					</c:forEach>
				</form:select>
				<form:errors path="id" class="text-danger" />
			<input type="submit" value="Submit" class="btn btn-primary" />
		</form:form>
	</div>


</body>
</html>