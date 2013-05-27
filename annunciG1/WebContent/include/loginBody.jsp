<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<!-- import for BOOTSTRAP CSS and JS (minimal) -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!-- end import -->
</head>


${messaggio}
<html:form method="post" action="login.do">
			Username&nbsp;<input type="text" name="username" />
			Password&nbsp;<input type="password" name="password" />
	<html:hidden property="method" value="login" />
	<div class="btn-group">
		<html:submit styleClass="btn btn-success">Login</html:submit>
	</div>
</html:form>

<html:form method="post" action="utenti.do">
			e se non sei ancora registrato... 
			<input type="hidden" name="method" value="inserimento" />
	<div class="btn-group">
		<input type="submit" class="btn btn-success">Registrati</input>
	</div>
</html:form>

