<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">


body{
	height: 100%;
	width: 100%;
	background-image: url("paper.gif");
	background-color: #add8e6;
	background-position: center;
	background-size: cover;
	position: absolute;
}


.topnav1{
	
	background-color: #333;
    overflow: hidden;
}



 .header {
	font-family: Arial, Helvetica, sans-serif;
    font-size: x-large;
    text-align: center;
	border-radius:60px 60px 0 0 / 50px 50px 0 0;
    padding: 10px 30px;
    
  } 

  
  .topnav1 a{
    float: left;
   	color: #f2f2f2;
   	text-align: center;
  	text-decoration: none;
	  font-size: 20px;
	  font-family: Arial, Helvetica, sans-serif;
  }

  .topnav2 {
  background-color: #333;
  overflow: hidden;
  position: relative;
  right: 20px;
  width: 100%;
  margin-left: 10px;
}
  
.topnav2 a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 10px 16px;
  text-decoration: none;
  font-size: 15px;
  margin-left: 50px;
  
}


.form-box{
	height: 1000px;
	width: 400px;
	position: relative;
	margin: 6% auto;
	background: #fff;
	padding: 5px;	
	overflow: hidden;			
}

.submit_btn{
	width: 85%;
	padding: 10px 30px;
	cursor: pointer;
	display: block;
	margin: auto;
	background: linear-gradient(to right, #ff105f, #ffad06);
	border: 0;
	outline: none;
	border-radius: 30px;
}


.input_group{
	top: 80px;
	left: 60px;
	position: absolute;
	width: 280px;
}

.input_field{
	width: 100%;
	padding: 10px 0;
	margin: 5px 0;
	border-left: 0;
	border-right: 0;
	border-top: 0;
	border-bottom: 1px solid #999;
	outline: none;
	background: transparent;
}

p{
	font-family: Arial, Helvetica, sans-serif;
	font-size: 15px;
	text-align: center;
padding: 10px 10px;
}

#heading{
	margin: 10px 0px 10px 0px;
}

#logo{
	padding: 7px;
	margin-top: 5px;
	
}

#logout{
	margin-right: 20px;
}

#home1{
	margin-left: 20px;
}


#logo{
	height: 75px;
	width: 75px;
	float: left;
}
 
</style>

<title>STEP Registration</title>
</head>
<body>
        <img id="logo" src="Resources/images/logo.jpg" alt="logo" />
		<div class="topnav1">
				<br>
				 <a id="home1" class="active" href="#home">Home</a>
                        <a id="logout" href="#contactus" style="float: right">Logout</a>
                        <a style="float: right">&nbsp | &nbsp</a>
                        <a id= href="#logout" style="float: right">ContactUs</a>			
		</div>


		<div class="header">
		    <h3 id="heading">Support to Training and Employment Programme for Women (STEP)</h3>
      </div>
      
      
      <div class="topnav2">
            <a href="#aboutus">About Us</a>
           <a href="#guidelines">Guidelines</a>
            <a href="showCourses.do">Training Sectors</a>
            <a href="showNgoDetails.do">NGOs</a>
            <a class="active"  href="stepDetails.do">Registration</a>
            <a href="#status">Status</a>
            <a href="#faq">FAQ</a>
      </div>


			<div class="form-box">
				<p>STEP Registeration</p>
				<div class="input_group">
		<form action="stepDetails.do" method="POST">
                    <input type="text" class="input_field" placeholder="User Name" name="userName" required><br>
					 <input type="text" class="input_field" placeholder="First Name"  name="userName" required><br>
					 <input type="text" class="input_field" placeholder="Last name="lastName" required><br>
					 <input type="date" class="input_field" placeholder="Date of Birth" name="dob" required><br>
					<input type="number" class="input_field" placeholder="Contact Number" name="contactNo" required><br>
					<input type="email" class="input_field" placeholder="Email Id" name="email" required><br>
                    <input type="text" class="input_field" placeholder="Address"  name="address" required><br> 
                    <input type="text" class="input_field" placeholder="Nationality" name="nationality" required><br>
                    <input type="text" class="input_field" placeholder="Qualification" name="qualification" required><br>
                     <input type="text" class="input_field" placeholder="Father Name" name="fatherName" required><br>
                     <input type="text" class="input_field" placeholder="Father's Occupation" name="fOccupation" required><br>
                    <input type="text" class="input_field" placeholder="Mother Name" name="motherName" required><br>
                     <input type="text" class="input_field" placeholder="Mother's Occupation" name="mOccupation" required><br>
                     <input type="text" class="input_field" placeholder="Sibling's Occupation" name="sOccupation"required><br>
                     <input type="number" class="input_field" placeholder="Ngo Id" required><br>
                    <input type="text" class="input_field" placeholder="Course" required><br>
					<button type="submit" class="submit_btn">Register</button>
					</form>
				</div>
			</div>
</body>
</html>