<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>


<center>
  <fieldset>
    <legend><b>Fai la tua ricerca</b></legend>
    <html:form action="annunci.do">
				<html:hidden property="method" value="search" />
		<table>
				<tr>
					<td><b>Selezione una categoria: </b></td>
					<td><html:select name="annunciForm" property="idCategoria">
							<html:option value=" "></html:option>
							<html:optionsCollection name="annunciForm" property="listaCategorie" />
						</html:select></td>
				</tr>
				<tr>
					<td><b>Inserisci una parola chiave: </b></td>
					<td><html:text property="descrizione"></html:text></td>
				</tr>
				<tr>
					<td colspan="2"><b>Stato dell'anuncio: </b></td>
				</tr>
				<tr>
					<td colspan="2"><html:radio property="stato" value="1"></html:radio>Aperto</td>
				</tr>
				<tr>
					<td colspan="2"><html:radio property="stato" value="0"></html:radio>Chiuso</td>
				</tr>
				<tr>
					<td colspan="2"><html:radio property="stato" value="2"></html:radio>Tutti</td>
				</tr>
				<tr>
					<td align="right"  colspan="2">
					
							<input type="submit" class="btn btn-success" value="Cerca"/>
					</td>
				</tr>
		</table>
		</html:form>
	</fieldset>
</center>