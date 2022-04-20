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
<body>
<jsp:include page="component/header.jsp"></jsp:include>
<div class="content">


    <div class="article">
      <ul>
          <h1>${blog.title}</h1>
      <p style="font-style: italic">${blog.post_date}</p>
      <p>${blog.content}</p>
      
      </ul>


</div>
<jsp:include page="component/footer.jsp"></jsp:include>
</body>
</html>

