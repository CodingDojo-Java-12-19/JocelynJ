<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>License</title>
</head>
<body>
	<h1>${ person.firstName} ${person.lastName }</h1>
	<p>License number:</p>
	<p>00000${ person.license.id }</p>
	<p>Expiration Date:</p>
	<p>${ person.license.expirationDate }</p>
	<p>State:</p>
	<p>${ person.license.state }</p>
</body>
</html>