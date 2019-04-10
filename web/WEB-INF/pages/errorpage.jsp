<%-- 
    Document   : main
    Created on : Mar 28, 2019, 11:40:53 AM
    Author     : student1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <%@include file="topmenu.jsp" %>
        <h1>Specified action doesn't exist, please notify administration if you see this message.</h1>
        
       <a href='${pageContext.request.contextPath}/application/home'> Return to homepage</a>
       <hr>
        <%@include file="footer.html" %>
    </body>
    
</html>
