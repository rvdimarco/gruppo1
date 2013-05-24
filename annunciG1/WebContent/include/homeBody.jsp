<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<head>
<!-- import for BOOTSTRAP CSS and JS (minimal) -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!-- end import -->
</head>

<center>
	<h1>Fai la tua ricerca</h1>
	<table>
		<html:form action="annunci.do">
			<tr>
				<td><strong>Selezione una categoria: </strong></td>
				<td><html:select name="annunciForm"
						property="categoria.idCategoria">
						<html:optionsCollection name="annunciForm"
							property="listaCategorie" />
					</html:select></td>
			</tr>
			<tr>
				<td><strong>Inserisci una parola chiave: </strong></td>
				<td><html:text property="descrizione"></html:text></td>
			</tr>
			<tr>
				<td><strong>Stato dell'anuncio: </strong></td>
			</tr>
			<tr>
				<td><html:radio property="stato" value="true"></html:radio>Aperto</td>
			</tr>
			<tr>
				<td><html:radio property="stato" value="true"></html:radio>Chiuso</td>
			</tr>
			<tr>
				<td></td>
				<html:hidden property="method" value="search" />
				<td align="right">
				
				<div class="btn-group">
						<button class="btn btn-success">Cerca</button>
				</div>
			</tr>
		</html:form>
	</table>
</center>