<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Search Student</title>
	</head>
	<body>	
		<h2>Search Student</h2>
		<form action="dosearch.htm" method="post">
			<table>
				<tr>
					<td>Id :</td>
					<td>
						<input type="text" name="id"/>
					</td>
				</tr>
				<tr>
					<td>Name:</td>
					<td>
						<input type="text" name="name"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="search"/>
					</td>
				</tr>
			</table>	
		</form>
	</body>
</html>