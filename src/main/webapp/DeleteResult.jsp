<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student</title>
</head>

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
            background-color: #dc3545;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .btn:hover {
            background-color: #c82333;
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
<body>
<div class="centered">
<div class="id">
    <form action="DeleteResult">
     <div class="css">
        <h2>Delete Student</h2>
        <div>
            <label for="studId">Student Id:</label>
            <input type="text" id="studId" name="studId">
        </div><br>
        <button type="submit" class="btn btn-danger">Delete Student</button>
        <a href="TeacherDashboard.jsp">Home</a>
        </div>
    </form>
    
   </div>
   </div> 
</body>
</html>
