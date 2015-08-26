<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<body>

	<div
		style="float: left; padding-right: 3%; min-width: 45%; width: 46%; border: solid black 4px;">
		<form:form action="registeremployee" style="padding-left: 10px;">
			<input type="input" name="fName" value="First Name"> <br />
			<br /> <input type="input" name="lName" value="Last Name"><br />
			<br /> <form:select path="employeeDepartment">
				<form:option value="SALES">Sales</option>
				<form:option value="WAREHOUSE">Warehouse</option>
			</form:select>> <br /> 
			
			<br /> <form:select path="employeePermissions">
				<form:option value="MANAGER">Manager</option>
				<form:option value="WORKER">Worker</option>
			</form:select> <br /> 
			
			<input type="submit"><br />
		</form:form>
	</div>


</body>
</html>