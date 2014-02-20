<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CheckIn</title>
</head>
<h3 align ="center"> CloudKeyWebService CheckIn</h3>
<hr width = "80%" color = "green" />
<body>
<form action="/CloudKeyPrWebServiceClient/MakeWebServiceCall" method="post">
<table align="center">
<!-- <tr><td>FirstName:</td><td><input type="text" name="first_name"/></td></tr>
<tr><td>LastName:</td><td><input type="text" name="last_name"/></td></tr>
<tr><td>Email:</td><td><input type="text" name="email"/></td></tr> -->
<tr><td>ConfirmationNumber</td><td><input type="text" name="confirmation_number"/></td></tr>
<tr><td>CreditCard:</td><td><input type="text" name="credit_card"/></td></tr></br>

<tr><td>RoomNumber:</td><td><input type="text" name="room_number"/></td></tr></br>
<!-- <tr><td>RoomDetail:</td><td><input type="text" name="room_detail"/></td></tr></br>
<tr><td>CheckIn Date:</td><td><input type="text" name="checkin_date"/></td></tr></br>
<tr><td>CheckOut Date:</td><td><input type="text" name="checkout_date"/></td></tr></br> -->
<tr><td colspan="2" align="center"><input type="submit" value="CheckIn"></td></tr>
</table>
<input type="hidden" name="command" value="2"/>
</form>

</body>
</html>