<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="display" method="post" align='CENTER'>
<DIV ALIGN='CENTER'><div>
Enter First Name:<input type="text" name="username"  /><br>
</div>
<div>
Enter Second Name:<input type="text" name="username1" /><br>
</div>
<DIV>
<input type="submit"  value="display"/>
</DIV>
</DIV>
</form>
<form  action="display1"><h6 align="center" style="font-size:15">Based on the name of similarity of ${name} and ${name1} is:${sum}</h6></form>
</body>
</html>