<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HERE cool CARS</title>
</head>
<body>
<h1>Add new car and color</h1>
	<form action="/FirstSpringMVC/carSuccess" method="post">
		<p>
			Car  : <input type="text" name = "car" /> 
		</p>
		<p>
			Color: <input type="text" name="color" /> 
		</p>
		<p>
			<input type="submit" value="Add" />
		</p>
	</form>
</body>
</html>