<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title><s:text name="pform.detalle" /></title>
</head>
<body>
	<h1>
		<s:text name="pform.detalle" />
	</h1>
	<a href="<s:url action="listar"/>"><s:text name="pform.listado" /></a>
	
	 <s:actionerror/>
	 
	<s:form action="guardarPersona">
		<s:hidden name="persona.idPersona" />
		<s:textfield name="persona.nombre" key="p.nombre" required="true" minLength="3"/>
		<s:textfield name="persona.apellidoPaterno" key="p.apePat" required="true" minLength="3"/>
		<s:textfield name="persona.apellidoMaterno" key="p.apeMat" required="true" minLength="3"/>
		<s:textfield name="persona.email" key="p.email" required="true" minLength="3" tooltip="Format: persona@mail.com"/>
		<s:submit action="guardarPersona" key="pform.enviar" />
	</s:form>
</body>
</html>