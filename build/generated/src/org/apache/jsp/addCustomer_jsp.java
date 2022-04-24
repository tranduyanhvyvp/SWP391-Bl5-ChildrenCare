package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <!--  This file has been downloaded from bootdey.com @bootdey on twitter -->\n");
      out.write("        <!--  All snippets are MIT license http://bootdey.com/license -->\n");
      out.write("        <title>profile edit data and skills - Bootdey.com</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"main-body\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"d-flex flex-column align-items-center text-center\">\n");
      out.write("                                    <img src=\"https://bootdey.com/img/Content/avatar/avatar6.png\" alt=\"Admin\" class=\"rounded-circle p-1 bg-primary\" width=\"110\">\n");
      out.write("                                    <div class=\"mt-3\">\n");
      out.write("                                        <h4>John Doe</h4>\n");
      out.write("                                        <p class=\"text-secondary mb-1\">Full Stack Developer</p>\n");
      out.write("                                        <p class=\"text-muted font-size-sm\">Bay Area, San Francisco, CA</p>\n");
      out.write("                                        <button class=\"btn btn-primary\">Follow</button>\n");
      out.write("                                        <button class=\"btn btn-outline-primary\">Message</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"my-4\">\n");
      out.write("                                <ul class=\"list-group list-group-flush\">\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\n");
      out.write("                                        <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-globe me-2 icon-inline\"><circle cx=\"12\" cy=\"12\" r=\"10\"></circle><line x1=\"2\" y1=\"12\" x2=\"22\" y2=\"12\"></line><path d=\"M12 2a15.3 15.3 0 0 1 4 10 15.3 15.3 0 0 1-4 10 15.3 15.3 0 0 1-4-10 15.3 15.3 0 0 1 4-10z\"></path></svg>Website</h6>\n");
      out.write("                                        <span class=\"text-secondary\">https://bootdey.com</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\n");
      out.write("                                        <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-github me-2 icon-inline\"><path d=\"M9 19c-5 1.5-5-2.5-7-3m14 6v-3.87a3.37 3.37 0 0 0-.94-2.61c3.14-.35 6.44-1.54 6.44-7A5.44 5.44 0 0 0 20 4.77 5.07 5.07 0 0 0 19.91 1S18.73.65 16 2.48a13.38 13.38 0 0 0-7 0C6.27.65 5.09 1 5.09 1A5.07 5.07 0 0 0 5 4.77a5.44 5.44 0 0 0-1.5 3.78c0 5.42 3.3 6.61 6.44 7A3.37 3.37 0 0 0 9 18.13V22\"></path></svg>Github</h6>\n");
      out.write("                                        <span class=\"text-secondary\">bootdey</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\n");
      out.write("                                        <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-twitter me-2 icon-inline text-info\"><path d=\"M23 3a10.9 10.9 0 0 1-3.14 1.53 4.48 4.48 0 0 0-7.86 3v1A10.66 10.66 0 0 1 3 4s-4 9 5 13a11.64 11.64 0 0 1-7 2c9 5 20 0 20-11.5a4.5 4.5 0 0 0-.08-.83A7.72 7.72 0 0 0 23 3z\"></path></svg>Twitter</h6>\n");
      out.write("                                        <span class=\"text-secondary\">@bootdey</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\n");
      out.write("                                        <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-instagram me-2 icon-inline text-danger\"><rect x=\"2\" y=\"2\" width=\"20\" height=\"20\" rx=\"5\" ry=\"5\"></rect><path d=\"M16 11.37A4 4 0 1 1 12.63 8 4 4 0 0 1 16 11.37z\"></path><line x1=\"17.5\" y1=\"6.5\" x2=\"17.51\" y2=\"6.5\"></line></svg>Instagram</h6>\n");
      out.write("                                        <span class=\"text-secondary\">bootdey</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\n");
      out.write("                                        <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-facebook me-2 icon-inline text-primary\"><path d=\"M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z\"></path></svg>Facebook</h6>\n");
      out.write("                                        <span class=\"text-secondary\">bootdey</span>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form action=\"useradding\" method=\"POST\">\n");
      out.write("                                    <div class=\"row mb-3\">\n");
      out.write("                                        <div class=\"col-sm-3\">\n");
      out.write("                                            <h6 class=\"mb-0\">Full Name</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                            <input type=\"text\" name=\"fullname\" class=\"form-control\" value=\"John Doe\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row mb-3\">\n");
      out.write("                                        <div class=\"col-sm-3\">\n");
      out.write("                                            <h6 class=\"mb-0\">Email</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                            <input type=\"text\" name=\"email\" class=\"form-control\" value=\"john@example.com\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row mb-3\">\n");
      out.write("                                        <div class=\"col-sm-3\">\n");
      out.write("                                            <h6 class=\"mb-0\">Phone</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                            <input type=\"text\" name=\"phonenumber\" class=\"form-control\" value=\"(239) 816-9029\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row mb-3\">\n");
      out.write("                                        <div class=\"col-sm-3\">\n");
      out.write("                                            <h6 class=\"mb-0\">Address</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                            <input type=\"text\" name=\"address\" class=\"form-control\" value=\"Bay Area, San Francisco, CA\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row mb-3\">\n");
      out.write("                                        <div class=\"col-sm-3\">\n");
      out.write("                                            <h6 class=\"mb-0\">DOB</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                            <input type=\"date\" class=\"form-control\" name=\"dob\" value=\"10-01-2000\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row mb-3\">\n");
      out.write("                                        <div class=\"col-sm-3\">\n");
      out.write("                                            <h6 class=\"mb-0\">Gender</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                            Male<input type=\"radio\" name=\"gender\" value=\"1\" />\n");
      out.write("                                            Female <input type=\"radio\" name=\"gender\" value=\"0\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row mb-3\">\n");
      out.write("                                        <div class=\"col-sm-3\">\n");
      out.write("                                            <h6 class=\"mb-0\">Username</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"username\" value=\"username\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-3\"></div>\n");
      out.write("                                        <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                            <input type=\"submit\" class=\"btn btn-primary px-4\" value=\"Adding\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                background: #f7f7ff;\n");
      out.write("                margin-top:20px;\n");
      out.write("            }\n");
      out.write("            .card {\n");
      out.write("                position: relative;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                min-width: 0;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("                background-color: #fff;\n");
      out.write("                background-clip: border-box;\n");
      out.write("                border: 0 solid transparent;\n");
      out.write("                border-radius: .25rem;\n");
      out.write("                margin-bottom: 1.5rem;\n");
      out.write("                box-shadow: 0 2px 6px 0 rgb(218 218 253 / 65%), 0 2px 6px 0 rgb(206 206 238 / 54%);\n");
      out.write("            }\n");
      out.write("            .me-2 {\n");
      out.write("                margin-right: .5rem!important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
