<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fee Payment</title>
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
    <form action="FeePaymentController">
    <h1>Fee Payment</h1>
            <label for="studId">Student ID:</label>
            <input type="text" class="form-control" id="studId" name="studId"><br>
       
       
            <label for="studName">Student Name:</label>
            <input type="text" class="form-control" id="studName" name="studName"><br>
       
        
            <label for="course">Course:</label>
            <input type="text" class="form-control" id="course" name="course"><br>
       
            <label for="feeAmt">Fee Amount:</label>
            <input type="text" class="form-control" id="feeAmt" name="feeAmt"><br>
            
             
        
        <br><button type="submit" class="btn btn-primary" name="save">Payment</button>
   </form>
</div>
</div>
</div>
</body>
</html>