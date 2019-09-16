<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     import="java.util.*,com.example.mentorondemand.model.*" pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!--  <style>

section {
	border: 1px solid black;
}

.img {
	height: 50px;
	width: 80px;
	margin-top: 20px;
}

.ptext {
	margin-top: 60px;
}

.edit {
	width: 60px;
}

.col {
	padding: 150px;
}
.head
{
	height:10vh;
	background-color:#000000d1;
	text-align:center;
	font-size:25px;
	color:white;
}
.content
{
	height:85vh;
}
.foot
{
	height:5vh;
	background-color:#000000d1;
	text-align:center;
	color:white;
	
}
nav ul li
{
padding-left:150px;
font-size:25px;
color:blue;
}
table td th {
	padding-left: 30px;
	padding-top: 35px;
}
</style>-->
<link rel="stylesheet" href="css/style.css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


</head>

<body>

	<div class="head">
		<p style="padding-top: 20px">Mentor on Demand</p>
	</div>
	<div class="content">
		<nav class="navbar navbar-default">
			<div class="container-fluid">

				<ul class="nav navbar-nav">
      <li ><a href="traininglist">Training Courses</a></li>
      <li><a href="#">Completed Training</a></li>
      <li><a href="userrequestatus">Request Status</a></li>
      <li><a href="searchmentor">Search </a></li>
      <li><a href="userlogincheck">Logout</a>
    </ul>
			</div>
		</nav>
		<div class="container-fluid">
			 <form:form method="POST" action="/searchmentor" modelAttribute="s">
			 <div class="form-group row" >
					<label class="col-sm-2 col-form-label" style="margin-left:580px">Search Mentor Based on Technology</label>
					<div class="col-sm-2">
						<form:input type="text" class="form-control" 
							path="technologiesKnown"  />
					  <form:errors path="technologiesKnown" class="text-danger"/>
                       
                   </div>
            </div>
            
            <button class="button" type="submit">Search</button>
			 </form:form>
		</div>

	</div>

</body>


</html>