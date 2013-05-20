<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<center>
	
	<c:forEach var="annuncio" items="listaAnnunci">
		${annuncio}
	</c:forEach>

</center>
