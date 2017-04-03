<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New	Student</title>
</head>
<body>

<link rel="stylesheet" href="<spring:theme code = 'styleSheet'/>" type="text/css" />

<p>
<a href="/FirstSpringMVC/admissionForm?siteTheme=green">Green</a> |  
<a href="/FirstSpringMVC/admissionForm?siteTheme=red">Red</a></p>

<a href="/FirstSpringMVC/admissionForm?siteLanguage=en">English</a> |  
<a href="/FirstSpringMVC/admissionForm?siteLanguage=ru">Russian</a> 

	<h1>${msg}</h1>
	
	<h2>Add new student and his hobby</h2>
	
	<form:errors path="student.*" />
	
	<form action="/FirstSpringMVC/admissionSuccess" method="post">
		<table>
			<tr> 
				<td><spring:message code="label.name"/></td> 
				<td><input type="text" name = "name" /></td>
			</tr>
			<tr> 
				<td><spring:message code="label.hobby"/></td> 
				<td><input type="text" name = "hobby" /></td>
			</tr>
			<tr> 
				<td><spring:message code="label.mobile"/></td> 
				<td><input type="text" name = "mobile" /></td>
			</tr>
			<tr> 
				<td><spring:message code="label.DOB"/></td> 
				<td><input type="text" name = "DOB" /></td>
			</tr>
			<tr> 
				<td><spring:message code="label.addSkills"/></td> 
				<td><select name = "skills" multiple>
				<option value="Java Core"><spring:message code="label.javaCore"/></option> 
				<option value="Spring MVC"><spring:message code="label.springMVC"/></option>
				<option value="Hibernate"><spring:message code="label.hibernate"/></option>
				</select></td>
			</tr>
			<tr> 
				<td><spring:message code="label.addAddress"/></td>
			</tr>
			<tr>
				<td><spring:message code="label.country"/> <input type="text" name = "address.country"/></td>
				<td><spring:message code="label.city"/> <input type="text" name = "address.city"/></td>
				<td><spring:message code="label.street"/> <input type="text" name = "address.street"/></td>
				<td><spring:message code="label.pincode"/> <input type="text" name = "address.pincode"/></td>
			</tr>
		</table>
		<p>
			<input type="submit" value="Submit" />
		</p>
	</form>
</body>
</html>