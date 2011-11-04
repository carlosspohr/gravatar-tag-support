<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c4w" uri="/WEB-INF/tags/gravatar/gravatar.tld" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Gravatar tag</title>
	</head>
	<body>
		<table>
			<tr>
				<td valign="top">
					<c4w:gravatar email="carlosjrcabello@gmail.com" imageSize="30"/>
				</td>
				<td valign="top">
					<c4w:gravatar email="carlosjrcabello@gmail.com" imageSize="50"/>
				</td>
				<td valign="top">
					<c4w:gravatar email="carlosjrcabello@gmail.com" imageSize="100"/>
				</td>
				<td valign="top">
					<c4w:gravatar email="carlosjrcabello@gmail.com" imageSize="300"/>
				</td>
			</tr>
		</table>
	</body>
</html>