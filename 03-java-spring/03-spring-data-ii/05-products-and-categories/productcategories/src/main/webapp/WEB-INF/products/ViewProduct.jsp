<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title><c:out value="${currentProduct.name}" /></title>
</head>
<body class="p-5">
	<a href="/">Dashboard</a>
	<h1>Product - <c:out value="${currentProduct.name}" /></h1>
	<h2>  Price: $<c:out value="${currentProduct.price}" /></h2>
	<div class="mt-5 col-4">
		<h2>Categories:</h2>
		<ul>
			<c:forEach var="c" items="${categoriesAssigned}">
				<li>${c.name}</li>
			</c:forEach>
		</ul>
	</div>
	<div class="col-3">
		<form:form class="mt-5" action="/products/${currentProduct.id}" method="post" modelAttribute="addCategory">
				<form:label path="id">Add Category: </form:label>
				<form:select path="id">
					<c:forEach var="c" items="${categoriesNotAssigned}">
						<form:option value="${c.id}" label="${c.name}" />
					</c:forEach>
				</form:select>
				<form:errors path="id" class="text-danger" />
			<input type="submit" value="Submit" class="btn btn-primary" />
		</form:form>
	</div>


</body>
</html>