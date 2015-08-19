<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<body>
	<h1>HELLO</h1>

	<form action="/customerListView">
		<input type="submit">
	</form>

	<br />

	<form action="addcustomer">
		<input type="input" name="customerName"> <br />
		<input type="input" name="customerId"> <br />
		<input type="submit"><br />
	</form>

	<c:forEach items="${customerliststuff}" var="customer">
		<tr>
			<td><c:out value="${customer.customerId}"></c:out></td>
			<td><c:out value="${customer.customerName}"></c:out></td>
		</tr>
	</c:forEach>

</body>
</html>