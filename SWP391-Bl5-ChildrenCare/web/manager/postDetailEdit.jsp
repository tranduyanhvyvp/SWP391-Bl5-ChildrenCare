<%-- 
    Document   : postDetailEdit
    Created on : Apr 27, 2022, 2:54:10 PM
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
        <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css"><![endif]-->
    </head>
    <body>
        <jsp:include page="../component/header.jsp"></jsp:include>
            <form action="EditPostController" method="post">
                <div class="content">
                    <div class="row">
                        <div class="leftcolumn">
                            <div class="card" style="background-color:#e7e7e7;padding: 20px;">
                                <h2>Edit Post</h2>
                                <input type="hidden" name="id" value="${post.id}"/>
                                <h5>Title: <input type="text" name="title" value="${post.title}"/></h5>
                            <h5>${post.author}, ${post.post_date}</h5>
                            <div class="fakeimg" style="height:400px;"><img src="${post.thumbnail}"/></div>
                            <h5>Edit Content</h5>
                            <textarea name="content" style="width: 908px;height: 158px;">${post.content}</textarea>
                            <h5>Edit Category: <select name="categoryList">
                                    <c:forEach items="${category}" var="c">
                                        <option value="${c.id}">${c.name}</option>
                                    </c:forEach>
                                </select></h5>
                            <h5>Edit Status: <select name="statusList">
                                    <c:forEach items="${status}" var="s">
                                        <option value="${s.id}">${s.name}</option>
                                    </c:forEach>
                                </select></h5>
                            <div class="col-md-12" style="padding-right: 0px;padding-top: 10px;">
                                <a href="PostListController" class="btn btn-default" style="float: right;">Exit</a>
                                <input class="btn btn-default" type="submit" style="float: right;margin-right: 20px;" value="Save"/>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>


        <jsp:include page="../component/footer.jsp"></jsp:include>
    </body>
</html>
