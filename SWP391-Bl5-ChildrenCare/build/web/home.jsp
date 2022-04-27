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
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.3/jquery.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick.min.js"></script>
            <link href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick.min.css" rel="stylesheet" />
            <link href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.6.0/slick-theme.min.css" rel="stylesheet" />
            <script type="text/javascript">
                $(document).on('ready', function () {
                    $(".regular").slick({
                        dots: true,
                        infinite: true,
                        slidesToShow: 3,
                        slidesToScroll: 3
                    });
                });
            </script>
            <style>
                * {
                    box-sizing: border-box;
                }
                .column {
                    float: left;
                    width: 33.33%;
                    padding: 5px;
                }
                .regular slider::after{
                    content: "";
                    clear: both;
                    display: table;
                }
            </style>
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->


                <section class="regular slider">
                    <div class="column">
                        <img src="images/health_check.jpg">
                    </div>
                    <div class="column">
                        <img src="images/dental.jpg">
                    </div>
                    <div class="column">
                        <img src="images/health_check.jpg">
                    </div>
                    <div class="column">
                        <img src="images/health_check.jpg">
                    </div>
                    <div class="column">
                        <img src="images/health_check.jpg">
                    </div>
                    <div class="column">
                        <img src="images/health_check.jpg">
                    </div>
                </section>
            </div>
        </div>
        <jsp:include page="component/footer.jsp"></jsp:include>
    </body>
</html>

