<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NGO Details</title>
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
    border: 2px solid black;
    padding: 10px 30px;
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

table, th, td {
  border: 1px solid black;
}

</style>
</head>
<body>
<div class="header">Non Governmental Organisations</div>

      <div class="topnav2">
            <a href="#criteria">Criteria</a>
            <a class="active" href="#guidelines">Organization</a>
            <a href="showCourses.do">Funding Norms</a>
            <a href="ngoReg.do">Register</a>
            <a href="#status">Status</a>
      </div>


    <table>
        <tr>
            <th>Ngo Id</th>
            <th>Organisation Name</th>
            <th>Organisation Objective</th>
            <th>Organisation Vision</th>
            <th>Organisation Mission</th>
            <th>Organisation Purpose</th>
            <th>Course Number</th>
        </tr>
        <c:forEach items="${ngoList}" var="ngo">
        <tr>
            <td>${ngo.ngoId}</td>
            <td>${ngo.orgObj}</td>
            <td>${ngo.orgVision}</td>
            <td>${ngo.orgMission}</td>
            <td>${ngo.orgPurpose}</td>
            <td>${ngo.courseNo}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>