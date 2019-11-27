<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
@charset "ISO-8859-1";


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
 
 .header {
	font-family: Arial, Helvetica, sans-serif;
    font-size: x-large;
    text-align: center;
    border: 2px solid black;
    padding: 10px 30px;
  } 
  .topnav1 a{
    float: left;
   	color: #f2f2f2;
   	text-align: center;
  	text-decoration: none;
  	font-size: 15px;
  }
  
  .form-box{
	height: 1300px;
	width: 600px;
	position: absolute;
	margin: 6% auto;
	background: #fff;
	padding: 5px;	
	overflow: hidden;			
}

.submit_btn{
	width: 70%;
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


#container div{
    display:inline-block;
	width:130px;
	text-align: center;
}

.upload-btn-wrapper {
	position: relative;
	overflow: hidden;
	display: inline-block;
  }
  
  
  .upload-btn-wrapper input[type=file] {
	font-size: 20px;
	position: absolute;
	background: linear-gradient(to right, #ff105f, #ffad06);
	left: 0;
	top: 0;
	opacity: 0;
  }
</style>
<title>Hostel Registeration</title>
</head>
<body>

<div class="topnav1">
				<br>
				 <a class="active" href="#home">Home</a>
                        <a  href="#contactus" style="float: right">Logout</a>
                        <a style="float: right">&nbsp | &nbsp</a>
                        <a  href="#logout" style="float: right">ContactUs</a>			
</div>


<div class="header">
		Hostel
</div>

<div class="form-box">
				<p>Hostel Registeration</p>

<center>
<!--     <form action="hostelReg.do"method="POST"> -->
				<div class="input_group">
				<form action="hostelReg.do"method="POST">
                    <input type="text" class="input_field" placeholder="User Name" id="userName" name="userName" required><br>
					 <input type="text" class="input_field" placeholder="First Name" id="firstName" name="firstName" required><br>
					 <input type="text" class="input_field" placeholder="Last Name" id="lastName" name="lastName" required><br>
					 <input type="number" class="input_field" placeholder="Contact Number" id="contactNo" name="contactNo" required><br>

					 <input type="date" class="input_field" placeholder="Date of Birth" id="dob" name="dob" required><br>
					<input type="text" class="input_field" placeholder="Address"  id="address" name="address" required><br>
                    <input type="number" class="input_field" placeholder="Income" id="income" name="income" required><br> 
                    <input type="text" class="input_field" placeholder="Marital Status" id="maritalStatus" name="maritalStatus"required><br>
                    <input type="text" class="input_field" placeholder="Children" id="children" name="children"required><br>
                     <input type="text" class="input_field" placeholder="Child Gender" id="childGender" name="childGender" required><br>
                     <input type="text" class="input_field" placeholder="Designation" id="desig" name="desig" required><br>
		
 								
								<input class="input_field" type="file" name="myfile" />
								<button class="submit_btn">Upload PDC</button>

								<input class="input_field" type="file" name="myfile" />
								<button class="submit_btn">Upload Domicile</button>

							<br>
					<button type="submit" class="submit_btn">Register</button>
					</form>
				</div>
				</div>
				</center>
</body>
</html>