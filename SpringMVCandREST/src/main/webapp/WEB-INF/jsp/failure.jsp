<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Failure</title>
<link href="../../assets/css/bootstrap-united.css" rel="stylesheet" />

</head>
<body>
	<script src="../../jquery-1.8.3.js">
		
	</script>

	<script src="../../bootstrap/js/bootstrap.js">
		
	</script>

	<div class="navbar navbar-default">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-responsive-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>

		<div class="navbar-collapse collapse navbar-responsive-collapse">
			<form class="navbar-form navbar-right">
				<input type="text" class="form-control" placeholder="Search">
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/spring">Home</a></li>
				<li><a href="signup">Signup</a></li>
				<li class="active"><a href="login">Login</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Explore<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Contact us</a></li>
						<li class="divider"></li>
						<li><a href="#">Further Actions</a></li>
					</ul></li>
			</ul>
		</div>
		<!-- /.nav-collapse -->
	</div>

	
	<div class="panel panel-danger">
		<div class="panel-heading">
			<h3 class="panel-title">Customer Login failure</h3>
		</div>
		<div class="panel-body">
			<div class="alert alert-dismissable alert-danger">
				<button type="button" class="close" data-dismiss="alert">�</button>
				<strong>Oh snap!</strong> Something is wrong. Change a few things up
				and try submitting again.
			</div>
		</div>
	</div>
	<div></div>
	<div></div>

	<a class="btn btn-primary" href="login">Try
		again?</a>
</body>
</html>