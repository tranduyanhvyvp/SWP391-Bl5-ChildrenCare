<%-- 
    Document   : blog
    Created on : Apr 13, 2022, 3:32:58 PM
    Author     : aDMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Special School | Blog</title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css"><![endif]-->
</head>

<style>
    footer {
    position: absolute;
    left: 0;
    bottom: 0;
    height: 100px;
    width: 100%;
}
    div.content {
    background: #ffffff url(../images/bg-content2.gif) repeat-x bottom center;
    padding-bottom: 50vh;
}
</style>
<body>
<jsp:include page="component/header.jsp"></jsp:include>
<div class="content">


    <div class="article">
      <ul>
          <h1>${blog.title}</h1>
      <p style="font-style: italic">${blog.post_date}</p>
      <p>${blog.content}</p>
      
      </ul>


      <footer>
          <jsp:include page="component/footer.jsp"></jsp:include>

      </footer>
</body>
</html>

