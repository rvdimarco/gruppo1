<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<center>
	<table border="1">
		<tr>
			<td align="center"><strong>descrizione</strong></td>
			<td align="center"><strong>dataInserimento</strong></td>
			<td align="center"><strong>visite</strong></td>
			<td align="center"><strong>stato</strong></td>
			<td align="center"><strong>idCategoria</strong></td>
			<td align="center"><strong>idProdotto</strong></td>
			<td align="center"><strong>owner</strong></td>
		</tr>
			<c:forEach var="annuncio" items="${listaAnn}">
			<c:if test="${not empty listaAnnunci}">
				<tr>
					<td>${annuncio.descrizione}</td>
					<td align="center">${annuncio.dataInserimento}</td>
					<td align="center">${annuncio.visite}</td>
					<td align="center">${annuncio.stato}</td>
					<td align="center">${annuncio.idCategoria}</td>
					<td align="center">${annuncio.idProdotto}</td>
					<td align="center">${annuncio.owner}</td>
				</tr>
			</c:if>
			</c:forEach>
	</table>
</center>
