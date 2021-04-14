<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set  Exam</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<link href="CSS/Dashboard.css" rel = "stylesheet">
</head>
<body>
<header>
<%@include file="Header.jsp"%>
</header>

 <sidebar>
<%@include file="Sidebar.jsp" %>
</sidebar>
 
 
<section>

 <div class = "form-container">
    <h1>  <center> Set Time </center>  </h1></br>
    <div class = "box">
 <div class = "form-row"> 
  <form:form method="POST" action="/redirect2" modelAttribute="QuestionPaper">
  <>
  
  </form:form>
</div>
</div>
</div>
</section>

<footer></footer>
</body>
</html>