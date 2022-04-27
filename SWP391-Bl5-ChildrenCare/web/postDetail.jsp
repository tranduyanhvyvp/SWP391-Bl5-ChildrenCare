<%-- 
    Document   : postDetail
    Created on : Apr 25, 2022, 9:43:52 PM
    Author     : phuch
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Special School | ${post.title}</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style1.css">
        <link rel="stylesheet" type="text/css" href="css/postdetail.css">
        <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css"><![endif]-->
    </head>
    <body>
        <jsp:include page="component/header.jsp"></jsp:include>

            <div class="row">
                <div class="leftcolumn">
                    <div class="card">
                        <h2>${post.title}</h2>
                    <h5>${post.author}, ${post.post_date}</h5>
                    <div class="fakeimg" style="height:200px;"><img src="${post.thumbnail}"/></div>
                    <p>${post.content}</p>
                </div>
            </div>
            <div class="rightcolumn">
                <div class="card">
                    <h3>Latest Posts</h3>
                    <c:forEach items="${latest}" var="la">
                        <div class="fakeimg"><img src="${la.thumbnail}"style="width: 127%;
                                                  height: 100px;"/><a href="PostDetailController?id=${la.id}"/>${la.title}...</div><br>
                        </c:forEach>
                    <!--                    <div class="fakeimg">Image</div><br>
                                        <div class="fakeimg">Image</div><br>
                                        <div class="fakeimg">Image</div>-->
                </div>
            </div>
        </div>
        <jsp:include page="component/footer.jsp"></jsp:include>
    </body>
</html>
