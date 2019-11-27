<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trainees</title>

<style type="text/css">
body{
	height: 100%;
	width: 100%;
	background-color: #add8e6;
	background-size: cover;
	position: absolute;
	background-position: center;
}

table, th, td {
  border: 1px solid black;
}


</style>
</head>
<body>
<h2>Trainee Details</h2>
<table>
        <tr>
            <th>Username</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Course</th>
        </tr>
        <c:forEach items="${traineeList}" var="trainee">
        <tr>
            <td>${trainee.userName}</td>
            <td>${trainee.firstName}</td>
            <td>${trainee.lastName}</td>
            <td>${trainee.course}</td>
           
        </tr>
        </c:forEach>
    </table>
</body>
</html>