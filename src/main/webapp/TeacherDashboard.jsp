<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Dashboard</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<style type="text/css">
body {
	background-image:
		url('https://www.daysoftheyear.com/wp-content/uploads/world-student-day1.jpg');
	background-repeat: no-repeat;
	background-size: cover;
}

.navbar {
	background-color: #212121;
}

.navbar-brand {
	color: #f5f5f5;
	font-size: 24px;
	font-weight: bold;
	letter-spacing: 1px;
}

.nav-link {
	color: #f5f5f5 !important;
	font-size: 18px;
	font-weight: 500;
	letter-spacing: 0.5px;
	margin-left: 15px;
	margin-right: 15px;
}

.nav-link:hover {
	color: #ffc107 !important;
}

.container {
	display: flex;
	flex-direction: column;
	align-items: center;
	padding: 30px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
	margin-top: 50px;
	max-width: 800px;
	margin: 0 auto;
	height: 100vh;
	background-color: rgba(255, 255, 255, 0.8);
	border-radius: 10px;
}

.title {
	font-size: 36px;
	font-weight: bold;
	color: #212121;
	background-color: #f5f5f5;
	border-color: #bdbdbd;
	border-radius: 5px;
	transition: all 0.3s ease;
	cursor: pointer;
	text-align: center;
	padding: 15px;
	margin-top: 50px;
	margin-bottom: 30px;
	box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.2);
	width: 100%;
}

.subtitle {
	font-size: 20px;
	color: #212121;
	margin-bottom: 50px;
	text-align: center;
	width: 100%;
}

.btn {
	margin: 10px;
	padding: 10px 20px;
	font-size: 18px;
	font-weight: bold;
	color: #f5f5f5;
	background-color: #ffc107;
	border-color: #ffc107;
	border-radius: 5px;
	transition: all 0.3s ease;
	cursor: pointer;
}

.btn:hover {
	background-color: #ff9800;
	border-color: #ff9800;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<a class="navbar-brand" href="#">Teacher Dashboard</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link"
					href="StudentDisplay.jsp">Student Register Details</a></li>
				<li class="nav-item"><a class="nav-link" href="StudentErp.html">Log
						Out</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h1 class="title">Teacher Dashboard</h1>
		<h2 class="subtitle">Manage Student Results:</h2>

		<div class="container text-center">
			<div class="row row-cols-3">

				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Create Student Result</h5>
						<p class="card-text">Click the button below to insert a
							student's result.</p>
						<a href="InsertResult.jsp" class="btn btn-primary">Insert</a>
					</div>
				</div>

				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Update Student Result</h5>
						<p class="card-text">Click the button below to update a
							student's result.</p>
						<a href="UpdateResult.jsp" class="btn btn-primary">Update</a>
					</div>
				</div>

				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Delete Student Result</h5>
						<p class="card-text">Click the button below to delete a
							student's result.</p>
						<a href="DeleteResult.jsp" class="btn btn-primary">Delete</a>
					</div>
				</div>

				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Assignment Submission</h5>
						<p class="card-text">Click the button below to check Submission.</p>
						<a href="AssignmentDisplay.jsp" class="btn btn-primary">Submission</a>
					</div>
				</div>

				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Financial Accounts status</h5>
						<p class="card-text">Click the button below to check pending fees</p>
						<a href="DisplayFeePayment.jsp" class="btn btn-primary">Fees</a>
					</div>
				</div>



			</div>
		</div>
	</div>
	
	<!-- Bootstrap JS (optional, if you need to use Bootstrap's JavaScript components) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
