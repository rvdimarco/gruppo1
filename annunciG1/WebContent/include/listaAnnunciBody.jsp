<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<center>
	<table class="table table-bordered table-hover table-condensed">
		<tr>
			<td align="center"><strong>descrizione</strong></td>
			<td align="center"><strong>dataInserimento</strong></td>
		</tr>
			<c:forEach var="annuncio" items="${listaAnn}">
			<c:if test="${not empty listaAnnunci}">
				<tr>
					<td>${annuncio.descrizione}</td>
					<td align="center">${annuncio.dataInserimento}</td>
				<c:if test="${not empty utenteInSessione}">
					<td><a class="btn btn-info" href="dettagliAnnuncio.jsp">Dettagli!</a></td>
				</c:if>
				</tr>
			</c:if>
			</c:forEach>
	</table>
</center>
