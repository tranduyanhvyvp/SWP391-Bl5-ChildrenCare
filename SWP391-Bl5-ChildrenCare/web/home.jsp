<%-- 
    Document   : home
    Created on : Apr 13, 2022, 3:33:44 PM
    Author     : aDMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Special School</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css"><![endif]-->
    </head>
    <body>
        <jsp:include page="component/header.jsp"></jsp:include>
            <div id="content">
                <div>
                    <div>
                    <c:forEach items="${listBlog}" var="b">
                        <h2><a href="blogdetail?id=${b.id}">${b.title}</a></h2>
                        <p>${b.content}</p>                        

                    </c:forEach>
                </div>

            </div>

        </div>
        <div class="container">
            <h2>Our Services</h2>
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner">
               
                    <div class="item active">
                        <img src="images/health_check.jpg"  style="width:100%; ">
                        <div class="carousel-caption">
                            <h3>Health check</h3>
                            <p>Book a child health check</p>
                        </div>
                    </div>

                    <div class="item">
                        <img src="images/dental.jpg"  style="width:100%;">
                        <div class="carousel-caption">
                            <h3>Dental</h3>
                            <p>Book a dental service</p>
                        </div>
                    </div>

                    <div class="item">
                        <img src="images/child_keep.jpg" style="width:100%;">
                        <div class="carousel-caption">
                            <h3>Child Keep</h3>
                            <p>Book a child keep service</p>
                        </div>
                    </div>

                </div>

                <!-- Left and right controls -->
                <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <jsp:include page="component/footer.jsp"></jsp:include>
    </body>
</html>

