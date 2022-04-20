<%-- 
    Document   : services
    Created on : Apr 13, 2022, 3:26:59 PM
    Author     : doqua
--%>

<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
        <style>
            /* Make the image fully responsive */
            .carousel-inner img {
                width: 960px;
                height: 441px;
            }
        </style>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/product.css">
        <title>Special School | Services</title>
    </head>
    <body>
        <jsp:useBean id="a" class="dao.ProductDAO" scope="request"></jsp:useBean>
            <div id="header">
                <div> <a href="index.html"><img src="images/logo.gif" alt=""></a>
                    <ul>
                        <li><a href="index.html">Home</a></li>
                        <li><a href="about.html">About us</a></li>
                        <li class="current"><a href="services.html">Services</a></li>
                        <li><a href="blog.html">Blog</a></li>
                        <li><a href="contact.html">Contact us</a></li>
                    </ul>
                </div>
            </div>
            <div class="content">

                <div id="demo" class="carousel slide" data-ride="carousel" style="margin: 0 auto;">

                    <div class="carousel-inner">
                    <%
                        Boolean active = false;
                        ArrayList<Product> list2 = (ArrayList<Product>) request.getAttribute("listP");
                        for (Product p : list2) {
                            if (!active) {
                                active = true;
                    %>
                    <div class="carousel-item active">
                        <img src="images/<%=p.getThumbnail()%>"  >
                        <div class="carousel-caption">
                            <h3 style="background-color: black;opacity: 0.5;color: white"><%=p.getTitle()%></h3>
                        </div>   
                    </div>
                    <%
                    } else {
                    %>
                    <div class="carousel-item">
                        <img src="images/<%=p.getThumbnail()%>"  >
                        <div class="carousel-caption">
                            <h3 style="background-color: black;opacity: 0.5;color: white"><%=p.getTitle()%></h3>
                        </div>   
                    </div>

                    <%
                            }
                        }

                    %>
                </div>
                <a class="carousel-control-prev" href="#demo" data-slide="prev">
                    <span class="carousel-control-prev-icon"></span>
                </a>
                <a class="carousel-control-next" href="#demo" data-slide="next">
                    <span class="carousel-control-next-icon"></span>
                </a>
            </div>






            <div id="services" style="margin: 0 auto;">
                <div id="content_center" >

                    <%                            NumberFormat nf = NumberFormat.getInstance();
                        nf.setMinimumFractionDigits(0);
                    %>

                    <div id="site-wrapper-p" style="float: left; margin-left: 120px">
                        <ul class="products homepage">

                            <%
                                ArrayList<Product> list = (ArrayList<Product>) request.getAttribute("listP");
                                for (Product p : list) {
                            %>

                            <li class="preorder"><span class="tagimg "></span> <a
                                    href="detail.jsp?id=<%=p.getId()%>"> <img
                                        src="images/<%=p.getThumbnail()%>" width=" 250px" height="250px" />
                                    <h3><%=p.getTitle()%></h3>
                                    <h4>
                                        Original price:
                                        <%=nf.format(p.getOriginalPrice())%>$
                                        </br>
                                        Sale price:
                                        <%=nf.format(p.getSalePrice())%>$
                                    </h4> 

                                    <p class="info">

                                        <span>Information: <%=p.getDescription()%></span>
                                    </p>
                                </a></li>

                            <%
                                }

                            %>
                        </ul>


                    </div>
                </div>
                <ul>

                    <c:forEach begin="1" end="${a.totalPage()}" var="i">
                        <li class="pagination"><a class="page-link" href="PagingServlet?index=${i}">${i}</a></li>
                        </c:forEach>


                </ul>

            </div>

        </div>


        <div>
            <jsp:include page="footer.jsp"></jsp:include>
        </div>

    </body>
</html>
