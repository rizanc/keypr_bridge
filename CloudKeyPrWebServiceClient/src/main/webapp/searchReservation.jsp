<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CloudKeyWebService Client</title>
</head>
<h3 align ="center"> CloudKeyWebService SearchReservation</h3>
<hr width = "80%" color = "green" />
<body>
<form action="/CloudKeyPrWebServiceClient/MakeWebServiceCall" method="post">
<table align="center">
<tr><td>FirstName:</td><td><input type="text" name="first_name"/></td></tr>
<tr><td>LastName:</td><td><input type="text" name="last_name"/></td></tr>
<tr><td>ConfirmationNumber</td><td><input type="text" name="confirmation_number"/></td></tr>
<tr><td>CreditCard:</td><td><input type="text" name="credit_card"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="SearchReservation"></td></tr>
</table>
<input type="hidden" name="command" value="1"/>
</form>
</body>
</html>