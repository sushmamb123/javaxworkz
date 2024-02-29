<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>x-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<h5 class="text-white h4">X-workz</h5>

		<nav aria-label="breadcrumb">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a class="btn btn-primary"
					href="ScientistSuccess.jsp" role="button">Success</a></li>
				
			</ol>
		</nav>
	</nav>
	<h3>Scientist Information!!!</h3>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

	<span style="color:red">
		<c:forEach var="objectErrors" items="${error}">
			${objectErrors.defaultMessage}<br>
		</c:forEach>
	</span>
	
	<form action="scientist" method="post" class="p-3 mb-2 bg-secondary text-white">
			 Name: <input type="text" class="form-control" name="name"
					placeholder="Scientist name" value="${dto.getName()}"/> <br>
			Field :<select name="field" class="form-control">
					<option>-Select field-</option>
					<option value="Physics" <c:if test="${dto.getField()=='Physics'}"> selected="selected"</c:if>>Physics</option>
					<option value="Biology" <c:if test="${dto.getField()=='China'}"> selected="selected"</c:if>>Biology</option>
					<option value="Chemistry" <c:if test="${dto.getField()=='Nepal'}"> selected="selected"</c:if>>Chemistry</option>
				</select><br><br>
			Experience: <input type="number" class="form-control" name="experience"
					placeholder="Experience" value="${dto.getExperience()}"/><br>
		
			Country :<select name="country" class="form-control">
					<option>-Select country-</option>
					<option value="India" <c:if test="${dto.getCountry()=='India'}"> selected="selected"</c:if>>India</option>
					<option value="China" <c:if test="${dto.getCountry()=='China'}"> selected="selected"</c:if>>China</option>
					<option value="Nepal" <c:if test="${dto.getCountry()=='Nepal'}"> selected="selected"</c:if>>Nepal</option>
				</select><br><br>
			
			Achievement:<input type="text" class="form-control" name="achievement"
					placeholder="Achievement" value="${dto.getAchievement()}"/><br><br>
			
               <input type="submit" id="button" value="save" class="btn btn-success" />

	</form>
	
</body>
</html>