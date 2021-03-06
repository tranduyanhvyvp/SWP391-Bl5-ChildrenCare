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
  <div id="blog">
    <div class="article">
      <ul>
      <c:forEach var="blog" items="${listBlog}">
              <li class="first">
          <div class="section"> <a href="#"><img src="images/man.jpg" alt=""></a> <span><a>${blog.account_id}</a></span> <span><a href="#">${blog.post_date}</a></span> </div>
          <div>
            <h1><a href="viewBlog?id=${blog.id}">${blog.title}</a></h1>
            <p>${blog.content}</p>
          </div>
        </li>
          </c:forEach>
        
      </ul>
      <div id="paging">
        <ul>
          <li class="selected"><a href="#">1</a></li>
          <li><a href="#">2</a></li>
          <li><a href="#">3</a></li>
          <li><a href="#">4</a></li>
        </ul>
        <a href="#" class="next">Next</a> </div>
    </div>
  </div>
</div>
<jsp:include page="component/footer.jsp"></jsp:include>
</body>
</html>

