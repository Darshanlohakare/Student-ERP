<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<style>
.container {
  max-width: 500px;
  margin: 50px auto;
}

.form-group {
  margin-bottom: 20px;
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

<body>
<div class="centered">
<div class="id">
<div class="css">
  <div class="container">
    <h1 class="text-center">Student Register</h1>
    <form action="StudentCreate">
      <div class="form-group">
        <label class="label-bold" for="studId">Enter Student Id:</label>
        <input type="text" class="form-control" id="studId" name="studId">
      </div>
      <div class="form-group">
        <label class="label-bold" for="studName">Enter Student Name:</label>
        <input type="text" class="form-control" id="studName" name="studName">
      </div>
      <div class="form-group">
        <label class="gender-label label-bold">Gender:</label>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" id="male" name="gender" value="male">
          <label class="form-check-label" for="male">Male</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" id="female" name="gender" value="female">
          <label class="form-check-label" for="female">Female</label>
        </div>
      </div>
      <div class="form-group">
        <label class="label-bold" for="studMob">Enter Student MobNo:</label>
        <input type="text" class="form-control" id="studMob" name="studMob">
      </div>
      <div class="form-group">
        <label class="label-bold" for="email">Enter Student Email Id:</label>
        <input type="email" class="form-control" id="email" name="email">
      </div>
      <div class="form-group">
        <label class="label-bold" for="password">Enter Password:</label>
        <input type="password" class="form-control" id="password" name="password">
      </div>
      <button type="submit" class="btn btn-primary btn-register">Register</button>
    </form>
    <div class="text-center">
      <p>Already have an account? <a href="StudentLogin.jsp">Log in here</a></p>
    </div>
  </div>
  
  </div>
  </div>
  </div>
</body>
</html>
