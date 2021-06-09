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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("       <meta name=\"description\" content=\"\">\n");
      out.write("       <meta name=\"author\" content=\"\">\n");
      out.write("       <meta charset=\"utf-8\">\n");
      out.write("       <meta name=\"description\" content=\"\">\n");
      out.write("       <meta name=\"author\" content=\"webthemez.com\">\n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title>GET!T - Health Services</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template -->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/agency.min2.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-icon.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"page-section\" id=\"contact\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12 text-center\">\n");
      out.write("          <h2 class=\"section-heading text-uppercase\">Contact Us</h2>\n");
      out.write("          <h3 class=\"section-subheading text-muted\">Lorem ipsum dolor sit amet consectetur.</h3>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("          <form id=\"contactForm\" name=\"sentMessage\" novalidate=\"novalidate\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input class=\"form-control\" id=\"name\" type=\"text\" placeholder=\"Your Name *\" required=\"required\" data-validation-required-message=\"Please enter your name.\">\n");
      out.write("                  <p class=\"help-block text-danger\"></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input class=\"form-control\" id=\"email\" type=\"email\" placeholder=\"Your Email *\" required=\"required\" data-validation-required-message=\"Please enter your email address.\">\n");
      out.write("                  <p class=\"help-block text-danger\"></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input class=\"form-control\" id=\"phone\" type=\"tel\" placeholder=\"Your Phone *\" required=\"required\" data-validation-required-message=\"Please enter your phone number.\">\n");
      out.write("                  <p class=\"help-block text-danger\"></p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <textarea class=\"form-control\" id=\"message\" placeholder=\"Your Message *\" required=\"required\" data-validation-required-message=\"Please enter a message.\"></textarea>\n");
      out.write("                  <p class=\"help-block text-danger\"></p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"clearfix\"></div>\n");
      out.write("              <div class=\"col-lg-12 text-center\">\n");
      out.write("                <div id=\"success\"></div>\n");
      out.write("                <button id=\"sendMessageButton\" class=\"btn btn-primary btn-xl text-uppercase\" type=\"submit\">Send Message</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- Footer -->\n");
      out.write("  <footer class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row align-items-center\" style=\"text-align: center;\">\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <span class=\"copyright\">Copyright &copy; Getit 2019</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <ul class=\"list-inline social-buttons\">\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <i class=\"fab fa-twitter\"></i>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <ul class=\"list-inline quicklinks\">\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("              <a href=\"#\">Privacy Policy</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("              <a href=\"#\">Terms of Use</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
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
