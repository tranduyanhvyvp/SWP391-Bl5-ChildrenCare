<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : header
    Created on : Apr 13, 2022, 3:36:38 PM
    Author     : aDMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div id="header">
            <div> <a href="home.jsp"><img src="images/logo.gif" alt=""></a>
                <ul>
                    <li><a href="home.jsp">Home</a></li>
                    <li><a href="about.jsp">About us</a></li>
                    <li><a href="service.jsp">Services</a></li>
                    <li><a href="blog.jsp">Blog</a></li>
                    <li><a href="contact.jsp">Contact us</a></li>
                    <li><a href="login.jsp">${sessionScope.account.fullName}</a></li>
                        <c:if test="${sessionScope.account.role_id==1}">
                        <li><a href="/SWP391-Bl5-ChildrenCare/userlist">User List</a></li>
                        </c:if>
                        <c:if test="${sessionScope.account.role_id==2}">
                        <li><a href="/SWP391-Bl5-ChildrenCare/feedbacklist">Feedback List</a></li>
                        </c:if>
                    <li><a href="UserProfileController">Profile</a></li>
                    <li><a href="use_change_password.jsp">Change Password</a></li>
                </ul>
            </div>
        </div>
    </body>
</html>
