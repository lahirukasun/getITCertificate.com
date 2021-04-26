<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h2>User Registration</h2>
	<form action="saveUser" method="post">
		<pre>
Id        : <input type="text" name="id"><br />
User name : <input type="text" name="username"><br />
Password  : <input type="Password" name="userpassword"><br />
First Name: <input type="text" name="firstname"><br />
Last Name : <input type="text" name="lastname"><br />
Email     : <input type="text" name="email"><br />
Mobile    : <input type="text" name="mobile"><br />
Is Admin  : <input type="text" name="isadmin"><br />
Level     : <input type="text" name="userlevel">

<input type="submit" value="Register User">

${msg}
</pre>
	</form>
<input type="button" value="View All Users" onclick="allUsers">
</body>
</html>