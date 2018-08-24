<%-- 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="Header.jsp"%>
<br />
<br />
<br />
<!DOCTYPE br PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="<c:url value="resources/css/login.css"></c:url>">
</head>
<body>
	<link
		href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->

	<div class="col-md-12 text-center">
		<h3>
			WELCOME<span style="color: orange">SuperMarket</span>
		</h3>
	</div>
	<div class="col-md-10 col-md-offset-1">
		<div class="carousel slide" data-ride="carousel" data-type="multi"
			data-interval="3000" id="myCarousel">
			<div class="carousel-inner">
				<div class="item active">
					<div class="col-md-2 col-sm-6 col-xs-12">
						<a href="#"><img
							src="resources/images/cour1.jpg"
							class="img-responsive"></a>
					</div>
				</div>
				<div class="item">
					<div class="col-md-2 col-sm-6 col-xs-12">
						<a href="#"><img
							src="resources/images/cour2.jpg"
							class="img-responsive"></a>
					</div>
				</div>
				<div class="item">
					<div class="col-md-2 col-sm-6 col-xs-12">
						<a href="#"><img src="resources/images/cour3.jpg"
							class="img-responsive"></a>
					</div>
				</div>
				<div class="item">
					<div class="col-md-2 col-sm-6 col-xs-12">
						<a href="#"><img src="resources/images/cour4.jpg"
							class="img-responsive"></a>
					</div>
				</div>
				<div class="item">
					<div class="col-md-2 col-sm-6 col-xs-12">
						<a href="#"><img
							src="resources/images/cour5.jpg"
							class="img-responsive"></a>
					</div>
				</div>
				<div class="item">
					<div class="col-md-2 col-sm-6 col-xs-12">
						<a href="#"><img
							src="resources/images/cour6.jpg"
							class="img-responsive"></a>
					</div>
				</div>
				<div class="item">
					<div class="col-md-2 col-sm-6 col-xs-12">
						<a href="#"><img src="resources/images/cour7.jpg"
							class="img-responsive"></a>
					</div>
				</div>
				<div class="item">
					<div class="col-md-2 col-sm-6 col-xs-12">
						<a href="#"><img
							src="resources/images/cour8.jpg"
							class="img-responsive"></a>
					</div>
				</div>
			</div>
			<a class="left carousel-control" href="#myCarousel" data-slide="prev"><i
				class="glyphicon glyphicon-chevron-left"></i></a> <a
				class="right carousel-control" href="#myCarousel" data-slide="next"><i
				class="glyphicon glyphicon-chevron-right"></i></a>
		</div>
	</div>
	<link
		href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
		rel="stylesheet" id="bootstrap-css">
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
	<!------ Include the above in your HEAD tag ---------->

	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="#" id="register-form-link">Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="<c:url value='/j_spring_security_check'></c:url>"
									method="post" role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="username" id="username" tabindex="1"
											class="form-control" placeholder="Username" value="">
									</div>
									<div class="form-group">
										<input type="password" name="password" id="password"
											tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember"
											id="remember"> <label for="remember">
											Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit"
													tabindex="4" class="form-control btn btn-login"
													value="Log In">
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="text-center">
													<a href="https://phpoll.com/recover" tabindex="5"
														class="forgot-password">Forgot Password?</a>
												</div>
											</div>
										</div>
									</div>
								</form>
								<form id="register-form"
									action="https://phpoll.com/register/process" method="post"
									role="form" style="display: none;">
									<div class="form-group">
										<input type="text" name="username" id="username" tabindex="1"
											class="form-control" placeholder="Username" value="">
									</div>
									<div class="form-group">
										<input type="email" name="email" id="email" tabindex="1"
											class="form-control" placeholder="Email Address" value="">
									</div>
									<div class="form-group">
										<input type="password" name="password" id="password"
											tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group">
										<input type="password" name="confirm-password"
											id="confirm-password" tabindex="2" class="form-control"
											placeholder="Confirm Password">
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit"
													id="register-submit" tabindex="4"
													class="form-control btn btn-register" value="Register Now">
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<script src="resources/js/login.js"></script>
</body>

</html> --%>



<%@include file="Header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<c:url value='/perform_login'></c:url>" role="form" method="post">
 <h1 class="well">
 <center>
 <font face="Monotype Corsiva">Login Form</font>
 </center>
 </h1>
	<div class="col-lg-12 well">
	<div class="row">
	<form>
	<div class="col-sm-12">
    <div class="row">
	<div class="col-sm-6 form-group">
	<label>Login Name</label>
    <input type="text" name="username" placeholder="Enter User Name Here.." class="form-control">
	</div>
	</div>
						</div>
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>Password </label>
								<input type="password" name="password" placeholder="Enter Password Here.." class="form-control">
							</div>
						</div>	
					<div>
					<input type="submit" class="btn btn-lg btn-info" value="Submit"/>					
					</div>
				</form> 
		</div>
	</div>
</form>


<%@include file="Footer.jsp"%>
</body>
</html>

