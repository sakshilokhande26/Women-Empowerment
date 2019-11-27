<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NGOs</title>
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
<h1>Added NGOs</h1>

<table>
<tr>

            <th>Organisation Name</th>
            <th>Applicant Name</th>
            <th>Pan Number</th>
            <th>Designation</th>
            <th>Email</th>
            <th>Contact Number</th>
            <th>Website</th>
            <th>Address</th>
            <th>Status</th>
            
 </tr>

   <c:forEach items="${ngoRegList}" var="ngoReg">
   <tr>
          <%--   <td><c:out value ="${ngoReg.ngoId}"></c:out></td> --%>
            <td><c:out value ="${ngoReg.orgName}"></c:out></td>
            <td><c:out value ="${ngoReg.appName}"></c:out></td>
            <td><c:out value ="${ngoReg.panNo}"></c:out></td>
            <td><c:out value ="${ngoReg.gender}"></c:out></td>
            <td><c:out value ="${ngoReg.designation}"></c:out></td>
            <td><c:out value ="${ngoReg.email}"></c:out></td>
            <td><c:out value ="${ngoReg.contactNo}"></c:out></td>
            <td><c:out value ="${ngoReg.website}"></c:out></td>
            <td><c:out value ="${ngoReg.address}"></c:out></td>
            <td><a href=approveNgo.do?ngoId=${ngoReg.ngoId}>
             <input  type="button" value="Approve" /></a></td>
            <td><a href=rejectNgo.do?ngoId=${ngoReg.ngoId}>  
            <input type="button"value="Reject" /></a></td>
            </tr>
        </c:forEach>
</table>
 </body>
</html>