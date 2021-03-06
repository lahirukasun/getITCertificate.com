<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

.input-container {
	display: -ms-flexbox; /* IE10 */
	display: flex;
	width: 100%;
	margin-bottom: 15px;
}

.icon {
	padding: 10px;
	background: dodgerblue;
	color: white;
	min-width: 50px;
	text-align: center;
}

.input-field {
	width: 100%;
	padding: 10px;
	outline: none;
}

.input-field:focus {
	border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
.btn {
	background-color: dodgerblue;
	color: white;
	padding: 15px 20px;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.btn:hover {
	opacity: 1;
}
</style>
</head>
<body>

	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="http://localhost:9090/sep/">GET IT
					CERTIFICATION </a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="http://localhost:9090/sep/loginUser">Login</a></li>
				<li><a href="http://localhost:9090/sep/saveUser">Register</a></li>
			</ul>
		</div>
	</nav>

	<form action="saveUser" method="post" style="max-width: 500px; margin: auto">
		<h2>Register Form</h2>

		<div class="input-container">
			<i class="fa fa-user icon"></i> <input class="input-field"
				type="text" placeholder="First Name" name="firstname">
		</div>

		<div class="input-container">
			<i class="fa fa-user icon"></i> <input class="input-field"
				type="text" placeholder="Last Name" name="lastname">
		</div>

		<div class="input-container">
			<i class="fa fa-user icon"></i> <input class="input-field"
				type="text" placeholder="Username" name="username">
		</div>

		<div class="input-container">
			<i class="fa fa-envelope icon"></i> <input class="input-field"
				type="text" placeholder="Mobile" name="mobile">
		</div>

		<div class="input-container">
			<i class="fa fa-envelope icon"></i> <input class="input-field"
				type="text" placeholder="Email" name="email">
		</div>

		<div class="input-container">
			<i class="fa fa-key icon"></i> <input class="input-field"
				type="password" placeholder="Password" name="userpassword">
		</div>

		<button type="submit" class="btn">Register</button>
	</form>

</body>
</html>
