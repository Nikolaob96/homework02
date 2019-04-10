<%-- 
    Document   : main
    Created on : Mar 28, 2019, 11:40:53 AM
    Author     : student1
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subjects</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <%@include file="topmenu.jsp" %>
        <div>
            View all subjects
        </div>
        <div>
            <table border="1" cellspacing="3">
                <thead>
                    <tr>
                        <th>name</th>
                        <th>description</th>
                        <th>ects</th>
                        <th>action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="sub" items="${subjects}">
                    
                    <tr>
                        <td>${sub.name}</td>
                        <td>${sub.description}</td>
                        <td>${sub.ects}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/application/oneSubject?name=${sub.name}">View</a>
                            <a href="${pageContext.request.contextPath}/application/oneSubject?name=${sub.name}&update=yes">Edit</a>
                            <a href="${pageContext.request.contextPath}/application/deleteSubject?name=${sub.name}" onclick="return confirm('Are you sure you want to delete this subject?');">Delete</a>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
        <%@include file="footer.html" %>
    </body>

</html>
