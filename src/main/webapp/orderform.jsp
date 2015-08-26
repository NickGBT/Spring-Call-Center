<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Order Form</title>
</head>

<!-- @author jtaylor -->

<body>
<h1>Customer Order Form</h1>
	
	<form action="submitorder">
		Order ID:<input type="text" name="orderId"><br/><br/>
		Customer ID:<input type="text" name="userId"><br/><br/>
		Items:<input type="text" name="Items"><br/><br/> <!-- To be removed when some sort of basket functionality is implemented -->
		Delivery Address:<br/>
		House Number:<input type="text" name="addressLine1"><br/>
		Street:	<input type="text" name="addressLine2"><br/>
		Town:<input type="text" name="addressLine3"><br/>
		City:<input type="text" name="city"><br/>
		County:<input type="text" name="county"><br/>
		Postcode:<input type="text" name="postcode"><br/>
		Is Billing Address? <input type="checkbox" name="billingAddress"> <br/><br/>
		
		<input type="submit"><br/>
	</form>
	
	<c:forEach items="${fulladdresslist}" var="address">
		<tr>
			<td><c:out value="${address.addressLine1}"></c:out></td>
			<td><c:out value="${address.addressLine2}"></c:out></td>
			<td><c:out value="${address.addressLine3}"></c:out></td>
		</tr>
		<br/>
	</c:forEach>
</body>
</html>