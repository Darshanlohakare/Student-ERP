<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
.container {
  max-width: 500px;
  margin: 50px auto;
}

.form-group {
  margin-bottom: 20px;
}

label {
  font-weight: bold;
}

.btn {
  margin-top: 20px;
}

.id{
text-align: center;
}  
.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.css{
 position: absolute;
    
    top: 50%;
    
    left: 50%;
    
    width: 400px; padding: 40px;
    
    transform: translate(-50%, -50%);
    
   
    
    background: linear-gradient(180deg, #52ACFF 25%, #FFE32C 100%);
    box-sizing: border-box;
    
    box-shadow: 0 15px 25px rgba(0,0,0,6);
    
    border-radius: 10px;
    color:black; 
}
</style>
</head>
<body>
<div class="centered">
<div class="id">
<div class="css">
	<div class="container">
		<h1>Teacher Registration</h1>
		<form action="TeacherCreate">
			<div class="form-group"><br>
				<label for="techId">Enter Teacher Id:</label>
				<input type="text" class="form-control" id="techId" name="techId">
			</div>
			<div class="form-group">
				<label for="techName">Enter Teacher Name:</label>
				<input type="text" class="form-control" id="techName" name="techName">
			</div>
			<div class="form-group">
				<label for="email">Enter Email:</label>
				<input type="email" class="form-control" id="email" name="email">
			</div>
			<div class="form-group">
				<label for="password">Enter Password:</label>
				<input type="password" class="form-control" id="password" name="password">
			</div>
			<button type="submit" class="btn btn-primary">Register</button>
		</form>
		<div class="text-center">
      <p>Already have an account? <a href="TeacherLogin.jsp">Log in here</a></p>
    </div>
	</div>
	
</div>
</div>
</div>	
</body>
</html>
