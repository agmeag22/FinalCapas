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
	
	<table>
	<thead>
	<tr>
	<td>Nombre</td>
	<td>Apellido</td>
	<td>NIT</td>
	<td>Fecha de Ingreso</td>
	<td>Importancia</td>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${contribuyentes}" var="contribuyente">
	<tr>
	<td>${contribuyente.nombre}</td>
	<td>${contribuyente.apellido}</td>
	<td>${contribuyente.nit}</td>
	
	<td><fmt:formatDate value="${contribuyente.fechaingreso}" pattern="dd/MM/yyyy"/><td>
	<td>${contribuyente.importancia.simportancia}</td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	
	
</body>
</html>