<%-- 
    Document   : testRating
    Created on : Apr 24, 2022, 3:20:16 AM
    Author     : aDMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet prefetch' href='https://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css'>
        <link rel="stylesheet" type="text/css" href="css/starRate.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="stars">
            <form action="">
                <input class="star star-5" id="star-5" type="radio" name="star" value="5"/>
                <label class="star star-5" for="star-5" ></label>
                <input class="star star-4" id="star-4" type="radio" name="star" value="4"/>
                <label class="star star-4" for="star-4"></label>
                <input class="star star-3" id="star-3" type="radio" name="star" value="3"/>
                <label class="star star-3" for="star-3"></label>
                <input class="star star-2" id="star-2" type="radio" name="star" value="2"/>
                <label class="star star-2" for="star-2"></label>
                <input class="star star-1" id="star-1" type="radio" name="star" value="1"/>
                <label class="star star-1" for="star-1"></label>
            </form>
        </div>
    </body>
</html>
