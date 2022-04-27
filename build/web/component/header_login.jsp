
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
                    <li><a href="login.jsp">${sessionScope.username}</a></li>
                    <li><a href="UserProfileController">Profile</a></li>
                    <li><a href="use_change_password.jsp">Change Password</a></li>
                </ul>
            </div>
        </div>
    </body>
</html>
