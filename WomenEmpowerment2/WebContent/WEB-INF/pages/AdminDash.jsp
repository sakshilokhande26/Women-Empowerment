<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Dashboard</title>
<style type="text/css">
body{
	height: 100%;
	width: 100%;
	background-color: #add8e6;
	background-size: cover;
	position: absolute;
	background-position: center;
}

.topnav1{
	
	background-color: #333;
	 overflow: hidden;
 }

 .topnav1 a{
    float: left;
   	color: #f2f2f2;
   	text-align: center;
  	text-decoration: none;
	  font-size: 20px;
	  font-family: Arial, Helvetica, sans-serif;
  }
  
   .header {
	font-family: Arial, Helvetica, sans-serif;
    font-size: x-large;
    text-align: center;
    border: 2px solid black;
    padding: 10px 30px;
  }
  
  
  .topnav2 {
  background-color: #333;
  overflow: hidden;
}
  
.topnav2 a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

</style>
</head>
<body>

		<div class="topnav1">
				<br>
				 <a class="active" href="afterLogin.do">Home</a>
                        <a  href="#contactus" style="float: right">Logout</a>
                        <a style="float: right">&nbsp | &nbsp</a>
                        <a  href="#logout" style="float: right">ContactUs</a>			
		</div>
		
		        <div class="topnav2">
                <a href="showNgoRegistration.do">NGOs</a>
                <a href="showTraineeDetails.do">Trainees</a>
          </div>

		<div class="header">
		Admin Dashboard
      	</div>
      	
      	

</body>
</html>