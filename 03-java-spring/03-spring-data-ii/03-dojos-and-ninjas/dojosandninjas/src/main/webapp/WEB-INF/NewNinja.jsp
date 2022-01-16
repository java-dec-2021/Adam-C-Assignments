<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Add a Ninja</title>
</head>
<body class="p-5">
	<h1>New Ninja Registration</h1>
	<a href="/dojos">Dojo Dashboard</a>
	<form:form class="mt-5" action="/ninjas/new" method="post"
		modelAttribute="newNinja">
		<p>
			<form:label path="firstName">First Name: </form:label>
			<form:input path="firstName" />
			<form:errors path="firstName" class="text-danger" />
		</p>
		<p>
			<form:label path="lastName">Last Name: </form:label>
			<form:input path="lastName" />
			<form:errors path="lastName" class="text-danger" />
		</p>
		<p>
			<form:label path="age">Age: </form:label>
			<form:input path="age" />
			<form:errors path="age" class="text-danger" />
		</p>
		<p>
			<form:label path="dojo">Dojo: </form:label>
			<form:select path="dojo">
				<c:forEach items="${dojos}" var="d">
					<form:option value="${d.id}" label="${d.name}" />
				</c:forEach>
			</form:select>
			<form:errors path="dojo" class="text-danger" />
		</p>
		<input type="submit" value="Submit" class="btn btn-primary" />
	</form:form>
</body>
</html>