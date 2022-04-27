package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<link\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("        form {border: 3px solid #f1f1f1;}\n");
      out.write("\n");
      out.write("        input[type=text], input[type=password] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px 20px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            display: inline-block;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            background-color: #04AA6D;\n");
      out.write("            color: white;\n");
      out.write("            padding: 14px 20px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            opacity: 0.8;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cancelbtn {\n");
      out.write("            width: auto;\n");
      out.write("            padding: 10px 18px;\n");
      out.write("            background-color: #f44336;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .imgcontainer {\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 24px 0 12px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        img.avatar {\n");
      out.write("            width: 40%;\n");
      out.write("            border-radius: 50%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            padding: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        span.psw {\n");
      out.write("            float: right;\n");
      out.write("            padding-top: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Change styles for span and cancel button on extra small screens */\n");
      out.write("        @media screen and (max-width: 300px) {\n");
      out.write("            span.psw {\n");
      out.write("                display: block;\n");
      out.write("                float: none;\n");
      out.write("            }\n");
      out.write("            .cancelbtn {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <head>\n");
      out.write("        <title>Register Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <!--[if IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"css/ie6.css\"><![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form action=\"RegisterController\" method=\"post\">\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <label for=\"uname\"><b>Username:</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"psw\"><b>Password:</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"psw\"><b>Confirm Password:</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter Confirm Password\" name=\"rePassword\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"fullname\"><b>Full name:</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Full Name\" name=\"fullName\" required>\n");
      out.write("                    <label for=\"gender\"><b>Gender: </b></label>\n");
      out.write("\n");
      out.write("                    <form>\n");
      out.write("                        <label class=\"radio-inline\">\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value =\"1\" checked>Male\n");
      out.write("                        </label>\n");
      out.write("                        <label class=\"radio-inline\">\n");
      out.write("                            <input type=\"radio\"  name=\"gender\" value=\"0\">Female    \n");
      out.write("                        </label>\n");
      out.write("                    </form>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <label for=\"email\"><b>Email:</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("                    <label for=\"phone\"><b>Mobile:</b></label>\n");
      out.write("                    <input  type=\"text\" placeholder=\"Enter Phone Number\" name=\"phoneNumber\" onchange=\"CheckPhone()\" required>\n");
      out.write("                    <label for=\"address\"><b>Address:</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Address\" name=\"address\" required>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\">Sign-up</button>\n");
      out.write("                    <span class=\"psw\"><a href=\"login.jsp\">Back</a></span>\n");
      out.write("                    <br>\n");
      out.write("                    <p class=\"text-danger\">\n");
      out.write("                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <div>\n");
      out.write("                <div> <span>Follow us</span> <a href=\"#\" class=\"facebook\">Facebook</a> <a href=\"#\" class=\"subscribe\">Subscribe</a> <a href=\"#\" class=\"twitter\">Twitter</a> <a href=\"#\" class=\"flicker\">Flickr</a> </div>\n");
      out.write("                <ul>\n");
      out.write("                    <li> <a href=\"#\"><img src=\"images/playing-in-grass.gif\" alt=\"\"></a>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna.</p>\n");
      out.write("                        <a href=\"#\" class=\"readmore\">Read more</a> </li>\n");
      out.write("                    <li> <a href=\"#\"><img src=\"images/baby-smiling.gif\" alt=\"\"></a>\n");
      out.write("                        <p>Sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud.</p>\n");
      out.write("                        <a href=\"#\" class=\"readmore\">Read more</a> </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"footnote\">Copyright &copy; 2012 <a href=\"#\">School Name</a> All rights reserved | Website Template By <a target=\"_blank\" href=\"http://www.freewebsitetemplates.com/\">freewebsitetemplates.com</a></p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--<script>\n");
      out.write("    function CheckPhone() {\n");
      out.write("        var phone = document.getElementById(\"phoneNumber\").value;\n");
      out.write("        var ph = /^[0]{1}[0-9]{9}$/\n");
      out.write("        if (phone.match(ph)) {\n");
      out.write("            document.getElementById(\"PhoneNumberCheck\").style.display = \"none\";\n");
      out.write("            document.getElementById(\"phoneNumber\").style.borderColor = \"#ced4da\";\n");
      out.write("            return true;\n");
      out.write("        } else {\n");
      out.write("            document.getElementById(\"PhoneNumberCheck\").style.display = \"block\";\n");
      out.write("            document.getElementById(\"phoneNumber\").style.borderColor = \"red\";\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    function ValidateEmail() {\n");
      out.write("        var mail = document.getElementById(\"Email\").value;\n");
      out.write("        var mailformat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$/;\n");
      out.write("        if (mail.match(mailformat)) {\n");
      out.write("\n");
      out.write("            document.getElementById(\"EmailCheck\").style.display = \"none\";\n");
      out.write("            document.getElementById(\"Email\").style.borderColor = \"#ced4da\";\n");
      out.write("            return true;\n");
      out.write("        } else {\n");
      out.write("\n");
      out.write("            document.getElementById(\"EmailCheck\").style.display = \"block\";\n");
      out.write("            document.getElementById(\"Email\").style.borderColor = \"red\";\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>-->\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}