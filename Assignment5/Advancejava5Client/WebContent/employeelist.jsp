<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Listing</title>
<link href="resources/css/employeelist.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #56baed;">
  <span class="navbar-brand mb-0 h1">Nagarro</span>
  <span>Welcome user!</span>
    <form class="form-inline my-2 my-lg-0">
      <button class="btn btn-dark my-2 my-sm-0" type="submit">Logout</button>
    </form>
</nav>
<div class="container marg">
      <h3 align="center">Employee Listings</h3><br> 
      <div class="text-right">
    	  <button type="button" class="btn btn-outline-success">Upload Employee Details</button>
    	  <button type="button" class="btn btn-outline-info">Download Employee Details</button>
      </div>
      <div class="row marg">
         <div class="col-md-12 col-sm-12">
         <table class="table">
			<tr>
				<td>Employee Code</td>
				<td>Employee Name</td>
				<td>Location</td>
				<td>Email</td>
				<td>Date Of Birth</td>
				<td>Action</td>
			</tr>
			<tr>
				<td>111</td>
				<td>Sanjana Jat</td>
				<td>Ujjain</td>
				<td>sanjana.jat@nagarro.com</td>
				<td>08/05/1998</td>
				<td><a href="#">Edit</a></td>
			</tr>
		</table>
         </div>
      </div>
	</div>
</body>
</html>