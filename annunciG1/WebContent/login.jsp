<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" 	%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" 	%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Home</title>
		
		<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.no-icons.min.css" rel="stylesheet">
		<link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">
		<!-- import for BOOTSTRAP CSS and JS (minimal) -->
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
		<!-- end import -->
	</head>
	<body>	
	<table width="100%" border="1" bordercolor="blue">
			<tr height="125">
				<td align="center" colspan="3"><jsp:include page="include/header.jsp" flush="true" /></td>
			</tr>
			<tr height="500">
				<td align="center" width="20%"><jsp:include page="include/areaPrivataBody.jsp" flush="true" /></td>
				<td align="center" width="60%"><jsp:include page="include/loginBody.jsp" flush="true" /></td>
				<td align="center" width="20%"><jsp:include page="include/bestBody.jsp" flush="true" /></td>
			</tr>
		</table>
	</body>
</html>