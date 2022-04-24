package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Special School | Blog</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("<!--[if IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"css/ie6.css\"><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/header.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("  <div id=\"blog\">\r\n");
      out.write("    <div class=\"sidebar\">\r\n");
      out.write("      <h2>Archives</h2>\r\n");
      out.write("      <h3 class=\"first\"><a href=\"#\">2011 <span>(60)</span></a></h3>\r\n");
      out.write("      <div>\r\n");
      out.write("        <p><a href=\"#\">December <span>(1)</span></a></p>\r\n");
      out.write("        <p><a href=\"#\">November <span>(11)</span></a></p>\r\n");
      out.write("        <p><a href=\"#\">October <span>(3)</span></a></p>\r\n");
      out.write("        <p><a href=\"#\">September <span>(8)</span></a></p>\r\n");
      out.write("        <p><a href=\"#\">August <span>(2)</span></a></p>\r\n");
      out.write("        <p><a href=\"#\">July <span>(3)</span></a></p>\r\n");
      out.write("        <p><a href=\"#\">June </a></p>\r\n");
      out.write("        <p><a href=\"#\">May <span>(8)</span></a></p>\r\n");
      out.write("        <p><a href=\"#\">April <span>(7)</span></a></p>\r\n");
      out.write("        <p><a href=\"#\">March <span>(7)</span></a></p>\r\n");
      out.write("        <p><a href=\"#\">February <span>(10)</span></a></p>\r\n");
      out.write("        <p><a href=\"#\">January <span>(1)</span></a></p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <h3><a href=\"#\">2010</a></h3>\r\n");
      out.write("      <h3><a href=\"#\">2009</a></h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"article\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li class=\"first\">\r\n");
      out.write("          <div class=\"section\"> <a href=\"#\"><img src=\"images/man.jpg\" alt=\"\"></a> <span><a href=\"#\">Jean Michelle</a></span> <span><a href=\"#\">Dec 3</a></span> </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <h1><a href=\"#\">Family Improvement 101</a></h1>\r\n");
      out.write("            <p>Lorem ipsumdolor sit amet, consec tetuer adipis cing elitsed diam non ummy nibh euismod tincidunt ut laoreet dolore magna. Aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullacorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <div class=\"section\"> <a href=\"#\"><img src=\"images/woman.jpg\" alt=\"\"></a> <span><a href=\"#\">Ryan Rey</a></span> <span><a href=\"#\">Nov 29</a></span> </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <h1><a href=\"#\">Comfort and Care</a></h1>\r\n");
      out.write("            <p>Lorem ipsumdolor sit amet, consect tetuer adipis cing elitsed diam non ummy nibh euismod tincidunt ut laoreet dolore magna. Aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <div class=\"section\"> <a href=\"#\"><img src=\"images/nurse.jpg\" alt=\"\"></a> <span><a href=\"#\">Mindy Hill</a></span> <span><a href=\"#\">Nov 11</a></span> </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <h1><a href=\"#\">Fighting Bad Behavior</a></h1>\r\n");
      out.write("            <p>Lorem ipsumdolor sit amet, consec tetuer adipis cing elitsed diam non ummy nibh euismod tincidunt ut laoreet dolore magna. Aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <div id=\"paging\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"selected\"><a href=\"#\">1</a></li>\r\n");
      out.write("          <li><a href=\"#\">2</a></li>\r\n");
      out.write("          <li><a href=\"#\">3</a></li>\r\n");
      out.write("          <li><a href=\"#\">4</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <a href=\"#\" class=\"next\">Next</a> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
