<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>All Users</h2>

	<table>
		<tr>
			<th>ID</th>
			<th>User name</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Is Admin</th>
			<th>Level</th>
		</tr>

		<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.username}</td>
			<td>${user.firstname}</td>
			<td>${user.lastname}</td>
			<td>${user.email}</td>
			<td>${user.mobile}</td>
			<td>${user.isadmin}</td>
			<td>${user.userlevel}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>