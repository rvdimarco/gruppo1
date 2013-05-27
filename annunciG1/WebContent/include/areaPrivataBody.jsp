<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<!-- import for BOOTSTRAP CSS and JS (minimal) -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!-- end import -->
</head>
<h1>AREA PRIVATA</h1>


<html:form method="post" action="login.do">
	<html:hidden property="method" value="areaPrivata" />
	<div class="btn-group">
		<html:submit styleClass="btn btn-success">Accedi alla zona privata</html:submit>
	</div>
</html:form>