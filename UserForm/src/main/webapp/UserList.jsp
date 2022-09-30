<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
.table {
	width: 100%;
	margin-bottom: 1rem;
	color: #dae0e7;
}
.delete-button{
cursor: pointer;
}
</style>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
<script>
		function deleteConform(url) {
			var doc;
			var result = confirm("Are you sure you want to delete?");
			if (result == true) {
				window.open("delete?id=" + url, "_self");
			}
		}
	</script>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: pink">
			<div>
				<a href="https://www.xadmin.net" class="navbar-brand"> Employee Form
			 </a>
			</div>
			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Employee</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->
		<div class="container">
			<h3 class="text-center">Employee List</h3>
			<hr>
			<div class="container text-right">
				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">
					Add</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>First Name:</th>
						<th>Last Name: </th>
						<th>User Name:</th>
						<th>Address:</th>
						<th>Contact No:</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="users" items="${listUser}">
						<tr>
							<td><c:out value="${users.id}" /></td>
							<td><c:out value="${users.firstName}" /></td>
							<td><c:out value="${users.lastName}" /></td>
							<td><c:out value="${users.userName}" /></td>
							<td><c:out value="${users.address}" /></td>
							<td><c:out value="${users.contactNo}" /></td>
							<td>
								<a href="edit?id=<c:out value='${users.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp; &nbsp;
								<a onclick="deleteConform('${users.id}')" class="delete-button">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>