<%-- 
    Document   : main
    Created on : Mar 28, 2019, 11:40:53 AM
    Author     : student1
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subject</title>
    </head>
    <jsp:useBean id="subject" scope="request" class="model.Subject" >
        <jsp:setProperty name="subject" property="name" value="N/A" />
        <jsp:setProperty name="subject" property="description" value="N/A" />
        <jsp:setProperty name="subject" property="ects" value="6" />
    </jsp:useBean>
    <body>
        <%@include file="header.jsp" %>
        <%@include file="topmenu.jsp" %>
        
            <c:choose>
                <c:when test="${param.update eq 'yes'}">
                    <form action="${pageContext.request.contextPath}/application/updateSubject" method="POST">
                </c:when>
                <c:otherwise>
                    <form action="${pageContext.request.contextPath}/application/saveSubject" method="POST">
                </c:otherwise>
            </c:choose>
            <table border="0" cellspacing="3">
                <tbody>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="name" value="<jsp:getProperty name="subject" property="name" />" size="120" /></td>
                    </tr>
                    <tr>
                        <td>Description:</td>
                        <td>
                            <textarea name="description" rows="4" cols="120" >  
                                <jsp:getProperty name="subject" property="description" />
                            </textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>ECTS:</td>
                        <td>
                            <input type="text" name="ects" value="<jsp:getProperty name="subject" property="ects" />" size="40" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <c:choose>
                                <c:when test="${param.update eq 'yes'}">
                                    <input type="submit" value="Save changes" /> 
                                    <input type="hidden" name="action" value="update" />
                                </c:when>
                                <c:otherwise>
                                    <input ${view} type="submit" value="Save" /> <c:out value="${update}"></c:out>
                                        <input type="hidden" name="action" value="save" />
                                </c:otherwise>
                            </c:choose>

                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
        <%@include file="footer.html" %>
    </body>

</html>
