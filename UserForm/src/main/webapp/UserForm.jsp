<%@page import="net.javaguides.usermanagement.model.User"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Employee Form  </title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<header >
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: pink">

			<div >
				<a href="https://www.javaguides.net" class="navbar-brand" > Employee Form </a>
			</div>
			<ul class="navbar-nav">
				<li><a href="<%= request.getContextPath() %>/list"
					class="nav-link">Employee</a></li>
			</ul>
		</nav>
	</header>

	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<form action='${redirection}' method="get">	
					<h1 align="center">
						EMPLOYEE FORM
					</h1>

				<c:if test="${users != null}">
					<input type="hidden" name="id" value="<c:out value='${users.id}' />" >
				</c:if>

				<fieldset class="form-group">
					<label>Firstname :</label> <input type="text" 
						value="<c:out value='${users.firstName}' />" 
						class="form-control" name="firstname" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Lastname :</label> <input type="text"
						value="<c:out value='${users.lastName}' />" class="form-control"
						name="lastname">
				</fieldset>

				<fieldset class="form-group">
					<label>Username :</label> <input type="text"
						value="<c:out value='${users.userName}' />" class="form-control"
						name="username">
				</fieldset>

				<fieldset class="form-group">
					<label>Address :</label> <input type="text"
						value="<c:out value='${users.address}' />" class="form-control"
						name="address">
				</fieldset>

				<fieldset class="form-group">
					<label>Contact :</label> <input type="tel" onkeydown="return checkPhoneKey(event.key)"
						value="<c:out value='${users.contactNo}' />" 
						class="form-control" name="contact" required="required">
				</fieldset>

				<button type="submit" class="btn btn-success">Submit</button>
				<button type="reset" class="btn btn-success">Clear</button>

				</form>
			</div>
		</div>
	</div>
</body>
<script>
	function checkPhoneKey(key) {
		return (key >= '0' && key <= '9') ||
			['+','(',')','-','ArrowLeft','ArrowRight','Delete','Backspace',' '].includes(key);
	}
</script>
</html>