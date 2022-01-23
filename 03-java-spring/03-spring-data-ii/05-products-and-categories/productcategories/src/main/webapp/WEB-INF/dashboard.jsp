<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Dashboard</title>
</head>
<body class="p-5">
	<h1>Product and Category Dashboard</h1>
	
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Products - <a href="/products/new">Create new Product</a></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allProducts}" var="prod">
				<tr>
					<td scope="row">
						<a href="/products/${prod.id}"><c:out value="${prod.name}" /></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Categories - <a href="/categories/new">Create new Category</a></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allCategories}" var="cat">
				<tr>
					<td scope="row">
						<a href="/categories/${cat.id}"><c:out value="${cat.name}" /></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>