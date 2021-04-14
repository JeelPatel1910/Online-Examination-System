<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exam List</title>
<link href ="CSS/Style.css" rel ="stylesheet">
<link href="CSS/Dashboard.css" rel = "stylesheet">
</head>
<body>
<header>
  <%@include file="Header.jsp"%>
</header> 

<sidebar>
<%@include file="StudentSidebar.jsp" %>
</sidebar>

<section>
 <div class = "form-container">

    <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
  </tbody>
</table>

<table class="table">
  <thead class="thead-light">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Exam</th>
      <th scope="col">Time</th>
      <th scope="col">Marks</th>
      <th scope="col"></th>
    </tr>
  </thead>
  </table>


  </div>
  </section>
  
</body>
</html>