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
<center><h1><b>Effettua l'accesso!</b></h1></center>
<form class="form-horizontal" method="post" action="login.do">
	<div class="well" style="padding: 20px 200px;">
		<div class="control-group">
			<label class="control-label" for="inputUsername">Username</label>
			<div class="controls">
				<input type="text" name="username" placeholder="Username">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="inputPassword">Password</label>
			<div class="controls">
				<input type="password" name="password" placeholder="Password">
			</div>
		</div>
		<html:hidden property="method" value="login" />
			<button type="submit" class="btn btn-success">Login!</button>
	</div>
</form>
<html:form method="post" action="utenti.do">
			e se non sei ancora registrato... 
			<input type="hidden" name="method" value="inserimento" />
		<button type="submit" class="btn btn-success">Registrati</button>
</html:form>
