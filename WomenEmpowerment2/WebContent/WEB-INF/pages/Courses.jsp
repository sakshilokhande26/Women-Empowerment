<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Courses</title>
<style type="text/css">

body{
	height: 100%;
	width: 100%;
	background-color: #add8e6;
	background-size: cover;
	position: absolute;
	background-position: center;
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

<div class="form-box">
 <h3>Enter Courses</h3>
<div class="input_group">

<form action="courses.do" method="post">
<%-- <input type=hidden name=ngoId  value=${ngoReg.ngoId }> --%>
			<input type="hidden" name=orgName value="${sessionScope.orgname}">
			Enter Course Name: <br>
			<input type="text" class="input_field" placeholder="Course Name"  name="courseName"><br><br>
         	Enter Course Description: <br>
			<input type="text" class="input_field" placeholder="Course Objective"  name="courseDesc"><br><br>
			<input type="submit" class="submit_btn"  value="Submit"/>
			</form>
</div>
</div>	
</body>
</html>