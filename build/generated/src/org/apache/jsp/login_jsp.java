package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("<html>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {font-family: Arial, Helvetica, sans-serif;}\r\n");
      out.write("        form {border: 3px solid #f1f1f1;}\r\n");
      out.write("\r\n");
      out.write("        input[type=text], input[type=password] {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 12px 20px;\r\n");
      out.write("            margin: 8px 0;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button {\r\n");
      out.write("            background-color: #04AA6D;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 14px 20px;\r\n");
      out.write("            margin: 8px 0;\r\n");
      out.write("            border: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button:hover {\r\n");
      out.write("            opacity: 0.8;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cancelbtn {\r\n");
      out.write("            width: auto;\r\n");
      out.write("            padding: 10px 18px;\r\n");
      out.write("            background-color: #f44336;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .imgcontainer {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin: 24px 0 12px 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        img.avatar {\r\n");
      out.write("            width: 40%;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            padding: 16px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        span.psw {\r\n");
      out.write("            float: right;\r\n");
      out.write("            padding-top: 16px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container.mess{\r\n");
      out.write("            color: red;\r\n");
      out.write("        }\r\n");
      out.write("       \r\n");
      out.write("        /* Change styles for span and cancel button on extra small screens */\r\n");
      out.write("        @media screen and (max-width: 300px) {\r\n");
      out.write("            span.psw {\r\n");
      out.write("                display: block;\r\n");
      out.write("                float: none;\r\n");
      out.write("            }\r\n");
      out.write("            .cancelbtn {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Login Page</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("        <!--[if IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"css/ie6.css\"><![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <form action=\"LoginController\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <label for=\"uname\"><b>Username</b></label>\r\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Username\" name=\"username\" required>\r\n");
      out.write("\r\n");
      out.write("                    <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" id=\"password\" required>\r\n");
      out.write("                    <input type=\"checkbox\" onclick=\"myFunction()\">Show Password\r\n");
      out.write("\r\n");
      out.write("                    <span class=\"psw\"><a href=\"user_email_input.jsp\">Reset Password</a></span>\r\n");
      out.write("\r\n");
      out.write("                    <span class=\"psw\"><a href=\"register.jsp\">Register</a>&emsp;&emsp;&emsp;&emsp;</span>\r\n");
      out.write("\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <button type=\"submit\" >Login</button>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <p class=\"text-danger\">\r\n");
      out.write("                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <div> <span>Follow us</span> <a href=\"#\" class=\"facebook\">Facebook</a> <a href=\"#\" class=\"subscribe\">Subscribe</a> <a href=\"#\" class=\"twitter\">Twitter</a> <a href=\"#\" class=\"flicker\">Flickr</a> </div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li> <a href=\"#\"><img src=\"images/playing-in-grass.gif\" alt=\"\"></a>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna.</p>\r\n");
      out.write("                        <a href=\"#\" class=\"readmore\">Read more</a> </li>\r\n");
      out.write("                    <li> <a href=\"#\"><img src=\"images/baby-smiling.gif\" alt=\"\"></a>\r\n");
      out.write("                        <p>Sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud.</p>\r\n");
      out.write("                        <a href=\"#\" class=\"readmore\">Read more</a> </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"footnote\">Copyright &copy; 2012 <a href=\"#\">School Name</a> All rights reserved | Website Template By <a target=\"_blank\" href=\"http://www.freewebsitetemplates.com/\">freewebsitetemplates.com</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        function myFunction() {\r\n");
      out.write("            var x = document.getElementById(\"password\");\r\n");
      out.write("            if (x.type === \"password\") {\r\n");
      out.write("                x.type = \"text\";\r\n");
      out.write("            } else {\r\n");
      out.write("                x.type = \"password\";\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</html>\r\n");
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
