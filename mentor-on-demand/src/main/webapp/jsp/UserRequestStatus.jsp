<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     import="java.util.*,com.example.mentorondemand.model.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

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
</style>

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
<%
List requestList=(List)request.getAttribute("userRequestList");
System.out.println(requestList);
%>

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
		<div class="container">
			<h3 style="text-align: center;">List of User</h3>
			<br>
			<section class="row">
			 <table>
			 <th style="padding-right:155px">userId</th>
			 <th style="padding-right:155px">Status</th>
			 <th style="padding-right:155px">MentorId</th>
			 <th style="padding-right:155px">UserMentorId</th>
			
			
			<% for(int i=0;i<requestList.size();i++){
	UserMentor e=(UserMentor)requestList.get(i);
	%>
    
           <tr>
				<td><p class="col-md-2 ptext"><%=e.getUserId() %></p></td>
				<td><p class="col-md-2 ptext"><%=e.getStatus() %></p></td>
				<td><p class="col-md-2 ptext"><%=e.getMentorId() %></p></td>
				<td><p class="col-md-2 ptext"><%=e.getUserMentorId() %></p></td>
				
				</tr>
				<% }%>
				</table>
			</section>
			
			
		</div>

	</div>

</body>


</html>