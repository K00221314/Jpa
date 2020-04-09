

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a Person Record</title>
    </head>
    <body>

    <h1>Create a Person record</h1>
    <form id="createPersonForm" action="CreateUser" method="post">
    <table>
        <tr><td>ID:</td><td><input type="text" id = "userId" name="userId" /></td></tr>
        <tr><td>FirstName</td><td><input type="text" id = "fName" name="fName" /></td></tr>
        <tr><td>LastName</td><td><input type="text" id = "lName" name="lName" /></td></tr>
		 <tr><td>Email</td><td><input type="text" id = "email" name="email" /></td></tr>
		  <tr><td>Password</td><td><input type="text" id = "password" name="password" /></td></tr>
		   <tr><td>Address</td><td><input type="text" id = "address" name="address" /></td></tr>
    </table>
    <input type="submit" id="CreateRecord" value="CreateRecord" />
    </form>
<a href="ListPerson"><strong>Go to List of persons</strong></a>
</body>
</html>
