<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Courses</title>

<style type="text/css">

table, th, td {
  border: 1px solid black;
}


body{
	height: 100%;
	width: 100%;
	background-color: #add8e6;
	background-size: cover;
	position: absolute;
	background-position: center;
}

</style>
</head>
<body>
<h1>Courses</h1>
    <table>
        <tr>
         
            <th>Organisation Name</th>
            <th>Course Name</th>
            <th>Course Description</th>
        </tr>
        <c:forEach items="${CourseList}" var="course">
        <tr>
			<td>${course.orgName}</td>
            <td>${course.courseName}</td>
            <td>${course.courseDesc}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>