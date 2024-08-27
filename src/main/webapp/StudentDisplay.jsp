<%@page import="stud.dao.StudentDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.List"
			import ="stud.dao.StudentDao"
			import ="stud.dao.StudentDaoImpl"
			import ="stud.model.Student"

    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
	<title>Student Registration Details</title>
	<style type="text/css">
		body {
    background-color: white;
}

table {
    background-color: #F5F5F5;
}

table th, table td {
    background-color: #ECEFF1;
    color: black;
}

.table-striped-columns tbody tr:nth-of-type(odd) {
    background-color: #FFFFFF;
}

.table-success {
    background-color: #A5D6A7;
}

	</style>
	

</head>
<body>
	<form action="StudentDisplay">
	<h1>Student Details</h1>
	<table class="table table-success table-striped-columns">
		<thead>
			<tr>
				<th>Student Id</th>
				<th>Student Name</th>
				<th>Gender</th>
				<th>Mobile Number</th>
				<th>Email Id</th>
				<th>Password</th>
				<th>
			</tr>
			</thead>
		<tbody>
		
		<%
		StudentDao rdao=new StudentDaoImpl();
		List<Student> lst=rdao.StudentDetails();
		for(Student r:lst)
		{
		%>
			<tr>
				<td><%=r.getStudId() %></td>
				<td><%=r.getStudName() %></td>
				<td><%=r.getGender() %></td>
				<td><%=r.getStudMob() %></td>
				<td><%=r.getEmail() %></td>
				<td><%=r.getPassword() %></td>
			</tr>
			<%} %>
			
		
		</tbody>
		</table>
	</form>
	<div class="d-grid gap-2 col-6 mx-auto">
  		<a href="TeacherDashboard.jsp" class="btn btn-primary">Teacher Dashboard</a>
	</div>
	</form>

</body>
</html>