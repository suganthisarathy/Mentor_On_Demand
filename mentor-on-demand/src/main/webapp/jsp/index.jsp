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
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/index.css">
  
  </head>
<body>

  <div class="head">
<p style="padding-top:20px">
Mentor On Demand</p>
</div>
<div class="content" >

    
<form action="/mentorlogincheck">
<button class="button" style="margin-top:200px;" ><span>MentorLogin </span></button></form>
<form action="/userlogincheck">
<button class="button"  style="margin-top:100px;"><span> UserLogin </span></button>
</form>
<form action="/adminlogincheck">
<button class="button"  style="margin-top:100px;"><span> AdminLogin </span></button>
</form>


</div>
</body>
<div class="foot" style="height: 5vh">
	<p style="padding-top: 25px;">Copyright&copy;2019</p>
</div>
</body>
</html>