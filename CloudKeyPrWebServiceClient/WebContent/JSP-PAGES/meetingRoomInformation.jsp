<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MeetingRoomInformation</title>
</head>
<h3 align ="center"> MeetingRoomInformation Request</h3>
<hr width = "80%" color = "green" />
<body>
<form action="/CloudKeyPrWebServiceClient/MakeWebServiceCall" method="post">
<table align="center">

<!-- <tr><td>Hotel Code</td><td><input type="text" name="hotel_code"/></td></tr> -->
<tr><td>Number Of Attendees</td><td><input type ="text" name = "number_of_attendees"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="RetrieveHotelInformation"></td></tr>
</table>
<input type="hidden" name="command" value="9"/>
</form>

</body>
</html>