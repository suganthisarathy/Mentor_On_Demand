<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/style.css">

</head>
<body>

	<div class="head">
		<p style="padding-top: 20px">Mentor On Demand</p>
	</div>
	<div class="content">
		<div class="container">
			<div class="card card-container">

				<img id="profile-img" class="profile-img-card"
					src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
				<p id="profile-name" class="profile-name-card"></p>

				<span id="reauth-email" class="reauth-email"></span>
				<form:form action="/mentorlogincheck" modelAttribute="u2" method="POST">
					<form:input type="text" id="inputEmail" class="form-control"
						placeholder="email" path="email" />
					<form:input type="password" id="inputPassword" class="form-control"
						path="password" placeholder="Password" />
						<strong>${msg }</strong>
					<div id="remember" class="checkbox">
						<label> <input type="checkbox" value="remember-me">
							Remember me
						</label>
					</div>
					
					<input class="btn btn-lg btn-primary btn-block btn-signin"
						type="submit" value="Login in">
					<!-- /form -->
					  ${message}
					<a href="addMentor" class="forgot-password">New User </a>
				</form:form>
			</div>
			<!-- /card-container -->
		</div>
		<!-- /container -->

	</div>
</body>
<div class="foot" style="height: 5vh">
	<p style="padding-top: 25px;">Copyright&copy;2019</p>
</div>
</body>
</html>