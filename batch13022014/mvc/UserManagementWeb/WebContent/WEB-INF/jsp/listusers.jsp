<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Users list</title>
	</head>
	<body>
		<h2>User Profiles</h2>
		<table>
			<tr>
				<td align="right">
					<a href="insert.htm">Insert</a>
				</td>
			</tr>
			<tr>
				<td>
					<c:choose>
						<c:when test="${profiles ne null}">
							<table border="1px">
								<tr>
									<th>User Id</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Mobile</th>
									<th>Email</th>
								</tr>
								<c:forEach items="${profiles}" var="profile">
									<tr>
										<td>
											<a href="edit.htm?id=${profile.userId}"><c:out value="${profile.userId}"/></a>
										</td>
										<td><c:out value="${profile.firstName}"/></td>
										<td><c:out value="${profile.lastName}"/></td>
										<td><c:out value="${profile.mobile}"/></td>
										<td><c:out value="${profile.email}"/></td>
									</tr>
								</c:forEach>
							</table>
						</c:when>
						<c:otherwise>
							<p style="color:red;">No records exists!</p>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</table>
	</body>
</html>