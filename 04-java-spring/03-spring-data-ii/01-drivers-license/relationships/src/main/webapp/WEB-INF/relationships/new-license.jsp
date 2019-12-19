<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css" />
<title>New License</title>
</head>
<body>
	<h1>New License</h1>
		<form:form action="/license" method="POST" modelAttribute="license">
		    <div class="form-group">
		        <form:label path="person">Person</form:label>
		        <form:select  class="form-control" path="person">
		        <c:forEach var="person" items="${ persons }">
		        	<option value="${ person.id }">${person.firstName} ${ person.lastName }</option>
		        </c:forEach>
		        </form:select>
		    	<form:errors path="person"/>
		    </div>
		    <div class="form-group">
		        <form:label path="expirationDate">Expiration Date</form:label>
		        <form:input type="date" class="form-control" path="expirationDate"/>
		        <form:errors path="expirationDate"/>
		    </div>
		    <div class="form-group">
		        <form:label path="state">State</form:label>
		        <form:input class="form-control" path="state"/>
		    	<form:errors path="state"/>
		    </div>
		    <input type="submit" value="Submit"/>
		</form:form>
</body>
</html>