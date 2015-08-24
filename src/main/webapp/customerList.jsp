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
		<input type="text" name="fName"> <br />
		<input type="text" name="lName"> <br />
		<input type="text" name="contactNumber"> <br />
		<input type="submit"><br />
	</form>

	<c:forEach items="${customerliststuff}" var="customer">
		<tr>
			<td><c:out value="${customer.fName}"></c:out></td>
			<td><c:out value="${customer.lName}"></c:out></td>
			<td><c:out value="${customer.contactNumber}"></c:out></td>
		</tr>
		<br/>
	</c:forEach>

</body>
</html>