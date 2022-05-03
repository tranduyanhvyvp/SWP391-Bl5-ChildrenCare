package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservation_005fdetail_005fstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <!--  This file has been downloaded from bootdey.com @bootdey on twitter -->\n");
      out.write("        <!--  All snippets are MIT license http://bootdey.com/license -->\n");
      out.write("        <title>profile with data and skills - Bootdey.com</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"main-body\">\n");
      out.write("\n");
      out.write("                <!-- Breadcrumb -->\n");
      out.write("                <nav aria-label=\"breadcrumb\" class=\"main-breadcrumb\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"index.html\">Home</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"/SWP391-Bl5-ChildrenCare/userlist\">User</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item active\" aria-current=\"page\">User Profile</li>\n");
      out.write("                    </ol>\n");
      out.write("                </nav>\n");
      out.write("                <!-- /Breadcrumb -->\n");
      out.write("\n");
      out.write("                <div class=\"row gutters-sm\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"card mb-3\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <h6 class=\"mb-0\">Full Name</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userDetail.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <h6 class=\"mb-0\">Email</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userDetail.emaii}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <h6 class=\"mb-0\">Phone</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userDetail.phoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <h6 class=\"mb-0\">Role</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userDetail.role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <h6 class=\"mb-0\">Address</h6>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9 text-secondary\">\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userDetail.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <a class=\"btn btn-info \" target=\"__blank\" href=\"/SWP391-Bl5-ChildrenCare-chiennt/userdetailedit?uid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userDetail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Edit</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                margin-top:20px;\n");
      out.write("                color: #1a202c;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: #e2e8f0;    \n");
      out.write("            }\n");
      out.write("            .main-body {\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("            .card {\n");
      out.write("                box-shadow: 0 1px 3px 0 rgba(0,0,0,.1), 0 1px 2px 0 rgba(0,0,0,.06);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card {\n");
      out.write("                position: relative;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                min-width: 0;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("                background-color: #fff;\n");
      out.write("                background-clip: border-box;\n");
      out.write("                border: 0 solid rgba(0,0,0,.125);\n");
      out.write("                border-radius: .25rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-body {\n");
      out.write("                flex: 1 1 auto;\n");
      out.write("                min-height: 1px;\n");
      out.write("                padding: 1rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gutters-sm {\n");
      out.write("                margin-right: -8px;\n");
      out.write("                margin-left: -8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gutters-sm>.col, .gutters-sm>[class*=col-] {\n");
      out.write("                padding-right: 8px;\n");
      out.write("                padding-left: 8px;\n");
      out.write("            }\n");
      out.write("            .mb-3, .my-3 {\n");
      out.write("                margin-bottom: 1rem!important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bg-gray-300 {\n");
      out.write("                background-color: #e2e8f0;\n");
      out.write("            }\n");
      out.write("            .h-100 {\n");
      out.write("                height: 100%!important;\n");
      out.write("            }\n");
      out.write("            .shadow-none {\n");
      out.write("                box-shadow: none!important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
