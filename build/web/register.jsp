<%-- 
    Document   : register
    Created on : Apr 18, 2022, 2:24:18 PM
    Author     : stter
--%>


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
        <title>Register Page</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css"><![endif]-->
    </head>
    <body>


        <jsp:include page="component/header.jsp"></jsp:include>

            <div class="content">




                <form action="RegisterController" method="post">

                    <div class="container">
                        <label for="uname"><b>Username:</b></label>
                        <input type="text" placeholder="Enter Username" name="username" required>

                        <label for="psw"><b>Password:</b></label>
                        <input type="password" placeholder="Enter Password" name="password" id="password" required>
                        <input type="checkbox" onclick="myFunction()">Show Password
                        <br>
                        <label for="psw"><b>Confirm Password:</b></label>
                        <input type="password" placeholder="Enter Confirm Password" name="rePassword" id ="confirmNewPassword" required>
                        <input type="checkbox" onclick="myFunction1()">Show Password
                        <br>
                        <label for="fullname"><b>Full name:</b></label>
                        <input type="text" placeholder="Enter Full Name" name="fullName" required>
                        <label for="gender"><b>Gender: </b></label>

                        <form>
                            <label class="radio-inline">
                                <input type="radio" name="gender" value ="1" checked>Male
                            </label>
                            <label class="radio-inline">
                                <input type="radio"  name="gender" value="0">Female    
                            </label>
                        </form>
                        <br>
                        <br>
                        <label for="email"><b>Email:</b></label>
                        <input type="text" placeholder="Enter Email" name="email" required>
                        <label for="phone"><b>Mobile:</b></label>
                        <input  type="text" placeholder="Enter Phone Number" name="phoneNumber" onchange="CheckPhone()" required>
                        <label for="address"><b>Address:</b></label>
                        <input type="text" placeholder="Enter Address" name="address" required>

                        <button type="submit">Sign-up</button>
                        <span class="psw"><a href="login.jsp">Back</a></span>
                        <br>
                        <p class="text-danger">
                        ${mess}
                    </p>
                </div>



            </form>

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
    
    <script>
        function myFunction() {
            var x = document.getElementById("password");
            if (x.type === "password") {
                x.type = "text";
            }  else {
                x.type = "password";
            }
        }
        function myFunction1() {
            var x = document.getElementById("confirmNewPassword");
            if (x.type === "password") {
                x.type = "text";
            }  else {
                x.type = "password";
            }
        }
    </script>
    
    
</html>

<!--<script>
    function CheckPhone() {
        var phone = document.getElementById("phoneNumber").value;
        var ph = /^[0]{1}[0-9]{9}$/
        if (phone.match(ph)) {
            document.getElementById("PhoneNumberCheck").style.display = "none";
            document.getElementById("phoneNumber").style.borderColor = "#ced4da";
            return true;
        } else {
            document.getElementById("PhoneNumberCheck").style.display = "block";
            document.getElementById("phoneNumber").style.borderColor = "red";
            return false;
        }
    }
    function ValidateEmail() {
        var mail = document.getElementById("Email").value;
        var mailformat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
        if (mail.match(mailformat)) {

            document.getElementById("EmailCheck").style.display = "none";
            document.getElementById("Email").style.borderColor = "#ced4da";
            return true;
        } else {

            document.getElementById("EmailCheck").style.display = "block";
            document.getElementById("Email").style.borderColor = "red";
            return false;
        }
    }
</script>-->
