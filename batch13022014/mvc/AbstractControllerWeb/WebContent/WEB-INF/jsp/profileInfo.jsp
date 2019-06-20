<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>My Profile</title>
	</head>
	<body>
		<table>
			<tr>
				<td>First Name:</td>
				<td>${profileInfo.firstName}</td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td>${profileInfo.lastName}</td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td>${profileInfo.mobile}</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td>${profileInfo.email}</td>				
			</tr>
		</table>
	</body>
</html>