<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Search User</title>
	</head>
	<body>
		<form action="doUserSearch.htm" method="post">
			<table>
				<tr>
					<td>First Name:</td>
					<td>
						<input type="text" name="firstNm"/>
					</td>
				</tr>
				<tr>
					<td>Last Name :</td>
					<td>
						<input type="text" name="lastNm"/>
					</td>
				</tr>
				<tr>
					<td>Mobile:</td>
					<td>
						<input type="text" name="mobile"/>
					</td>
				</tr>
				<tr>
					<td>Email:</td>
					<td>
						<input type="text" name="email"/>
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