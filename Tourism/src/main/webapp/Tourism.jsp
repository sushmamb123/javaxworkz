<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring mvc</title>
</head>
<body>
	<h1>Tourism Information.....</h1>
	<form action="tour" class="p-3 mb-2 bg-secondary text-white"
		method="post">
		Name: <input type="text" placeholder="Name" name="name" /><br> <br>
		Country: <input type="text" placeholder="Country" name="country" /><br>
		<br> 
		Location: <input type="text" placeholder="Location" name="location" /><br>
		<br> 
		Pincode: <input type="number" placeholder="Pincode" name="pincode" /><br>
		<br> 
		Since: <input type="number" placeholder="Since" name="since" /><br>
		<br> 
		
		<input type="submit" value="save" class="btn btn-success" />


	</form>

</body>
</html>