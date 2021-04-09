<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ProffessorDashboard</title>
<link href ="CSS/Style.css" rel ="stylesheet">
<link href="CSS/Dashboard.css" rel = "stylesheet">
</head>
<body>

 <header>
  <div class="nav">  
    <ul>
      <li>Home</li>
      <li>Log out</li>
      <li>About us</li>
    </ul>
    </div>
</header>  
  
  
<sidebar>
<div class="dropdown">
  <button class="dropbtn">Student</button>
  <div class="dropdown-content">
  <a href="#">Add Student</a>

  </div>
</div>
  <div class="dropdown">
  <button class="dropbtn">Exams</button>
  <div class="dropdown-content">
  <a href="/redirect">Add Exam</a>
   </div>
</div>
</sidebar>

<footer>footer</footer>
</body>
</html>