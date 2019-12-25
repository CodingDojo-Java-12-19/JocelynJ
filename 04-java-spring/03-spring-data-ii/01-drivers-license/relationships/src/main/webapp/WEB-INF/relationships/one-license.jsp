<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>License</title>
</head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css" />
<body>
	<h1>${ person.firstName} ${person.lastName }</h1>
	<p>License number:</p>
	<p>00000${ person.license.id }</p>
	<p>Expiration Date:</p>
	<p>${ person.license.getExpirationDateFormatted() }</p>
	<p>State:</p>
	<p>${ person.license.state }</p>
</body>
</html>