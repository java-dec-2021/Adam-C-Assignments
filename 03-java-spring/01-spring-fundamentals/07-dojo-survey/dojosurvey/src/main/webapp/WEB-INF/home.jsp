<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
		
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="../css/home.css"/>
	
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="../js/home.js"></script>
	
	<title>Dojo Survey</title>
</head>
<body>
<form action="/results" method="POST">
	<h1>Dojo Survey</h1>
	<div class="row">
		<div class="left-col">
			<label for="name"> Name: </label>
		</div>
		<div class="right-col">
			<input type="text" name="name" id="name"/>
		</div>
	</div>
	
	<div class="row">
		<div class="left-col">
			<label for="location"> Dojo Location: </label>
		</div>
		<div class="right-col">
			<select name="location" id="location">
				<option value="San Diego">San Diego</option>
				<option value="Seattle">Seattle</option>
				<option value="Austin">Austin</option>
				<option value="Chicago">Chicago</option>
			</select>
		</div>
	</div>
	
	<div class="row">
		<div class="left-col">
			<label for="program"> Favorite Language: </label>
		</div>
		<div class="right-col">
			<select name="program" id="program">
				<option value="HTML/CSS">HTML/CSS</option>
				<option value="JavaScript">JavaScript</option>
				<option value="Java">Java</option>
				<option value="Python">Python</option>		
			</select>
		</div>
	</div>

	<div class="row">
		<div class="left-col">
			<label for="comment"> Comment (optional): </label>
		</div>
		<div class="right-col">
			<textarea name="comment" id="comment" cols="30" rows="10"></textarea>
		</div>
	</div>
	
	<p><button>Submit</button></p>
	
</form>
</body>
</html>