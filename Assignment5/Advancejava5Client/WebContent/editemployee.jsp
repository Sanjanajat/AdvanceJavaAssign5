<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
<link href="resources/css/editemployee.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #56baed;">
  <span class="navbar-brand mb-0 h1">Nagarro</span>
    <form class="form-inline my-2 my-lg-0">
      <button class="btn btn-dark my-2 my-sm-0" type="submit">Logout</button>
    </form>
</nav>
<div class="container marg">
      <h3 align="center">Edit Employee Details</h3><br> 
      <div class="col-md-10 col-sm-10">
			<form class="g-3">
				<div class="col-auto">
					<label for="employeecode">Employee Code</label> 
					<input name="employeecode" type="text" readonly class="form-control-plaintext"
						id="employeecode" value="1099">
				</div>
			
				<div class="col-auto">
					<label for="employeename">Employee Name : </label>
					<input type="text" class="form-control" id="employeename" name="employeename"
						placeholder="Employee Name">
				</div>
				
				<div class="col-auto">
					<label for="location">Location : </label>
					<input type="text" class="form-control" id="location" name="location"
						placeholder="Location">
				</div>
				
				<div class="col-auto">
					<label for="email">Email : </label>
					<input type="email" class="form-control" id="email" name="email"
						placeholder="example@email.com">
				</div>
				
				<div class="col-auto marg-birth">
				  <label for="dateofbirth">Date of birth : </label> <input
						type="date" id="dateofbirth" name="dateofbirth" required> 
				</div>
				
				<div class="col-auto">
					<button type="submit" class="btn btn-success mb-3">Save </button>
					<button type="reset" class="btn btn-dark mb-3">Cancel </button>
				</div>
			</form>

		</div>
</div>

</body>
</html>