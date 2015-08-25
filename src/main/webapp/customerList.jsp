<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<body>
	<h1>HELLO</h1>

	<form action="/customerListView">
		<input type="submit">
	</form>

	<br />
	<div
		style="float: left; padding-right: 3%; min-width: 45%; width: 46%; border: solid black 4px;">
		<form action="addcustomer" style="padding-left: 10px;">
			<input type="input" name="fName" value="First Name"> <br />
			<br /> <input type="input" name="lName" value="Last Name"><br />
			<br /> <input type="input" name="contactNumber"
				value="Contact Number"> <br />
			<br /> <input type="submit"><br />
		</form>
	</div>
	<div
		style="float: left; min-width: 45%; width: 46%; border: solid black 4px">
		<c:forEach items="${customerliststuff}" var="customer">
			<tr>
				<div style="padding-left: 10px">
					<td><p>First Name:</p>
						<c:out value="${customer.fName}"></c:out></td>
					<br />
					<br />
					<td><p>Last Name:</p>
						<c:out value="${customer.lName}"></c:out></td>
					<br />
					<br />
					<td><p>Contact Number:</p>
						<c:out value="${customer.contactNumber}"></c:out></td>
					<br />
				</div>
			</tr>
			<br />
		</c:forEach>
	</div>

</body>
</html>