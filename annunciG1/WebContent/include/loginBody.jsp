<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html:form styleId="loginForm" method="post" action="login.do">
			Username&nbsp;<input type="text" name="username" />
			Password&nbsp;<input type="password" name="password" />
			<input type="submit" name="LoginButton" value="Invia" />
</html:form>

<html:form styleId="loginForm" method="post" action="login.do">
			e se non sei ancora registrato... 
			<input type="hidden" name="method" value="inserimento" />
			<input type="submit" name="registrazione" value="Registrati" />
</html:form>
