<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Licenses</title>
</head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css" />
<body>
	<h1>${ person.firstName } ${ person.lastName }</h1>
	<table>
		<tr>
			<th>License Number</th>
			<th>Expiration Date</th>
			<th>State</th>
		</tr>
		<c:forEach var="license" items="${ licenses }" >
			<tr>
				<td>00000${ license.id }</td>
				<td>${ license.expirationDate }</td>
				<td>${ license.state }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>