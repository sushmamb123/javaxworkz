<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring mvc</title>
</head>
<body>
	<h1>Information page.....</h1>
	<form action="info" class="p-3 mb-2 bg-secondary text-white"
		method="post">
		Name: <input type="text" placeholder="Name" name="name" /><br> <br>
		Email: <input type="text" placeholder="Email" name="email" /><br>
		<br> 
		MobileNo: <input type="number" placeholder="MobileNo" name="mobileNo" /><br>
		<br> 
		Source:<select name="source">
		<option>Choose...</option>
		<option>Tamilnadu</option>
		<option>Bijapur</option>
		<option>Gugurat</option>
		<option>Raichur</option>
		</select>
		Destination<select name="destination">
		<option>choose..</option>
		<option>Rajajinagar</option>
		<option>Bangalore</option>
		<option>Mangalore</option>
		<option>Hassan</option>
		</select>
		TotalTickets<select name="totalTickets">
		<option>choose..</option>
		<option>1</option>
		<option>2</option>
		<option>3</option>
		<option>4</option>
		<option>5</option>
		<option>6</option>
		<option>7</option>
		<option>8</option>
		<option>9</option>
		<option>10</option>
		
		</select>
		<input type="submit" value="save" class="btn btn-success" />


	</form>

</body>
</html>