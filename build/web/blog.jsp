<%-- 
    Document   : blog
    Created on : Apr 13, 2022, 3:32:58 PM
    Author     : aDMIN
--%>

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
    <div class="sidebar">
      <h2>Archives</h2>
      <h3 class="first"><a href="#">2011 <span>(60)</span></a></h3>
      <div>
        <p><a href="#">December <span>(1)</span></a></p>
        <p><a href="#">November <span>(11)</span></a></p>
        <p><a href="#">October <span>(3)</span></a></p>
        <p><a href="#">September <span>(8)</span></a></p>
        <p><a href="#">August <span>(2)</span></a></p>
        <p><a href="#">July <span>(3)</span></a></p>
        <p><a href="#">June </a></p>
        <p><a href="#">May <span>(8)</span></a></p>
        <p><a href="#">April <span>(7)</span></a></p>
        <p><a href="#">March <span>(7)</span></a></p>
        <p><a href="#">February <span>(10)</span></a></p>
        <p><a href="#">January <span>(1)</span></a></p>
      </div>
      <h3><a href="#">2010</a></h3>
      <h3><a href="#">2009</a></h3>
    </div>
    <div class="article">
      <ul>
        <li class="first">
          <div class="section"> <a href="#"><img src="images/man.jpg" alt=""></a> <span><a href="#">Jean Michelle</a></span> <span><a href="#">Dec 3</a></span> </div>
          <div>
            <h1><a href="#">Family Improvement 101</a></h1>
            <p>Lorem ipsumdolor sit amet, consec tetuer adipis cing elitsed diam non ummy nibh euismod tincidunt ut laoreet dolore magna. Aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullacorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus.</p>
          </div>
        </li>
        <li>
          <div class="section"> <a href="#"><img src="images/woman.jpg" alt=""></a> <span><a href="#">Ryan Rey</a></span> <span><a href="#">Nov 29</a></span> </div>
          <div>
            <h1><a href="#">Comfort and Care</a></h1>
            <p>Lorem ipsumdolor sit amet, consect tetuer adipis cing elitsed diam non ummy nibh euismod tincidunt ut laoreet dolore magna. Aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>
          </div>
        </li>
        <li>
          <div class="section"> <a href="#"><img src="images/nurse.jpg" alt=""></a> <span><a href="#">Mindy Hill</a></span> <span><a href="#">Nov 11</a></span> </div>
          <div>
            <h1><a href="#">Fighting Bad Behavior</a></h1>
            <p>Lorem ipsumdolor sit amet, consec tetuer adipis cing elitsed diam non ummy nibh euismod tincidunt ut laoreet dolore magna. Aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>
          </div>
        </li>
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

