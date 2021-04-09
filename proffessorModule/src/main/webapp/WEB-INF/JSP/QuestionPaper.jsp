<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@page import="java.util.List"%>
     <%@page import="java.util.ArrayList"%>
   <!-- <jsp:useBean id="examService" class="proffessor.service.implementation.ExamServiceImplment"/> -->
    <%@page import="proffessor.service.implementation.ExamServiceImplment" %>
    <%@page import="proffessor.service.ExamService" %>
    <%@page import="proffessor.model.entity.ExamEntity" %>
    <jsp:useBean id="examServiceImp" class="proffessor.service.implementation.ExamServiceImplment" scope="page"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>QuestionPaper</title>
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
    <h1>  <center> QUESTIONS   </center>  </h1></br>
    <div class = "box">
 <div class = "form-row"> 
  <form:form method="POST" action="/redirect2" modelAttribute="QuestionPaper">
  Enter a Question:</r>
   <div class="col-10">
  Question:<input class="form-control" type="text"  name="Option1" id="Option1" maxlength="65435">
   </div>
  </br> 
 
  Options:</br>
  <div class="col-7">
    <label for="Option 1">Option 1 </label>
    <input type="text" class="form-control"  name="Option1" id="Option1" maxlength="65435">
  </div>
  
   <div class="col-7">
    <label for="Option 2">Option 2:</label>
    <input type="text" class="form-control" name="Option2" id="Option2" maxlength="65435">
  </div>
  
  <div class="col-7">
    <label for="Option 3">Option 3: </label>
    <input type="text" class="form-control" name="Option3" id="Option3" maxlength="65435">
  </div>
  <div class="col-7">
    <label for="Option 4">Option 4: </label>
    <input type="text" class="form-control" name="Option4" id="Option4" maxlength="65435">
  </div>
   <div class="col-7">
    <label for="Answer"> Answer </label>
    <input type="text" class="form-control"  name="Answer" id="Question" maxlength="65435">
  </div>
  </br>
  <button type="button" class="btn btn-success">ADD</button>
	<input type="submit" id="submit" value="SUBMIT" name="submit" class="btn btn-primary"> 
  </form:form>
  </div>
</div>
</div>
</section>
</body>
</html>