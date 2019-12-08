<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
<link rel="stylesheet" href="css/style.css"/>
</head>
<body>
	<div id=wrapper>
		<h1>You have visited the site <c:out value="${count}"/> times!</h1>
		<a href="#" onClick="window.location.reload();">Refresh</a>
		<a href="/">Home</a>
	</div>
</body>
</html>