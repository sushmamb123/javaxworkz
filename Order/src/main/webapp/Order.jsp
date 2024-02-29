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
					href="index.jsp" role="button">Home</a></li>
				
			</ol>
		</nav>
	</nav>
	<h3>Cake Information!!!</h3>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

	<span style="color:red">
		<c:forEach var="objectErrors" items="${error}">
			${objectErrors.defaultMessage}<br>
		</c:forEach>
	</span>
	
	<form action="cake" method="post" class="p-3 mb-2 bg-secondary text-white">
			 CustomerName: <input type="text" class="form-control" name="customer"
					placeholder="Customer name" value="${dto.getCustomer()}"/> <br>
			Email: <input type="email" class="form-control" name="email"
					placeholder="Customer Email" value="${dto.getEmail()}"/><br>
		
			Flavour :<select name="flavour" class="form-control">
					<option>-Select flavour-</option>
					<option value="Chacolate" <c:if test="${dto.getFlavour()=='Chacolate'}"> selected="selected"</c:if>>Chocolate</option>
					<option value="Strawberry" <c:if test="${dto.getFlavour()=='Strawberry'}"> selected="selected"</c:if>>Pineapple</option>
					<option value="Pista" <c:if test="${dto.getFlavour()=='Pista'}"> selected="selected"</c:if>>Strawberry</option>
				</select><br><br>
			
			
			Weight :<select name="weight" class="form-control">
					<option>-Select weight-</option>
					<option value="1" <c:if test="${dto.getWeight()=='1'}"> selected="selected" </c:if>>1</option>
					<option value="2" <c:if test="${dto.getWeight()=='2'}"> selected="selected" </c:if>>2</option>
					<option value="3" <c:if test="${dto.getWeight()=='3'}"> selected="selected" </c:if>>3</option>
				</select><br><br>
			
		
		Price:
				<input type="number" class="form-control" name="price"
					placeholder="Price" value="${dto.getPrice()}"/><br><br>
			
                <h4>Take Away:</h4>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="takeAway" id="flexRadioDefault1" />
                    <label class="form-check-label" for="flexRadioDefault1" >Yes</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="takeAway" id="flexRadioDefault2" />
                    <label class="form-check-label" for="flexRadioDefault2">No</label>                
                </div>
				<input type="submit" id="button" value="save" class="btn btn-success" />

	</form>
	
</body>
</html>