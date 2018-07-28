<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>todos</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>

</head>
<body>
	<!--  <h2>Todos for: ${name}!</h2>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo}</li>
		</c:forEach>
	</ol>
	<form action="/todo.do" method="post">
		<input type="text", name="newtodo" /><input type="submit" value="Add">
	</form>  -->

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/todo.do">Todos</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/logout.do">Logout</a></li>
		</ul>

	</nav>

	<div class="container">
		<h2>Todos for: ${name}!</h2>
		<ol>
			<c:forEach items="${todos}" var="todo">
				<li>${todo}</li>
			</c:forEach>
		</ol>
		<form action="/todo.do" method="post">
			<input type="text" , name="newtodo" /><input type="submit"
				value="Add">
		</form>
	</div>

	<footer class="footer">
		<p>footer content</p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/cjs/bootstrap.min.js"></script>
</body>
</html>