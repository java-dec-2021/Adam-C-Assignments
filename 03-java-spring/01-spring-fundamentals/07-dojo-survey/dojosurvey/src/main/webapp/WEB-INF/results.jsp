<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="../css/results.css"/>
	
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="../js/results.js"></script>
	<title>Results</title>
</head>
<body>
<div class="container">
	<h1>Submitted Info</h1>

	<div class="row">
		<div class="left">
			<p>Name:</p>
		</div>
		<div class="right">
			<c:out value="${name}" />
		</div>
	</div>
	<div class="row">
		<div class="left">
			<p>Location:</p>
		</div>
		<div class="right">
			<c:out value="${location}" />
		</div>
	</div>
	<div class="row">
		<div class="left">
			<p>Program:</p>
		</div>
		<div class="right">
			<c:out value="${program}" />
		</div>
	</div>
	<div class="row">
		<div class="left">
			<p>Comment (optional):</p>
		</div>
		<div class="right">
			<c:out value="${comment}" />
		</div>
	</div>
	<a href="http://localhost:8080/">Go Back</a>
</div>


</body>
</html>