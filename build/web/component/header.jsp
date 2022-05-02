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
            <div> <a href="HomePageController"><img src="images/logo.gif" alt=""></a>
                <ul>
                    <li><a href="HomePageController">Home</a></li>
                    <li><a href="PostListController">Posts</a></li>
                    <li><a href="ServicesController">Services</a></li>
                    <li><a href="/SWP391-Bl5-ChildrenCare/blogList">Blog</a></li>
                        <c:if test="${sessionScope.account != null}">
                        <li><a href="UserProfileController">${sessionScope.account.username}</a></li>
                        <li><a href="LogOutController">Logout</a></li>
                        </c:if>
                        <c:if test="${sessionScope.account == null}">
                        <li><a href="login.jsp">Login</a></li>                      
                        </c:if>
                        <c:if test="${sessionScope.account.role_id==2}">
                        <li><a href="/SWP391-Bl5-ChildrenCare/manageCustomer">Manager Customer</a></li>
                        </c:if>
                        <c:if test="${sessionScope.account.role_id==1}">
                        <li><a href="/SWP391-Bl5-ChildrenCare/userlist">User List</a></li>
                        </c:if>
                        <c:if test="${sessionScope.account.role_id==2}">
                        <li><a href="/SWP391-Bl5-ChildrenCare/feedbacklist">Feedback List</a></li>
                        </c:if>
                        <c:if test="${sessionScope.account.role_id==2||sessionScope.account.role_id==3}">
                        <li><a href="/SWP391-Bl5-ChildrenCare/reservationlist">Reservation</a></li>
                        </c:if>
                </ul>
            </div>
        </div>
    </body>
</html>
