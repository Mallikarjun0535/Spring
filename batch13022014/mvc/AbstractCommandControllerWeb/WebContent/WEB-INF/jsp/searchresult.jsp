<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Search Result</title>
	</head>
	<body>
		<h2>User Profiles</h2>
		<c:choose>
			<c:when test="${profiles ne null}">
				<table>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Mobile</th>
						<th>Email</th>
					</tr>
					<c:forEach items="${profiles}" var="profile">
						<tr>
							<td><c:out value="${profile.firstName}"/></td>
							<td><c:out value="${profile.lastName}"/></td>
							<td><c:out value="${profile.mobile}"/></td>
							<td><c:out value="${profile.email}"/></td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<p style="color:red;">No records found matching your search criteria!</p>
			</c:otherwise>
		</c:choose>
	</body>
</html>