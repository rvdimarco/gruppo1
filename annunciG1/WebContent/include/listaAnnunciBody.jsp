<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<center>
	<table class="table table-bordered table-hover table-condensed">
		<tr>
			<td align="center"><b>descrizione</b></td>
			<td align="center"><b>data Inserimento</b></td>
		</tr>
			<c:forEach var="annuncio" items="${listaAnn}">
			<c:if test="${not empty listaAnnunci}">
				<tr>
					<td>${annuncio.descrizione}</td>
					<td>${annuncio.dataInserimento}</td>
				<c:if test="${not empty utenteInSessione}">
					<td><a class="btn btn-info" href="dettagliAnnuncio.jsp">Dettagli!</a></td>
				</c:if>
				</tr>
			</c:if>
			</c:forEach>
	</table>
</center>
