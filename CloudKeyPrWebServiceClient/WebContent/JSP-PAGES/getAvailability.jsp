<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Availability</title>
<h3 align ="center"> CloudKeyWebService GetAvailability</h3>
<hr width = "80%" color = "green" />
<body>
<form action="/CloudKeyPrWebServiceClient/MakeWebServiceCall" method="post">
<table align="center">
<tr><td>StartDate(dd-mmm-yyyy) :</td><td><input type="text" name="start_date"/></td></tr></br>
<tr><td>EndDate (dd-mmm-yyyy) :</td><td><input type="text" name="end_date"/></td></tr></br>
<tr><td colspan="2" align="center"><input type="submit" value="GetAvailability"></td></tr>
</table>
<input type="hidden" name="command" value="6"/>
</form>
<body>

</body>
</html>