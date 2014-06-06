<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Booking</title>
</head>
<h3 align ="center"> CloudKeyWebService UpdateBooking</h3>
<hr width = "80%" color = "green" />
<body>
<form action="/CloudKeyPrWebServiceClient/MakeWebServiceCall" method="post">
<table align="center">
<tr><td>ConfirmationNumber</td><td><input type="text" name="confirmation_number"/></td></tr>
<tr><td>First Note</td><td><input type="text" name="firstNote"/></td></tr>
<tr><td>Second Note</td><td><input type="text" name="secondNote"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Update Booking"></td></tr>
</table>
<input type="hidden" name="command" value="4"/>
</form>
</body>
</html>