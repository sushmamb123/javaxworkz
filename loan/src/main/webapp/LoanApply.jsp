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
		<form action="loan" method="post">
		
		 <nav class="navbar" style="background-color:#e3f2fd;">
  <h3>X-Workz</h3>
      <a href="index.jsp">Home</a><br>
      <a href="LoanApply.jsp">Loan</a>
  
  </nav>
  <h1>Digital information form of Loan</h1>
  <div style="background-color:rgb(219,240,181);height:125vh;width:70vh;">
  <div class="mb-3">
  Name:<input type="text" class="form-control" placeholder="Name" name="name">
  </div><br>
    <div class="mb-3">
  Amount:<input type="number" class="form-control" placeholder="Amount" name="amount">
  </div><br>
   <div class="mb-3">
  Working:<input type="text" class="form-control" placeholder="Working" name="working">
  </div><br>
   <div class="mb-3">
  Interest:<input type="number" class="form-control" placeholder="Interest" name="interest">
  </div><br>
    <div class="mb-3">
  Surety:<input type="text" class="form-control" placeholder="Surety" name="surety">
  </div><br>
  <div class="mb-3">
   Company:<input type="text" class="form-control" placeholder="Company" name="company">
  </div><br>
  <div class="mb-3">
   Loan Tenure:<input type="text" class="form-control" placeholder="LoanTenure" name="loanTenure">
  </div><br>
    <div class="mb-3">
   Loan Type:<input type="text" class="form-control" placeholder="LoanType" name="loanType">
  </div><br>
    <div class="mb-3">
  </div> 
  
 <div style="text-align:center;">
 <input type="submit" value="Send" class="btn btn-success">
  </div>
  </div>
 </form>
</body>
</html>