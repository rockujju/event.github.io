<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
 <div class="wrapper">
	<div class="container">
		<h1>Welcome </h1>
		
		<form class="form" action="login">
			<input type="text" name="email" placeholder="Email">
			<input type="password" name="password" placeholder="Password">
			<button type="submit" id="login-button">Login</button>
			<h3><a href=signup.jsp style="text-decoration:none;color:white;">I don't have a account.</a></h3>
		</form>
	 </div>
  </div>
</body>
</html>