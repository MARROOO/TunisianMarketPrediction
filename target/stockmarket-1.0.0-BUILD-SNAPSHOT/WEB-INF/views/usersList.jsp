<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<link href="<c:url value="/resources/CSS/design.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
	Users List 
</h1>
	<table class="table table-hover" border ="1">
		<thead >
			<tr class="table-active">
				<th scope="row" colspan="2">Name </th>
				<th scope="row" >Surname</th>
				<th scope="row" >Age</th>
				<th scope="row" >Email</th>
				
			</tr>
		</thead>
		</thead>
		<tbody>
				<c:forEach var="user" items="${users}">   
			<tr>
				<td colspan="2" > ${user.getName()}</th>
				<td>${user.getSurname()}</td>
				<td>${user.getAge()}</td>
				<td>${user.getEmail()}</td>
			</tr>
			   </c:forEach>  
		</tbody>
	</table>
	<a href="/market">home</a>
</body>
</html>