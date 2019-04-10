<%-- 
    Document   : login
    Created on : Mar 28, 2019, 10:59:01 AM
    Author     : student1
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="model.UserProfile"%>
<%@page import="model.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WebApp Login Page</title>
    </head>
    
        <c:set var="msg" value="${message}"/>
        <c:out value="${msg.message}"/> 
        
        <c:set var="user" value="${userprofile}" />
        
        
        <h1>Please Login</h1>
        <form method="POST" action="/WebApp/application/login">
            <table border="0" cellspacing="3">
                <tbody>
                    
                    <c:if test="${not empty msg}">
                   
                    <tr>
                        <td>Error Type:</td>
                        <td> ${msg.type}</td>
                    </tr>
                    <tr>
                        <td>Error:</td>
                        <td>${msg.message} </td>
                    </tr>
                    
                    </c:if>
                    <tr>
                        <td>Username:</td>
                        <td>
                            <input name="username" value="${user.username}" type="text" width="60"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td>
                            <input name="password"  value="${user.password}" type="password" width="60"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Login" /></td>

                    </tr>
                </tbody>
            </table>

        </form>
    
</html>
