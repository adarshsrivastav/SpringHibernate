<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
	<P>  The time on the server is ${serverTime}. and ${messageUrl}. </P>
		<%-- <c:url value="/showMessage.jsp" var="messageUrl" /> --%>
		<a href="showMessage">Click to enter</a>
	</body>
</html>
