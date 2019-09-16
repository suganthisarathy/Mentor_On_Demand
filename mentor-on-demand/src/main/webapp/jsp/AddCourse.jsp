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
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/style.css">
  
  </head>
<body>

  <div class="head">
<p style="padding-top:20px">
MentorOnDemand</p>
</div>
<div class="content" >
<div style="padding-top:150px;">

       
           <form:form  action="/addcourse" modelAttribute="a" method="POST">
            
            
            <div class="form-group row" >
					<label class="col-sm-2 col-form-label" style="margin-left:580px">Course Name</label>
					<div class="col-sm-2">
						<form:input type="text" class="form-control" 
							path="courseName"  />
					  <form:errors path="courseName" class="text-danger"/>
                       
                   </div>
            </div>
            <div class="form-group row" >
					<label class="col-sm-2 col-form-label" style="margin-left:580px">Price</label>
					<div class="col-sm-2">
						<form:input type="text" class="form-control" 
							path="courseRate"  />
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
        
    </div><!-- /container -->
</div>

</body>
<div class="foot" style="height: 5vh">
	<p style="padding-top: 25px;">Copyright&copy;2019</p>
</div>
</body>
</html>