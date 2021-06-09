package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"webthemez.com\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("  <title>GET!T - Get your basic needs at your fingertip</title>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap core CSS -->\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Custom fonts for this template -->\n");
      out.write("  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("  <!-- Custom styles for this template -->\n");
      out.write("  <link href=\"css/agency.min2.css\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/font-icon.css\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function()\n");
      out.write("{\n");
      out.write("  $(\"#mainNav\").hover(function()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("$(\"#services\").show();\n");
      out.write("});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("  <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top\" id=\"mainNav\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">GET!T</a>\n");
      out.write("      <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        Menu\n");
      out.write("        <i class=\"fas fa-bars\"></i>\n");
      out.write("      </button>\n");
      out.write("     \n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <!-- Header -->\n");
      out.write("  <section class=\"banner\" role=\"banner\" style=\"background-image: url(images/banner1.jpg);\">\n");
      out.write("  \n");
      out.write("  <!-- banner text -->\n");
      out.write("  <div class=\"container\">\n");
      out.write("  \n");
      out.write("      <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Name</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" name=\"t1\" required placeholder=\"Name\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("   <div class=\"form-group\">\n");
      out.write("    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Email</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"inputEmail3\" name=\"t2\" required placeholder=\"Email\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Mobile Number</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" name=\"t3\" required placeholder=\"Mob. no.\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("   <div class=\"form-group\">\n");
      out.write("    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">User Id</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" name=\"t4\" required placeholder=\"User Id\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Password</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" name=\"t5\" required placeholder=\"Password\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-default\" name=\"b1\">Sign up</button>\n");
      out.write("    </div>\n");
      out.write("      ");

if(request.getParameter("b1")!=null)
{

	

	String name=request.getParameter("t1");
        String email=request.getParameter("t2");
        String mob=request.getParameter("t3");
        String id=request.getParameter("t4");
	String pw=request.getParameter("t5");

	


	Connection con=null;

	Statement st;

	try{

		Class.forName("com.mysql.jdbc.Driver");
	
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnnit","root","");

		st=con.createStatement();

		String sql="insert into getit(name,email,mob,id,pwd) values('"+name+"','"+email+"','"+mob+"','"+id+"','"+pw+"')";
                 String sql1="insert into repair(id) values('"+id+"')";
		
                 int res=st.executeUpdate(sql);

		if(res!=0)

		{

			response.sendRedirect("index.jsp");


		}

		else

		{

			out.println("Record Not Inserted");

		}
                int res1=st.executeUpdate(sql1);

		if(res1!=0)

		{

			response.sendRedirect("index.jsp");


		}

		else

		{

			out.println("Record Not Inserted");

		}

		
	}
        catch(Exception e)

	{
		
            out.println(e.toString());

	}

}


      out.write("\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!-- header section --> \n");
      out.write("<!-- intro section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Bootstrap core JavaScript -->\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Plugin JavaScript -->\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Contact form JavaScript -->\n");
      out.write("  <script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("  <script src=\"js/contact_me.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Custom scripts for this template -->\n");
      out.write("  <script src=\"js/agency.min.js\"></script>\n");
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
