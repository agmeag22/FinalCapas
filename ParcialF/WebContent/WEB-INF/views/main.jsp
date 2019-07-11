<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<a href="${pageContext.request.contextPath}/mostrar">Mostrar</a>
	
	<form action="${pageContext.request.contextPath}/guardar" ModelAttribute="contribuyente" method="post">
	<label>Nombre</label>
	<input type="text" name="nombre" required>
	<br>
	<label>Apellido</label>
	<input type="text" name="apellido" required>
	<br>
	<label>Nit</label>
	<input type="text" name="nit" required>
	<label>Fecha Ingreso</label>
	<br>
	<select name="importancia">
	<c:forEach items="${ importancias}" var="importancia">
		<option value="${importancia.cimportancia}">${importancia.simportancia}</option>
	</c:forEach>
	</select>
	<input type="submit" value="Guardar">
	
	</form>
	
	
</body>
</html>