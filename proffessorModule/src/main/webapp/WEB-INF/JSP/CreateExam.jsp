<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Exam</title>
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
    <h1>  <center> Exams   </center>  </h1></br>
    <div class = "box">
 <div class = "form-row"> 
  <form:form method="POST"  action="/redirect1" modelAttribute="Exam">
  <div class="col-7">
    <label for="Exam name">Exam name </label>
    <input type="text" class="form-control" name="ExamName" id = "ExamName">
  </div>
  
   <div class="col-7">
    <label for="Exam Date">Exam Date</label>
    <input type="date" class="form-control" name="ExamDate" id="ExamDate">
  </div>
  
    <div class="col-4">
    <label for="Marks">Marks: </label>
    <input type="text" class="form-control" name="Marks" id="Marks">
  </div>
  
  <br>
   <div class="col-7">
   <label for="Exam-type">Exam-Type:</label>
    <select id="ExamType" name="ExamType">
      <option value="Mid-Sem">Mid-Sem</option>
      <option value="Unit-Test">Unit-Test</option>
      <option value="Final-Exams">Final-Exams</option>
    </select>  
     </div>
     
      <br>
	
	<input type="submit" id="submit" value="CREATE" name="submit" class="btn btn-primary"> 
  </form:form>
  </div>
</div>
</div>
</section>
 
 <footer></footer>
 
</body>
</html>