<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="Header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="<c:url value="resources/css/home.css"></c:url>">
</head>
<body>
	<!-- <link
		href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css"> -->
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->

	<!-- <link
		href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css"> -->
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->

	<!-- We will make a simple accordian with hover effects 
The markup will have a list with images and the titles-->
	<div class="accordian">
		<ul>
			<li>
				<div class="image_title">
					<a href="#">KungFu Panda</a>
				</div> <a href="#"> <img
					src="resources/images/mad1.jpg" />
			</a>
			</li>
			<li>
				<div class="image_title">
					<a href="#">Toy Story 2</a>
				</div> <a href="#"> <img
					src="resources/images/mad2.jpg" />
			</a>
			</li>
			<li>
				<div class="image_title">
					<a href="#">Wall-E</a>
				</div> <a href="#"> <img
					src="resources/images/mad3.jpg" />
			</a>
			</li>
			<li>
				<div class="image_title">
					<a href="#">Up</a>
				</div> <a href="#"> <img
					src="resources/images/mad4.jpg" />
			</a>
			</li>
			<li>
				<div class="image_title">
					<a href="#">Cars 2</a>
				</div> <a href="#"> <img
					src="resources/images/mad5.jpg" />
			</a>
			</li>
			<li>
				<div class="image_title">
					<a href="#">Cars 2</a>
				</div> <a href="#"> <img
					src="resources/images/mad5.jpg" />
			</a>
			</li>
		</ul>
	</div>
	Hi ${sessionScope.role} - This is User Page
<%@include file="Footer.jsp"%>
</body>
</html>