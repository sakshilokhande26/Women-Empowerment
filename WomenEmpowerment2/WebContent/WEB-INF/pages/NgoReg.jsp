<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NGO Registration</title>
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
	border-radius:60px 60px 0 0 / 50px 50px 0 0;
    padding: 10px 30px;
    
  } 

  .header img {
	float: left;
	width: 120px;
	height: 90px;
	background: #add8e6;
	position: relative;
	bottom: 10px;
	right: 30px;
	

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
	padding: 5px 5px;	
	overflow: hidden;			
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


#logo{
	padding: 7px;
	margin-top: 5px;
	
}


#heading{
	margin: 10px 0px 10px 0px;
}

p{
	font-family: Arial, Helvetica, sans-serif;
	font-size: 15px;
	text-align: center;
padding: 10px 10px;
}

#logout{
	margin-right: 20px;
}

#home1{
	margin-left: 20px;
}


.button {
	background: linear-gradient(to right, #ff105f, #ffad06);
	border: none;
	color: white;
	padding: 10px 30px;
	text-align: center;
	text-decoration: none;
	display: block;
	font-size: 20px;
	margin: auto;
	cursor: pointer;
	border: 0;
	outline: none;
	border-radius: 30px;
	width: 60%;
		
	}

	#next{
		right: 10px;
	}
	
	#logo{

	height: 75px;
	width: 75px;
	float: left;

}

h3{
	font-family: Arial, Helvetica, sans-serif;
	text-align: center;
}


</style>

</head>
<body>

<img id="logo" src="Resources/images/logo.jpg" alt="logo" />

		<div class="topnav1">
				<br>
				 <a class="active" href="#home">Home</a>
                        <a  href="#contactus" style="float: right">Logout</a>
                        <a style="float: right">&nbsp; | &nbsp;</a>
                        <a  href="#logout" style="float: right">ContactUs</a>	
                        <a>&nbsp; &nbsp;</a>		
		</div>
		
        <div class="header">
            Non Governmental Organizations(NGOs)
        </div>

        <div class="topnav2">
                <a href="/pages/Criteria.jsp">CRITERIA</a>
                <a href="showNgoDetails.do">ORGANIZATIONS</a>
                <a href="#funding_norms">FUNDING NORMS</a>
                <a href="#register">REGISTER</a>
                <a href="#status">STATUS</a>
                <a href="#faq">FAQ</a> 
          </div>
          
		<div class="form-box">  
		          <h3>Add New NGO</h3>
		<div class="input_group">
<form action="ngoReg.do"method="POST">
		Enter Organisation Name: <br>
		<input type="text" class="input_field" placeholder="Organisation Name" id="orgName" name="orgName"><br><br>
		Enter Applicant Name:<br>
		<input type="text" class="input_field" placeholder="Applicant Name" id="appName" name="appName"><br><br>
		Enter Pan Number:<br>
		<input type ="text" class="input_field" placeholder=" Pan Number" id="panNo" name="panNo"><br><br>
		Enter Gender:<br>
		<input type="text" class="input_field" placeholder="Gender" id="gender" name="gender"><br><br>
        Enter Designation:<br>
		<input type="text" class="input_field" placeholder="Designation" id="designation" name="designation"><br><br>
		Enter Email: <br>
		<input type="email" class="input_field" placeholder="email" id="email" name="email"><br><br>
		 Enter Contact Number:<br>
		<input type="number" class="input_field" placeholder="Contact Number" id="contactNo" name="contactNo"><br><br>
		Enter Organisation Website: <br>
		<input type="text" class="input_field" placeholder="Organisation Website" id="website" name="website"><br><br>
        Enter  Address:<br>
		<input type="text" class="input_field" placeholder="Address" id="address" name="address"><br><br>
		<input type="submit" class="submit_btn" value="Save">
		</form>
		</div>
		</div>

</body>
</html>