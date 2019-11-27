<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
body{
	height: 100%;
	width: 100%;
	background-color: #add8e6;
	background-size: cover;
	position: absolute;
	background-position: center;
}

  .header {
	font-family: Arial, Helvetica, sans-serif;
    font-size: x-large;
    text-align: center;
	border-radius:60px 60px 0 0 / 50px 50px 0 0;
    padding: 10px 30px;
    
  } 
  
  h3{
  	text-align: center;
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


</style>

<title>NGO Details</title>
</head>
<body>

		<div class="form-box">  
		 <h3>Enter NGO Details</h3>
<form action="ngoDetails.do" method="post">

         <%-- <input type=hidden name=ngoId  value=${ngoReg.ngoId }> --%>
		<input type="hidden"  name="orgName" value="${sessionScope.orgName}"><br><br> 
         Enter Organisation Objective: <br>
		<input type="text" class="input_field" placeholder="Organisation Objective"name="orgObj"><br><br>
		Enter Organisation Vision:<br>
		<input type="text" class="input_field" placeholder="Organisation Vision"  name="orgVision"><br><br>
		Enter Organisation Mission:<br>
		<input type ="text" class="input_field" placeholder=" Organisation Mission"  name="orgMission"><br><br>
		Enter Purpose:<br>
		<input type="text" class="input_field" placeholder="Purpose"  name="orgPurpose"><br><br>
       Number of Courses :<br>
		<input type="text" class="input_field" placeholder="Course Number"  name="courseNo"><br><br>
		
		<input type="submit" class="submit_btn" value="Save"/>
		</form>
		</div>
</body>
</html>