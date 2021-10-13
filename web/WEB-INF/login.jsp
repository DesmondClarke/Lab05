<%-- 
    Document   : login
    Created on : Oct 12, 2021, 10:31:28 AM
    Author     : 507936
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login JSP</title>
    </head>
    <body>
        <form method="POST" action="login">
        <h1>Login</h1>
        <br>
        <label>Username:</label>
        <input name="user" type="text"><br>
        <label>Password:</label>
        <input name="pass" type="text"><br>
        <input type="submit" value="Log in">
        </form>   
        <c:if test="${invalidEntry}">
                <p>invalid entry. Please enter both a first name and last.</p>
            </c:if>
    </body>
</html>
