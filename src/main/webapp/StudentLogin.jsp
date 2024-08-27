<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
	<style>
	.container {
	  max-width: 500px;
	  margin: 50px auto;
	}
	
	.card {
	  padding: 30px;
	  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
	  border-radius: 5px;
	  background-color: #fff;
	}
	
	.card-title {
	  font-size: 24px;
	  font-weight: bold;
	  text-align: center;
	  margin-bottom: 30px;
	}
	
	.alert-danger {
	  margin-bottom: 20px;
	}
	
	.form-group {
	  margin-bottom: 20px;
	}
	
	.btn-login {
	  display: block;
	  width: 100%;
	  padding: 10px 20px;
	  font-size: 18px;
	  font-weight: bold;
	  color: #fff;
	  background-color: #007bff;
	  border-color: #007bff;
	  border-radius: 5px;
	  transition: all 0.3s ease;
	  cursor: pointer;
	}
	
	.btn-login:hover {
	  background-color: #0056b3;
	  border-color: #0056b3;
	}
	
	.register-link {
	  text-align: center;
	  margin-top: 20px;
	}
	
	.register-link a {
	  color: #007bff;
	}
	
	.alert-danger {
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

  <div class="container">
  
    <div class="card">
    <div class="css">
      <h1 class="card-title">Login</h1>
      <% if(request.getAttribute("error")!=null) { %>
      <div class="alert alert-danger">
        <strong>Error!</strong> <%=request.getAttribute("error") %>
      </div>
      <% } %>
      <form action="StudentLogin" method="post">
        <div class="form-group">
          <label for="email">Email</label>
          <input type="email" class="form-control" id="email" name="email">
        </div>
        <div class="form-group">
          <label for="password">Password</label>
          <input type="password" class="form-control" id="password" name="password">
        </div>
        <button type="submit" class="btn-login" name="save">Login</button>
      </form>
      <div class="register-link">
        <p>Don't have an account? <a href="StudentCreate.jsp">Register Here</a></p>
      </div>
      <% if(request.getAttribute("errorMessage")!=null) { %>
      <div class="alert alert-danger"><%=request.getAttribute("errorMessage") %></div>
      <% } %>
    </div>
    </div>
  </div>
  
  
  </div>
  </div>
</body>
</html>
