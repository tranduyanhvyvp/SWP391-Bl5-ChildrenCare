package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Special School | Contact</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("<!--[if IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"css/ie6.css\"><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/header.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("  <div>\r\n");
      out.write("    <div> <img src=\"images/calling.jpg\" alt=\"\"> </div>\r\n");
      out.write("    <div>\r\n");
      out.write("      <div id=\"sidebar\">\r\n");
      out.write("        <h3>Our Education</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li id=\"vision\"> <span>Our Vision</span>\r\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim venia.</p>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li id=\"mission\"> <span>Our Mission</span>\r\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim venia.</p>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li id=\"wecare\"> <span>We care</span>\r\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim venia.</p>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"contact\">\r\n");
      out.write("        <h4 class=\"first\">Customer Service</h4>\r\n");
      out.write("        <p>E-mail: <a href=\"#\">name@domainname.com</a></p>\r\n");
      out.write("        <p>Call or e-mail us for help with any aspect of your purchase, online or offline.</p>\r\n");
      out.write("        <b>Call toll-free: 877 000 0000<br>\r\n");
      out.write("        Call toll-free: 866 000 0000<br>\r\n");
      out.write("        Toll-free fax: 877 000 0000</b>\r\n");
      out.write("        <h4>Mailing Addresses</h4>\r\n");
      out.write("        <p>Petshop</p>\r\n");
      out.write("        <p>250 Lorem ipsum Street</p>\r\n");
      out.write("        <p>4th Floor</p>\r\n");
      out.write("        <p>Jaofanr, Caknan 109935</p>\r\n");
      out.write("        <p>Kiangab</p>\r\n");
      out.write("      </div>\r\n");
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
