<%@page import="stud.dao.StudentDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"
    import="stud.dao.StudentDao"
    import="stud.dao.StudentDaoImpl"
    import="stud.model.Result" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
<title>Student Registration Details</title>
<style type="text/css">
    body {
        background-color: #ffffff;
        background-image: url('https://www.daysoftheyear.com/wp-content/uploads/world-student-day1.jpg');
			background-repeat: no-repeat;
			background-size: cover;
    }

    table {
        background-color: #f5f5f5;
    }

    table th,
    table td {
        background-color: #eceff1;
        color: black;
    }

    .table-striped-columns tbody tr:nth-of-type(odd) {
        background-color: #ffffff;
    }

    .table-success {
        background-color: #a5d6a7;
    }

    .container {
        max-width: 800px;
        margin: 50px auto;
    }

    h1 {
        text-align: center;
        margin-bottom: 30px;
    }

    .btn-primary {
        display: block;
        width: 100%;
        padding: 10px;
        font-size: 18px;
        font-weight: bold;
    }

    .btn-spacing {
        margin-top: 10px;
    }
</style>
</head>
<body>
    <div class="container">
        <form action="ViewResult">
            <div class="mb-3">
                <label for="studId" class="form-label">Enter Student Id</label>
                <input type="text" class="form-control" id="studId" name="studId">
            </div>
            <button type="submit" class="btn btn-primary">Search Here</button>
        </form>

        <%!
        Result r;
        %>

        <%
        if (!session.isNew() && session.getAttribute("data") != null) {
            r = (Result) session.getAttribute("data");
        %>
        <h3>Search Results</h3>
        <table class="table table-success table-striped-columns">
            <thead>
                <tr>
                    <th>Student Id</th>
                    <th>Student Name</th>
                    <th>Subject 1 Marks</th>
                    <th>Subject 2 Marks</th>
                    <th>Subject 3 Marks</th>
                    <th>Grades</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%=r.getStudId() %></td>
                    <td><%=r.getStudName() %></td>
                    <td><%=r.getSub1() %></td>
                    <td><%=r.getSub2() %></td>
                    <td><%=r.getSub3() %></td>
                    <td><%=r.getGrades() %></td>
                </tr>
            </tbody>
        </table>
        <% } %>
        
        <div class="d-grid gap-2 col-6 mx-auto">
            <a href="StudentDashboard.jsp" class="btn btn-primary btn-spacing">Student Dashboard</a>
        </div>
    </div>
</body>
</html>
