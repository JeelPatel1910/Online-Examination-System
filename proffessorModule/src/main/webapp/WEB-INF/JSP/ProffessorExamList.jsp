<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@page import="proffessor.service.ExamService" %>
     <%@page import="java.util.List"%>
     <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Professor Exam list</title>
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
 <div class = "box">
   <table class="table w-auto">
  <thead class="thead-dark">
    <tr>  
      <th scope="col">ExamName</th>
      <th scope="col">ExamType</th>
      <th scope="col">Marks</th>
      <th scope="col">#</th>
    </tr>
  </thead>
  
  <tbody>
  
   <%
     ExamService exams =(ExamService)request.getAttribute("examService");
  
      List<String> list = new ArrayList<>();
      list= exams.getExamsByStatus(true);
      for(int i=0;i<list.size();i++)
      {
  %>
    
    <tr>
      <form:form method="POST" action="/SetExam" modelAttribute="SetExams">
      <td><%=list.get(i)%></td>
      <td><%=exams.getExamTypeByExamName(list.get(i))%></td>
      <td><%=exams.getMarksByExamName(list.get(i)) %></td>
      <td><input type="submit" class="btn btn-info" role="button"name="Set" value="Set">SET</a></td>  
      </form:form>
    </tr>
    <%} %>
  </tbody>
</table> 
</div>
</div>
</section>
 <footer></footer>
</body>
</html>