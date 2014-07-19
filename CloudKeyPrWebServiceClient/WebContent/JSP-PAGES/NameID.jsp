<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Name ID</title>
</head>
<h3 align ="center"> CloudKeyWebService NameID</h3>
<hr width = "80%" color = "green" />
<body>
<form action="/CloudKeyPrWebServiceClient/MakeWebServiceCall"
		method="post">
		<table align="center">
			<tr>
				<td>Membership Type :</td>
				<td><input type="text" name="membership_type"></td>
			</tr>
			<tr>
				<td>Membership Number :</td>
				<td><input type="text" name="membership_number"></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="last_name"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="GetNameID"></td>
			</tr>
		</table>
		<input type="hidden" name="command" value="13"/>
	</form>
</body>
</html>