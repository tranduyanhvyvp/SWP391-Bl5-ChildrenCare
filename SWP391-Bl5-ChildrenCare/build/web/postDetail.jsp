<%-- 
    Document   : postDetail
    Created on : Apr 25, 2022, 9:43:52 PM
    Author     : phuch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Special School | Posts</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style1.css">
        <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css"><![endif]-->
    </head>
    <body>
        <jsp:include page="component/header.jsp"></jsp:include>
        <style>
* {
  box-sizing: border-box;
}

/* Add a gray background color with some padding */
body {
  font-family: Arial;
  padding: 20px;
  background: #f1f1f1;
}

/* Create two unequal columns that floats next to each other */
/* Left column */
.leftcolumn {   
  float: left;
  width: 75%;
}

/* Right column */
.rightcolumn {
  float: left;
  width: 25%;
  padding-left: 20px;
}

/* Fake image */
.fakeimg {
  background-color: #aaa;
  width: 100%;
  padding: 20px;
}

/* Add a card effect for articles */
.card {
   background-color: white;
   padding: 20px;
   margin-top: 20px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Footer */
.footer {
  padding: 20px;
  text-align: center;
  background: #ddd;
  margin-top: 20px;
}
/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 800px) {
  .leftcolumn, .rightcolumn {   
    width: 100%;
    padding: 0;
  }
}
</style>
            <div class="row">
                <div class="leftcolumn">
                    <div class="card">
                        <h2>TITLE HEADING</h2>
                        <h5>Author, Dec 7, 2017</h5>
                        <div class="fakeimg" style="height:200px;">Image</div>
                        <p>Some text..</p>
                        <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
                    </div>

                </div>
                <div class="rightcolumn">

                    <div class="card">
                        <h3>Popular Post</h3>
                        <div class="fakeimg">Image</div><br>
                        <div class="fakeimg">Image</div><br>
                        <div class="fakeimg">Image</div>
                    </div>
                </div>
            </div>
        <jsp:include page="component/footer.jsp"></jsp:include>
    </body>
</html>
