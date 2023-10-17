<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>X-Workz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>
    
    <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
		integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
		crossorigin="anonymous"></script>
		<form action="login" method="post">
		<h2 style="color:red">${userId }</h2>
		
		 <nav class="navbar" style="background-color:#e3f2fd;">
  <h3>X-Workz</h3>
      <a href="index.jsp">Home</a><br>
      <a href="Login.jsp">Login</a><br>
      <a href="LoginSuccess.jsp">Success</a>
  
  </nav>
  <div style="background-color:rgb(219,240,181);height:38vh;width:70vh;">
  <div class="mb-3">
 <div id="UserId">User-Id<span style="color: red;">*</span>:<input type="UserId"name="userId"required> 
    </div>
    </div><br>
    <div class="mb-3">
    
 <div id="Password">password<span style="color: red;">*</span>:<input type="password"name="password"required> 
    </div>
    </div><br>
 
  
  <button type="submit" class="btn btn-success">Login</button>
  
 </div>
 </form>
</body>
</html>