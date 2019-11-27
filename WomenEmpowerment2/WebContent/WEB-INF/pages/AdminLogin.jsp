<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
<style type="text/css">


body{
	height: 100%;
	width: 100%;
	background-color: #add8e6;
	background-position: center;
	background-size: cover;
	position: absolute;
}

 .header{
	
	    font-family: Arial, Helvetica, sans-serif;
	    font-size: x-large;
	    text-align: center;
		border: 2px solid black;

		
}
.header img {
	float: left;
	width: 100px;
	height: 105px;
	background: #add8e6;
	position: relative;
	top: -27px;
	

  }

h3{
font-family: Arial, Helvetica, sans-serif;
	text-align: center;
}

 


.form-box{
	height: 580px;
	width: 400px;
	position: relative;
	margin: 6% auto;
	background: #fff;
	padding: 5px;	
	overflow: hidden;			
}


.button-box{
	width: 220px;
	margin: 35px auto;
	position: relative;
	box-shadow: 0 0 20px 9px #ff61241f;
	border-radius: 30px;
}



.toggle_btn{
	padding: 10px 30px;
	cursor: pointer;
	background: transparent;
	border: 0;
	outline: none;
	position: relative;
}


#btn{
	top: 0;
	left: 0;
	position: absolute;
	width: 130px;
	height: 100%;
	background: linear-gradient(to right, #ff105f, #ffad06);
	border-radius: 30px;
	transition: .5s;
}


.input_group{
	top: 180px;
	position: absolute;
	width: 280px;
	transition: .5s;
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

#login{
	left: 50px;
}

#register{
	left: 450px;
}



.topnav {
  background-color: #333;
  overflow: hidden;
}


.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}


.topnav a:hover {
  background-color: #ddd;
  color: black;
}


.topnav a.active {
	background: linear-gradient(to right, #ff105f, #ffad06);
  	color: white;
}

.dropdown {
	float: left;
	overflow: hidden;
  }
  
  .dropdown .dropbtn {
	font-size: 16px;  
	border: none;
	outline: none;
	color: white;
	padding: 14px 16px;
	background-color: inherit;
	font-family: inherit;
	margin: 0;
  }
  .dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
	z-index: 1;
  }
  
  .dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
  }
  
  .dropdown-content a:hover {
	background-color: #ddd;
  }
  
  .dropdown:hover .dropdown-content {
	display: block;  
  }
</style>
</head>
<body>
	<div class="main">
		<div class="header">
				<img src="Resources/images/logo.jpg" alt="logo" width="200px" height="100px" style="margin-top:30px;"/>
				<h2>Ministry Of Women And Child Development</h2>
		</div>

		<div class="topnav">
  			<a href="about.do">About Us</a>
			 <a href=""></a>
			 
			 <div class="dropdown">
					<button class="dropbtn">Legislation & Policy
					  <i class="fa fa-caret-down"></i>
					</button>
					<div class="dropdown-content">
					  <a href="file:///C:/Users/AE103_PC18/Desktop/New%20folder/womenlegislations.html">Women related Legislations</a>
					  <a href="file:///C:/Users/AE103_PC18/Desktop/New%20folder/ChildLegislations.html">Child related Legislations</a>
					  <a href="file:///C:/Users/AE103_PC18/Desktop/New%20folder/other.html">Other Legislations</a>
					</div>
				  </div> 
				  
				  <a href="userLogin.do">STEP</a>
			  
			  <div class="dropdown">
					<button class="dropbtn">NGO
					  <i class="fa fa-caret-down"></i>
					</button>
					<div class="dropdown-content">
					  <a href="#">Criteria</a>
					  <a href="userLogin.do">Organization</a>
					  <a href="#">Funding Norms</a>
					  <a href="file:///C:/Users/AE103_PC18/Desktop/New%20folder/ngoreg.html">Registration</a>
					  <a href="#">Status</a>
					  <a href="#">FAQ</a>
					</div>
				  </div> 
				  
						  

  			<a href="#admin">Admin</a>
  			<a href="#faq">FAQ</a>
		</div>

			<div class="form-box">
<h3>Admin Login</h3>
	
	<form action="adminDash.do" method="get">
		Enter UserName:<br>
		<input type="text" placeholder="UserName" class="input_field"name="userName"><br><br>
		Enter Password:<br>
		<input type="password" placeholder="Password" class="input_field" name="pass"><br><br>
		<input type="submit" class="submit_btn" value="Login"><br><br>
		
	</form>
</body>
</html>