<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" >

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Login</title>
   <link rel="stylesheet" href="css/style.css">
   
</head>

<body>

  <div class="wrapper">
	<div class="container">
		<h1>Sign Up</h1>
			<form class="form" action="signup">
			<input type="text"name="name" placeholder="Name">
			<input type="password" name="email" placeholder="Email">
			<input type="text" name="password" placeholder="Password">
			<button type="submit" id="login-button">Login</button>
			<h3><a href=index.jsp style="text-decoration:none;color:white;">I Already have a account.</a></h3>
		</form>
	 </div>
  </div>
</body>

</html>
