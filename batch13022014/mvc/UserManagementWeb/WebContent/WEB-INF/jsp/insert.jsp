<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert User</title>
	</head>
	<body>
		<h2>User Form</h2>
		<form:form commandName="userCmd">
			<p style="color:red;">
			<form:errors path="*"/>
			</p>
			<table>
				<tr>
					<td>User Id:</td>
					<td>
						<form:input path="userId"/>
					</td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td>
						<form:input path="firstNm"/>
					</td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td>
						<form:input path="lastNm"/>
					</td>
				</tr>
				<tr>
					<td>Mobile:</td>
					<td>
						<form:input path="mobile"/>
					</td>
				</tr>
				<tr>
					<td>Email:</td>
					<td>
						<form:input path="email"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="insert"/>
					</td>
				</tr>
			</table>
		</form:form>		
	</body>
</html>