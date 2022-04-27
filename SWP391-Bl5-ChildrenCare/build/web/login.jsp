
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<html>
    <style>
        body {font-family: Arial, Helvetica, sans-serif;}
        form {border: 3px solid #f1f1f1;}

        input[type=text], input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        button {
            background-color: #04AA6D;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }

        button:hover {
            opacity: 0.8;
        }

        .cancelbtn {
            width: auto;
            padding: 10px 18px;
            background-color: #f44336;
        }

        .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
        }

        img.avatar {
            width: 40%;
            border-radius: 50%;
        }

        .container {
            padding: 16px;
        }

        span.psw {
            float: right;
            padding-top: 16px;
        }

        .container.mess{
            color: red;
        }
       
        /* Change styles for span and cancel button on extra small screens */
        @media screen and (max-width: 300px) {
            span.psw {
                display: block;
                float: none;
            }
            .cancelbtn {
                width: 100%;
            }
        }
    </style>
    <head>
        <title>Login Page</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style1.css">
        <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css"><![endif]-->
    </head>
    <body>


        <jsp:include page="component/header.jsp"></jsp:include>

        <div class="content">



            <form action="LoginController" method="post">

                <div class="container">
                    <label for="uname"><b>Username</b></label>
                    <input type="text" placeholder="Enter Username" name="username" required>

                    <label for="psw"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="password" required>

                    <span class="psw"><a href="#">Reset Password</a></span>

                    <span class="psw"><a href="register.jsp">Register</a>&emsp;&emsp;&emsp;&emsp;</span>

                    <br>
                    <br>
                    <br>
                    <br>


                    <button type="submit" >Login</button>
                    
                    
                    <p class="text-danger">
                       ${mess}
                    </p>
                </div>

            </form>


            
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>


        </div>
        <div id="footer">
            <div>
                <div> <span>Follow us</span> <a href="#" class="facebook">Facebook</a> <a href="#" class="subscribe">Subscribe</a> <a href="#" class="twitter">Twitter</a> <a href="#" class="flicker">Flickr</a> </div>
                <ul>
                    <li> <a href="#"><img src="images/playing-in-grass.gif" alt=""></a>
                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna.</p>
                        <a href="#" class="readmore">Read more</a> </li>
                    <li> <a href="#"><img src="images/baby-smiling.gif" alt=""></a>
                        <p>Sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud.</p>
                        <a href="#" class="readmore">Read more</a> </li>
                </ul>
            </div>
            <p class="footnote">Copyright &copy; 2012 <a href="#">School Name</a> All rights reserved | Website Template By <a target="_blank" href="http://www.freewebsitetemplates.com/">freewebsitetemplates.com</a></p>
        </div>
    </body>
</html>
