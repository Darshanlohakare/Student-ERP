<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert Student Result</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <style type="text/css">
        body {
            background-color: #f5f5f5;
            padding: 20px;
        }

        form {
            max-width: 500px;
            margin: 0 auto;
            background-color: #fff;
            padding: 30px;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        }

        h2 {
            color: #333;
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 20px;
            text-align: center;
        }

        h3 {
            color: #333;
            font-size: 20px;
            font-weight: bold;
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-bottom: 10px;
            color: #555;
            font-size: 16px;
            font-weight: bold;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .btn {
            display: block;
            width: 100%;
            padding: 10px;
            font-size: 18px;
            font-weight: bold;
            color: #fff;
            background-color: #ffc107;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .btn:hover {
            background-color: #ff9800;
        }

        a {
            display: block;
            margin-top: 10px;
            text-align: center;
            color: #333;
            font-size: 16px;
            text-decoration: none;
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

    <form action="InsertResult">
    <div class="css">
        <h2>Student Progress Details</h2>
        <div class="form-group">
            <label for="studId">Student Id:</label>
            <input type="text" class="form-control" id="studId" name="studId">
        </div>
        <div class="form-group">
            <label for="studName">Student Name:</label>
            <input type="text" class="form-control" id="studName" name="studName">
        </div>
        <h3>Enter Student Marks</h3>
        <div class="form-group">
            <label for="sub1">Java:</label>
            <input type="text" class="form-control" id="sub1" name="sub1">
        </div>
        <div class="form-group">
            <label for="sub2">Python:</label>
            <input type="text" class="form-control" id="sub2" name="sub2">
        </div>
        <div class="form-group">
            <label for="sub3">Web Development:</label>
            <input type="text" class="form-control" id="sub3" name="sub3">
        </div>
        <div class="form-group">
            <label for="grades">Grades:</label>
            <input type="text" class="form-control" id="grades" name="grades">
        </div>
        <button type="submit" class="btn btn-primary">Submit Student Marks</button>
        <a href="TeacherDashboard.jsp">Home</a>
        
        </div>
    </form>
    </div>
    </div>
    
    

    <!-- Bootstrap JS (optional, if you need to use Bootstrap's JavaScript components) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
