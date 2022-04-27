<%-- 
    Document   : post
    Created on : Apr 23, 2022, 3:49:00 PM
    Author     : phuch
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Special School | Blog</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style1.css">
        <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css"><![endif]-->
    </head>
     <body>
        <jsp:include page="component/header.jsp"></jsp:include>

            <div class="content">
                <div id="blog">
                    <div class="sidebar">
                        <!--Search-->
                        <div class="grid">
                            <form action="PostListController" method="get" class="search">
                                <div class="form__field">
                                    <input type="search" name="search" placeholder="What are you looking for?" class="form__input" value="${search}">
                                <input type="submit" value="Search" class="button">
                            </div>

                        </form>

                    </div>
                    <h2>Filter</h2>
                    <!--Filter-->
                    <h3 class="first"><a href="PostListController?sort=category_id">Category</a></h3>
                    <div>
                        <c:forEach items="${category}" var="c">
                            <p><a href="PostListController?categoryId=${c.id}">${c.name} </a></p>
                        </c:forEach>
                    </div>
                    <h3><a href="PostListController?sort=status_id">Status</a></h3>
                    <c:forEach items="${status}" var="s">
                        <p><a href="PostListController?statusId=${s.id}">${s.name} </a></p>
                    </c:forEach>
                    <h3><a href="PostListController?sort=author">Author</a></h3>
                </div>
                <!--Posts List-->
                <div class="article">
                    <ul>
                        <c:forEach items="${posts}" var="p">
                            <li>
                                <div id="section" class="section"> <a href="PostDetailController?id=${p.id}"><img src="${p.thumbnail}" alt=""></a> <span>${p.author}</span> <span>${p.post_date}</span> </div>
                                <div id="info">
                                    <h1><a href="PostDetailController?id=${p.id}">${p.title}</a></h1>
                                    <p>${p.brief}...</p>
                                    <a href="PostDetailController?id=${p.id}" class="read-more">Read more</a>
                                </div>
                                <div id="button" style="text-align: -webkit-right;">
                                    <button id="hide">Hide</button>
                                    <button id="show">Show</button>
                                    <button id="edit"><a href="EditPostController?id=${p.id}" style="text-decoration: none;"/>Edit</button>
                                </div>

                                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
                                <script>
                                    $(document).ready(function () {
                                        $("#hide").click(function () {
                                            $("#info").hide();
                                            $("#section").hide();
                                        });
                                        $("#show").click(function () {
                                            $("#info").show();
                                            $("#section").show();
                                        });
                                    });
                                </script>
                            </li>
                        </c:forEach>
                    </ul>

                    <!--Pagination-->
                    <c:if test="${count > 4}">
                        <div id="paging">
                            <ul>
                                <c:forEach begin="1" end="${endPage}" var="i">
                                    <li class="${i==index?"selected":""}">
                                        <a class="page-link" href="PostListController?index=${i}">${i}</a>
                                    </li>
                                </c:forEach>
                            </ul>
                        </div>
                    </c:if>

                </div>
            </div>
        </div>
        <jsp:include page="component/footer.jsp"></jsp:include>
    </body>
</html>

