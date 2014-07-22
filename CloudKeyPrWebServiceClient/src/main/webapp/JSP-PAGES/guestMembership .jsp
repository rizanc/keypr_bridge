<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Guest Membership </title>
</head>
<h3 align ="center"> Guest Membership </h3>
<hr width = "80%" color = "green" />
<body>
<form action="/CloudKeyPrWebServiceClient/MakeWebServiceCall" method="post">
<table align="center">
<tr><td>Name ID</td><td><input type ="text" name = "name_id"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="GuestMembershipInformation"></td></tr>
</table>
<input type="hidden" name="command" value="12"/>
</form>
</body>
</html>