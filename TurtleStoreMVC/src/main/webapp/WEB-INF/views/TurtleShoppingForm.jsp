<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <form:form method="post"  action="/turtlestore/addToCart"  modelAttribute="shopper">
             <table>
                <tr>
                    <th>編號</th>
                    <th>龜名</th>
                    <th>價格</th>
                    <th>購買數量</th>
                </tr>
                <c:forEach items= "${shopper.shoppingList}"  var="turtle" varStatus="status">
				<tr>
					<td><form:hidden path="shoppingList[${status.index}].編號" value="${turtle.編號}"/>${turtle.編號}</td>
					<td><form:hidden path="shoppingList[${status.index}].龜名" value="${turtle.龜名}"/>${turtle.龜名}</td>
					<td><form:hidden path="shoppingList[${status.index}].價格" value="${turtle.價格}"/>${turtle.價格}</td>
					<td><form:input path="shoppingList[${status.index}].數量" type="text"/></td>
					<!-- Here you are setting the data in the appropriate index which will be caught in the controller -->
				</tr>
				</c:forEach>
            </table>
            <br/>
			<input type="submit"  value="放入購物車" />
     	</form:form>
    </body>
</html>