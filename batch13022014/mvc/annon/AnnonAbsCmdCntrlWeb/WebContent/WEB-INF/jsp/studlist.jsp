<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Students Information</title>
	</head>
	<body>
		<h2>Students</h2>
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
			</tr>
			<c:forEach items="${students}" var="stud">				
				<tr>
					<td>${stud.id}</td>
					<td>${stud.name}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>