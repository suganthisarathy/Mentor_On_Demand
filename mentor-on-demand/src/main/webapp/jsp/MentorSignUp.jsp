<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUpPage</title>

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
	
	<p style="text-align:center">Mentor Registration</p>
		<div style="padding-top: 150px;">
		

			<form:form method="POST" action="/addMentor" modelAttribute="m">


				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputEmail4">Email</label> <form:input type="email"
							class="form-control" id="inputEmail4" placeholder="Email" path="email"/>
							<form:errors path="email" class="text-danger" />
					</div>
					<div class="form-group col-md-6">
						<label for="inputPassword4">Password</label> 
						<form:input type="password" class="form-control" path="password" id="inputPassword4"
							placeholder="Password"/>
						<form:errors path="password" class="text-danger" />
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputname">Name</label> <form:input type="text"
							class="form-control"  placeholder="name" path="name" id="inputname"/>
							<form:errors path="name" class="text-danger" />
					</div>
					<div class="form-group col-md-6">
						<label for="inputmobilenumber">Mobile number</label> 
						<form:input type="text" class="form-control" path="mobilenumber" 
							placeholder="mobilenumber" id="inputmobilenumber"/>
						<form:errors path="mobilenumber" class="text-danger" />
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputyear">Years of Experience</label> <form:input type="text"
							class="form-control"  placeholder="yearOfExperience" path="yearsOfExperience" id="inputyear"/>
							<form:errors path="yearsOfExperience" class="text-danger" />
					</div>
					<div class="form-group col-md-6">
						<label for="inputtechnology">Technologies Known</label> 
						<form:input type="text" class="form-control" path="technologiesKnown" 
							placeholder="technologiesKnown" id="inputtechnology"/>
						<form:errors path="technologiesKnown" class="text-danger" />
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputnumber">Number of Training Completed</label> <form:input type="text"
							class="form-control"  placeholder="trainingsCompleted" path="trainingsCompleted" id="inputnumber"/>
							<form:errors path="trainingsCompleted" class="text-danger" />
					</div>
					<div class="form-group col-md-6">
						<label for="inputurl">LinkedInUrl</label> 
						<form:input type="text" class="form-control" path="linkedInUrl" 
							placeholder="linkedInUrl" id="inputurl"/>
						<form:errors path="linkedInUrl" class="text-danger" />
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputfdate">Available from(date)</label> <form:input type="date"
							class="form-control"  placeholder="fromDate" path="fromDate" id="inputfdate"/>
							<form:errors path="fromDate" class="text-danger" />
					</div>
					<div class="form-group col-md-6">
						<label for="inputtdate">Available to(date)</label> 
						<form:input type="date" class="form-control" path="toDate" 
							placeholder="toDate" id="inputtdate"/>
						<form:errors path="toDate" class="text-danger" />
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputftime">Available from(time)</label> <form:input type="text"
							class="form-control"  placeholder="fromTime" path="fromTime" id="inputftime"/>
							<form:errors path="fromTime" class="text-danger" />
					</div>
					<div class="form-group col-md-6">
						<label for="inputttime">Available to(time)</label> 
						<form:input type="text" class="form-control" path="toTime" 
							placeholder="toTime" id="inputttime"/>
						<form:errors path="toTime" class="text-danger" />
					</div>
				</div>
				<button class="button" type="submit">Sign in</button>

			</form:form>

		</div>
	</div>

</body>
<div class="foot" style="height: 5vh">
	<p style="padding-top: 25px;">Copyright&copy;2019</p>
</div>
</body>
</html>