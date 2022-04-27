<%-- 
    Document   : service
    Created on : Apr 13, 2022, 3:34:01 PM
    Author     : aDMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Special School | Services</title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css"><![endif]-->
</head>
<body>
<jsp:include page="component/header.jsp"></jsp:include>
<div class="content">
  <div>
    <div> <img src="images/baby.jpg" alt=""> </div>
    <div id="services">
      <div id="sidebar">
        <h3>Our Education</h3>
        <ul>
          <li id="vision"> <span>Our Vision</span>
            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim venia.</p>
          </li>
          <li id="mission"> <span>Our Mission</span>
            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim venia.</p>
          </li>
          <li id="wecare"> <span>We care</span>
            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim venia.</p>
          </li>
        </ul>
      </div>
      <div id="aside"> <span class="first">Used Methods</span>
        <ul class="section">
          <li>Inclusion</li>
          <li>Mainstreaming</li>
          <li>Exclusion</li>
          <li>Segreation</li>
        </ul>
        <span>Common Special needs include:</span> <b>~ &nbsp;Challeger with learning</b> <b>~ &nbsp;Emotional and Behavioral Disorders</b> <b>~ &nbsp;Physical Disabilities</b> <b>~ &nbsp;Developmental Disorders</b> <span>Our Services</span>
        <div>
          <ol>
            <li>Speech and Language Pathology</li>
            <li>Audiology</li>
            <li>Psychological Services</li>
            <li>Physical Therapy</li>
            <li>Occupation Therapy</li>
            <li>Counseling Services</li>
            <li>Rehabilitation Counseling</li>
            <li>Orientation and Mobility Services</li>
          </ol>
          <ol>
            <li>School Social Work</li>
            <li>Assistive Technology Services</li>
            <li>Corrective Support Services</li>
            <li>Developmental Recreation Activities</li>
            <li>School Health Services</li>
            <li>Parent Counseling and Training</li>
            <li>Medical Services</li>
          </ol>
        </div>
      </div>
    </div>
  </div>
</div>
<jsp:include page="component/footer.jsp"></jsp:include>
</body>
</html>
