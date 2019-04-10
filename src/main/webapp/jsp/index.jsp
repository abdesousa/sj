<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add / Edit bit</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
	<h3>Add / Edit bit!!!</h3>

	<form:form method="post" action="/sj/webBit.html" commandName="webBit">
		<div class="table-responsive">
			<table class="table table-bordered" style="width: 300px">
				<tr>
					<td>Id :</td>
					<td><form:input type="text" path="id" /></td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><form:input type="text" path="name" /></td>
				</tr>
				<tr>
					<td>Description :</td>
					<td><form:input type="text" path="description" /></td>
				</tr>
				<tr>
					<td>Negation :</td>
					<td><form:input type="text" path="negation" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input class="btn btn-primary btn-sm" type="submit"
						value="Submit" /></td>
				</tr>
			</table>
		</div>
	</form:form>
	<br>
	<h3>List of bits</h3>
	<table class="table table-bordered" style="width: 300px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Edit/Delete</th>
		</tr>
		<c:forEach items="${webBitList}" var="webBit">
			<tr>
				<td width="60" align="center">${webBit.id}</td>
				<td width="60" align="center">${webBit.name}</td>
				<td width="60" align="center"><a href="edit/${webBit.id}">Edit</a>/<a
					href="delete/${webBit.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>