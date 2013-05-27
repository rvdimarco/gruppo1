<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form action="utenti.do">
	<html:hidden property="method" value="gestioneUtente" />
	<c:forEach var="ut" items="${Utente}">
		<tr>
			<td><center>${ut.username}</center></td>
			<td><center>${ut.nome}</center></td>
			<td><center>${ut.cognome}</center></td>
			<td><center>${ut.ruolo.descrizione}</center></td>
		</tr>
	</c:forEach>

</html:form>
