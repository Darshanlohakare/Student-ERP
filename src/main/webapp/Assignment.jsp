<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assignment Submission</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<style>
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
    
   
    
    background: linear-gradient(#006992,#2E1760);
    box-sizing: border-box;
    
    box-shadow: 0 15px 25px rgba(0,0,0,6);
    
    border-radius: 10px;
    color:white; 
}


</style>
<body>
<div class="centered">
<div class="id">
<div class="css">
    <form action="AssignmentController">
     <h1>Assignment Submission</h1>
            <label for="studId">Student ID:</label>
            <input type="text" class="form-control" id="studId" name="studId"><br>
       
       
            <label for="studName">Student Name:</label>
            <input type="text" class="form-control" id="studName" name="studName"><br>
       
        
            <label for="sub1">Java Assignment:</label>
            <input type="text" class="form-control" id="sub1" name="sub1"><br>
        
       
            <label for="sub2">Python Assignment:</label>
            <input type="text" class="form-control" id="sub2" name="sub2"><br>
        
       
            <label for="sub3">Web Development Assignment:</label>
            <input type="text" class="form-control" id="sub3" name="sub3"><br>
            
             
        
        <br><button type="submit" class="btn btn-primary" name="save">Submission</button>
   </form>
</div>
</div>
</div>
</body>
</html>