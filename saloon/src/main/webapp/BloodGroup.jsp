<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring mvc</title>
</head>
<body>
	<h1>Blood Information.....</h1>
	<form action="blood" class="p-3 mb-2 bg-secondary text-white"
		method="post">
		Name: <input type="text" placeholder="Name" name="name" /><br> <br>
		BloodGroup: <input type="text" placeholder="BloodGroup" name="group" /><br>
		<br> 
		Age: <input type="number" placeholder="Age" name="age" /><br>
		<br> 
		Weight: <input type="number" placeholder="Weight"
			name="weight" /><br> <br> 
			Gender:<select name="gender">
			<option>choose....</option>
			<option>Male</option>
			<option>Female</option>
		</select> 
		AnySickness:<select name="anySickness">
			<option>choose....</option>
			<option>Yes</option>
			<option>No</option>
		</select> 
		Alcohol:<select name="alcohol">
			<option>choose....</option>
			<option>Yes</option>
			<option>No</option>
		</select> 
		<input type="submit" value="save" class="btn btn-success" />


	</form>

</body>
</html>