<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" 	%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<center>

	<html:form action="annunciForm.do">
	 <html:hidden property="method" value="search"/>
  	 <html:select name="annunciForm" property="categoria.idCategoria">
			<html:optionsCollection name="annunciForm" property="listaCategorie"/>
		</html:select>
	<html:submit>vai</html:submit>
	</html:form>

</center>