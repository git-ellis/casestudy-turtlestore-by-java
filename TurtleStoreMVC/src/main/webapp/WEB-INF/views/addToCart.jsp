<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>烏龜確認購買表單</title>
</head>
<body>
<h2>烏龜確認購買表單</h2>
<form:form action="/turtlestore/saveOrder" method="post">
	<table>
		<tr>
			<th>編號</th>
			<th>龜名</th>
			<th>價格</th>
			<th>購買數量</th>
		</tr>
		<c:forEach items= "${shopper.shoppingList}"  var="turtle" varStatus="status">
			<tr>
				<td>${turtle.編號}</td>
				<td>${turtle.龜名}</td>
				<td>${turtle.價格}</td>
				<td>${turtle.數量}</td>
			</tr>
		</c:forEach>
		<tr><td><br /></td></tr>
		<tr><td><br /></td></tr>
		<tr>
			<td><strong>總價</strong></td>
			<td><strong>${shopper.totalPrice}</strong></td>
		</tr>
		<tr><td><br /></td></tr>
		<tr>
			<td><input type="button" value="Back" onclick="javascript:history.back()"/></td>
			<td><input type = "submit" name = "savebtn" value="儲存"/></td>
		</tr>
	</table>	
</form:form>
</body>
</html>