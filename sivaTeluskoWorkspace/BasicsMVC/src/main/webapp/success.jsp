<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Success</title>
</head>
<body bgcolor="green">
<h1><marquee>Registration Success!</marquee></h1>
<%String message=(String)session.getAttribute("message") ;%>
<h2>${message}</h2>
</body>
</html>