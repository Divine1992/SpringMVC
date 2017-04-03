<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success !!!</title>
</head>
<body>
	<h1>
		${msg}
	</h1>
	<h2>Congratulation !!!</h2>
	<h3>Details of Students: </h3>
	<table>
		<tr> 
			<td>Name: </td>
			<td>${student.name}</td>
		</tr>
		<tr>
			<td>Hobby:</td>
			<td>${student.hobby}</td>
		</tr>
		<tr>
			<td>Mobile:</td>
			<td>${student.mobile}</td>
		</tr>
		<tr>
			<td>DOB::</td>
			<td>${student.DOB}</td>
		</tr>
		<tr>
			<td>Skills:</td>
			<td>${student.skills}</td>
		</tr>
		</table>
		
		<table>	
		<tr>
			<td>Student address:</td>
			<td>Country: ${student.address.country}</td>
			<td>City: ${student.address.city}</td>
			<td>Street: ${student.address.street}</td>
			<td>pincode: ${student.address.pincode}</td>
		</tr>	
	</table>
</body>
</html>