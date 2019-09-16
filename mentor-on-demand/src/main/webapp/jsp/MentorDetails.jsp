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
List mentorList=(List)request.getAttribute("mentorList");
System.out.println(mentorList);
%>

	<div class="head">
		<p style="padding-top: 20px">Mentor on Demand</p>
	</div>
	<div class="content">
		<nav class="navbar navbar-default">
			<div class="container-fluid">

				<ul class="nav navbar-nav">
					<li><a href="">Training Courses</a></li>
					<li><a href="">Completed Training</a></li>
					<li><a href="">Request Status</a></li>
					<li><a href="">Search</a></li>
					<li><a href="">Logout</a>
				</ul>
			</div>
		</nav>
		<div class="container">
			<h3 style="text-align: center;">List of Mentors</h3>
			<br>
			<section class="row">
			 <table>
			 <th style="padding-right:50px">Name</th>
			 <th style="padding-right:50px">MobileNumber</th>
			 <th style="padding-right:50px">Email</th>
			 <th style="padding-right:50px">LinkedInUrl</th>
			 <th style="padding-right:50px">Topics</th>
			  <th style="padding-right:50px">Experience</th>
			  <th style="padding-right:50px">StartDate</th>
			  <th style="padding-right:50px">EndDate</th>
			  <th style="padding-right:50px">StartTime</th>
			  <th style="padding-right:50px">EndTime</th>
			  <th style="padding-right:50px">Proposal</th>
			  
			<% 
			 for(int i=0;i<mentorList.size();i++){
	MentorRegistration e=(MentorRegistration)mentorList.get(i);
	
	%>
   
           <tr>
				<td><p class="col-md-2 ptext"><%=e.getName() %></p></td>
				<td><p class="col-md-2 ptext"><%=e.getMobilenumber() %></p></td>
				<td><p class="col-md-3 ptext"><%= e.getEmail() %></p></td>
				<td><p class="col-md-3 ptext"><%= e.getLinkedInUrl()%></p></td>
				<td><p class="col-md-3 ptext"><%= e.getTechnologiesKnown() %></p></td>
				<td><p class="col-md-3 ptext"><%= e.getYearsOfExperience() %></p></td>
				<td><p class="col-md-3 ptext"><%= e.getFromDate() %></p></td>
				<td><p class="col-md-3 ptext"><%= e.getToDate() %></p></td>
				<td><p class="col-md-3 ptext"><%= e.getFromTime() %></p></td>
				<td><p class="col-md-3 ptext"><%= e.getToTime() %></p></td>
				<td><p class="col-md-2 ptext">
					<a href="userMentorLink?mentorid=<%= e.getMentorId() %>"><input type="submit" value="Request"></a>
				</p></td>
				
				</tr>
				<% }%>
				</table>
			</section>
			
			
		</div>

	</div>

</body>


</html>