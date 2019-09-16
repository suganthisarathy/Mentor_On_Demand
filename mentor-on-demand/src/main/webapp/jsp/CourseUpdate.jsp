<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     import="java.util.*,com.example.mentorondemand.model.*" pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUpPage</title>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/style.css">
  
  </head>
<body>
<%
List courseList=(List)request.getAttribute("courseList");
System.out.println(courseList);
%>
  <div class="head">
<p style="padding-top:20px">
MentorOnDemand</p>
</div>
<div class="content" >
<ul class="nav navbar-nav">
			<li><a href="addcourse">Add Courses</a></li>
			<li><a href="editcourse">Edit Courses</a></li>
			<li><a href="userList">UserList</a></li>
			<li><a href="mentorList">MentorList</a></li>
			<li><a href="#">Payment </a></li>
			<li><a href="logincheck">Logout</a>
		</ul>
<div style="padding-top:150px;">

       <% for(int i=0;i<courseList.size();i++){
				Admin e=(Admin)courseList.get(i);
	%>
           <form:form  action="/editcourse" modelAttribute="admin" method="POST">
            <div class="form-group row" >
					<label class="col-sm-2 col-form-label" style="margin-left:580px">Course Id</label>
					<div class="col-sm-2">
						<form:input type="text" class="form-control" 
							path="courseId" value="<%=e.getCourseId() %>" readonly="true" />
					  <form:errors path="courseId" class="text-danger"/>
                       
                   </div>
            </div>
            
            <div class="form-group row" >
					<label class="col-sm-2 col-form-label" style="margin-left:580px">Course Name</label>
					<div class="col-sm-2">
						<form:input type="text" class="form-control" 
							path="courseName" value="<%=e.getCourseName() %>" />
					  <form:errors path="courseName" class="text-danger"/>
                       
                   </div>
            </div>
            <div class="form-group row" >
					<label class="col-sm-2 col-form-label" style="margin-left:580px">Price</label>
					<div class="col-sm-2">
						<form:input type="text" class="form-control" 
							path="courseRate" value="<%=e.getCourseRate() %>"  />
					 <form:errors path="courseRate" class="text-danger"/>
                       
                   </div>
            </div>
            
            
            
            <input type="submit" class="button">
                <!--  <input type="text" id="inputuser" class="form-control" placeholder="User Name" >
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" >
                <input type="password" id="inputPassword" class="form-control" placeholder="Confirm Password" >
                <input type="text" id="inputusertype" class="form-control" placeholder="User Type" >
                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" >
                <input type="text" id="inputphone" class="form-control" placeholder="Phone Number">
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>-->
            <!-- /form -->
            </form:form>
         <% }%>
    </div><!-- /container -->
</div>

</body>
<div class="foot" style="height: 5vh">
	<p style="padding-top: 25px;">Copyright&copy;2019</p>
</div>
</body>
</html>