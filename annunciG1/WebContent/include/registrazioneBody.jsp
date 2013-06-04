<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>
	<b>REGISTRAZIONE</b>
	<html:form action="utenti.do">
		<html:hidden property="method" value="eseguiInserimento" />
		<table>
			<tr>
				<td>Nome:</td>
				<td><html:text property="nome" /></td>
			</tr>
			<tr>
				<td>Cognome:</td>
				<td><html:text property="cognome" /></td>
			</tr>
			<tr>
				<td>Ruolo:</td>
				<td><html:select name="utenteForm" property="ruolo.id">
						<html:optionsCollection name="utenteForm" property="lRuolo" />
					</html:select></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><html:text property="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><html:text property="password" /></td>
			</tr>
		</table>
		<div class="btn-group">
			<html:submit styleClass="btn btn-success">Invia</html:submit>
		</div>
	</html:form>
</center>