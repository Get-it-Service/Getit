package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class repair_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"webthemez.com\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("  <title>GET!T - Repair Services</title>\n");
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
      out.write("<link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
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
      out.write("<a class=\"navbar-brand js-scroll-trigger\" href=\"index.jsp\">GET!T - Repaired</a>\n");
      out.write("      <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        Menu\n");
      out.write("        <i class=\"fas fa-bars\"></i>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("        <ul class=\"navbar-nav text-uppercase ml-auto\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link js-scroll-trigger\" href=\"#services\">Services</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link js-scroll-trigger\" href=\"#team\">Team</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link js-scroll-trigger\" href=\"#contact\">Contact</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              ");
String name=(String)session.getAttribute("username");
              String idd=(String)session.getAttribute("userid");
                    if(name != null)

                                            { 
                                        
                                              out.println("<a class='nav-link js-scroll-trigger' href='repair.jsp'>Log out</a>");
                                              name=null;
                                    
                                            }
                    else{
                        
                        
                           out.println("<a class='nav-link js-scroll-trigger' button class='btn btn-primary btn-lg' data-toggle='modal' data-target='#myModal1'>Log in</button></a>"); 
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <!-- Header -->\n");
      out.write("  <section class=\"banner\" role=\"banner\" style=\"background-image:url(images/repairing.jpg);\">\n");
      out.write("  \n");
      out.write("  <!-- banner text -->\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"col-md-10 col-md-offset-1\" style=\"margin-left: 50px;color:#fec503;font-family:'Kaushan Script' \">\n");
      out.write("      <div class=\"banner-text text-center\" >\n");
      out.write("          <h1 style=\"margin-left: 100px;color:#fec503;font-family:'Kaushan Script'\">Welcome To Get!T\n");
      out.write("        \n");
      out.write("              \n");
      out.write("        ");

                    if(session.getAttribute("username")!=null){

                                     name=(String)session.getAttribute("username");       
                                       
                                    out.println(" "+name);
                                            }
                                            
                    
      out.write(" \n");
      out.write("</h1>\n");
      out.write("        <h1>Best Repair Service in Prayagraj</h1>\n");
      out.write("        <br></br>\n");
      out.write("        <p style=\"color:white;font-size: 18px;\">Doorstep repair within 90 mins</br>\n");
      out.write("Protection Against Damage Upto INR 10,000<br>\n");
      out.write("30 day post-service guarantee<br/> </p></div>\n");
      out.write("      <!-- banner text --> \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("   <div class=\"modal fade\" id=\"myModal1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\"style=\"background-color: #fec503\";>\n");
      out.write("        <h5 class=\"modal-title\" id=\"myModalLabel\" text-center >Log in</h5>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">User ID</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" name=\"t1\" placeholder=\"user id\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Password</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"inputPassword3\" name=\"t2\" placeholder=\"Password\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("      <div class=\"checkbox\">\n");
      out.write("        <label>\n");
      out.write("          <input type=\"checkbox\"> Remember me\n");
      out.write("        </label>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        <br><h4>              Not registered yet?\n");
      out.write("            <u style=\"color:#fec503\"><a href=\"registration.jsp\" >Register now!</a></u></h4><br><p>It is easy and done in 1 minute and gives you access to special discounts and more!!!<p>\n");
      out.write("\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("       <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" name=\"b1\">Log in</button>\n");
      out.write("        ");

                        if(request.getParameter("b1")!=null)
                        {
                            String id=request.getParameter("t1");
                            String pw=request.getParameter("t2");
                            Connection con=null;
                            Statement st;
                            try{
		Class.forName("com.mysql.jdbc.Driver");	
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnnit","root","");
		st=con.createStatement();
		String sql="select * from getit where id='"+id+"' and pwd='"+pw+"'";
		ResultSet rs=st.executeQuery(sql);
		if(rs.next())
		{
                                                    session.setAttribute("username", rs.getString(1));
                                              session.setAttribute("usraddress", rs.getString(4));
                        
                        session.setAttribute("usrid", request.getParameter("t1"));

			response.sendRedirect("repair.jsp");

		}

		else

		{
                        out.println("invalid username or password");
                        response.sendRedirect("repair.jsp");
			

		}
		
	
             }
catch(Exception e)

	{

		out.println(e.toString());

	}



        }

      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("<!-- header section --> \n");
      out.write("<!-- intro section -->\n");
      out.write("\n");
      out.write("<section id=\"intro\" class=\"section intro\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("      <h3>Get Repair Service at Home</h3>\n");
      out.write("      <p>We are the city's leading onsite repairing service provider. We offer world class repairing services for all branded objects like AC,TV, Fridge across Prayagraj through our dedicated repairing service center in Prayagraj</p> \n");
      out.write("      <a href=\"#package\" class=\"btn btn-large\" style=\"align-items:center\">Packages</a> \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</section>\n");
      out.write("<!-- intro section --> \n");
      out.write("<!-- services section -->\n");
      out.write("<section id=\"services\" class=\"services service-section\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("  <div class=\"section-header\">\n");
      out.write("                <h2 class=\"wow fadeInDown animated\">Repairing Services</h2>\n");
      out.write("                <p class=\"wow fadeInDown animated\">GetIt is India's most trusted repairing portal</p>\n");
      out.write("            </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-4 col-sm-6 services text-center\"> <span class=\"icon icon-strategy\"></span>\n");
      out.write("        <div class=\"services-content\">\n");
      out.write("          <h5>AC Repairing</h5>\n");
      out.write("          <p>We provide you professionals to work and repaire your things at home easily and fastly</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6 services text-center\"> <span class=\"icon icon-briefcase\"></span>\n");
      out.write("        <div class=\"services-content\">\n");
      out.write("          <h5>TV Repairing</h5>\n");
      out.write("          <p>We provide you professionals to work and repaire your things at home easily and fastly.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6 services text-center\"> <span class=\"icon icon-tools\"></span>\n");
      out.write("        <div class=\"services-content\">\n");
      out.write("          <h5>Fridge Repairing</h5>\n");
      out.write("          <p>We provide you professionals to work and repaire your things at home easily and fastly.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6 services text-center\"> <span class=\"icon icon-genius\"></span>\n");
      out.write("        <div class=\"services-content\">\n");
      out.write("          <h5>Washing Machine Repair</h5>\n");
      out.write("          <p>We provide you professionals to work and repaire your things at home easily and fastly.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6 services text-center\"> <span class=\"icon icon-megaphone\"></span>\n");
      out.write("        <div class=\"services-content\">\n");
      out.write("          <h5>Laptop Repairing</h5>\n");
      out.write("          <p>We provide you professionals to work and repaire your things at home easily and fastly.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4 col-sm-6 services text-center\"> <span class=\"icon icon-trophy\"></span>\n");
      out.write("        <div class=\"services-content\">\n");
      out.write("          <h5>Desktop Repairing</h5>\n");
      out.write("          <p>We provide you professionals to work and repaire your things at home easily and fastly.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!-- services section --> \n");
      out.write("<!-- package section -->\n");
      out.write("<section id=\"package\" class=\"packageList\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("      <div class=\"section-header\">\n");
      out.write("                <h2 class=\"wow fadeInDown animated\">Package</h2>\n");
      out.write("                <p class=\"wow fadeInDown animated\"></p>\n");
      out.write("            </div>\n");
      out.write("    <div class=\"row\">  \n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("            \n");
      out.write("              <div class=\"package wow fadeInLeft animated\" data-wow-offset=\"250\" data-wow-delay=\"200ms\">\n");
      out.write("                  <h5>AC Repairing</h5>\n");
      out.write("                    <ul class=\"list-default\">\n");
      out.write("                      <li>Get the service in maximum 90 minute</li>\n");
      out.write("                      <li>if we don't have free worker we provide you message</li>\n");
      out.write("                      <li>get the service easily at home</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <strong class=\"price\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"cursor: pointer;\"><small>₹</small>500</strong>\n");
      out.write("                </div><!-- end package -->\n");
      out.write("                \n");
      out.write("                <div class=\"package wow fadeInLeft animated\" data-wow-offset=\"200\" data-wow-delay=\"300m\">\n");
      out.write("                  <h5>TV Repairing</h5>\n");
      out.write("                    <ul class=\"list-default\">\n");
      out.write("                      <li>Get the service in maximum 90 minute</li>\n");
      out.write("                      <li>if we don't have free worker we provide you message</li>\n");
      out.write("                      <li>get the service easily at home</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <strong class=\"price\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"cursor: pointer;\"><small>₹</small>400</strong>\n");
      out.write("                </div><!-- end package -->\n");
      out.write("                \n");
      out.write("                <div class=\"package no-border wow fadeInLeft animated\" data-wow-offset=\"150\" data-wow-delay=\"400m\" >\n");
      out.write("                  <h5>Washing Machine Repairing</h5>\n");
      out.write("                    <ul class=\"list-default\">\n");
      out.write("                      <li>Get the service in maximum 90 minute</li>\n");
      out.write("                      <li>if we don't have free worker we provide you message</li>\n");
      out.write("                      <li>get the service easily at home</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <strong class=\"price\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"cursor: pointer;\"><small>₹</small>300</strong>\n");
      out.write("                </div><!-- end package -->\n");
      out.write("                \n");
      out.write("            </div><!-- end col-md-6 -->\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("            \n");
      out.write("              <div class=\"package wow fadeInRight animated\" data-wow-offset=\"250\" data-wow-delay=\"500m\" >\n");
      out.write("                  <h5>Laptop Repairing</h5>\n");
      out.write("                    <ul class=\"list-default\">\n");
      out.write("                      <li>Get the service in maximum 90 minute</li>\n");
      out.write("                      <li>if we don't have free worker we provide you message</li>\n");
      out.write("                      <li>get the service easily at home</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <strong class=\"price\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"cursor: pointer;\"><small>₹</small>500</strong>\n");
      out.write("                </div><!-- end package -->\n");
      out.write("                \n");
      out.write("                <div class=\"package wow fadeInRight animated\" data-wow-offset=\"200\" data-wow-delay=\"600m\">\n");
      out.write("                  <h5>Desktop Repairing</h5>\n");
      out.write("                    <ul class=\"list-default\">\n");
      out.write("                      <li>Get the service in maximum 90 minute</li>\n");
      out.write("                      <li>if we don't have free worker we provide you message</li>\n");
      out.write("                      <li>get the service easily at home</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <strong class=\"price\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"cursor: pointer;\"><small>₹</small>400</strong>\n");
      out.write("                </div><!-- end package -->\n");
      out.write("                \n");
      out.write("                <div class=\"package no-border wow fadeInRight animated\" data-wow-offset=\"150\" data-wow-delay=\"700m\">\n");
      out.write("                  <h5>Fridge Repairing</h5>\n");
      out.write("                    <ul class=\"list-default\">\n");
      out.write("                      <li>Get the service in maximum 90 minute</li>\n");
      out.write("                      <li>if we don't have free worker we provide you message</li>\n");
      out.write("                      <li>get the service easily at home</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <strong class=\"price\" data-toggle=\"modal\" data-target=\"#myModal\" style=\"cursor: pointer;\"><small>₹</small>300</strong>\n");
      out.write("                </div><!-- end package -->\n");
      out.write("                \n");
      out.write("            </div><!-- end col-md-6 -->\n");
      out.write("        </div><!-- end row -->    \n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!-- package section --> \n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\"style=\"background-color: #fec503\";>\n");
      out.write("        <h5 class=\"modal-title\" id=\"myModalLabel\" style=\"text-align: center;\">Enter Your Location</h5>\n");
      out.write("        <button type=\"\" class=\"close\" aria-label=\"Close\" style=\"outline: none\">\n");
      out.write("  <span aria-hidden=\"true\" class=\"modal-title\" id=\"myModalLabel\" data-dismiss=\"modal\" style=\"color:yellow;border-style: none;\">&times;</span>\n");
      out.write("</button>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Address</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" name='a1' placeholder=\"Adress Line 1\">\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" name='a2' placeholder=\"Adress Line 2\">\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" name='a3' placeholder=\"Adress Line 3\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">City</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" name='c' placeholder=\"City\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("          \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">State</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputPassword3\" name='s' placeholder=\"State\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label for=\"inputPassword3\" class=\"col-sm-2 control-label\">Pincode</label>\n");
      out.write("    <div class=\"col-sm-10\">\n");
      out.write("      <input type=\"number\" class=\"form-control\" id=\"inputPassword3\" name='p' placeholder=\"Pincode\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("       <div class=\"modal-footer\">\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" name=\"s1\">Submit</button>\n");
      out.write("      \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       ");
 out.println(idd);
                        if(request.getParameter("s1")!=null)
                        {
                            String a1=request.getParameter("a1");
                            String a2=request.getParameter("a2");
                            String a3=request.getParameter("a3");
                            String address= a1+", "+a2+", "+a3 ;
                          
                            String state=request.getParameter("s");
                            String city=request.getParameter("c");
                            int pincode=Integer.parseInt(request.getParameter("p")); 
                             Connection con=null;
                            Statement st;
                            try{
                                Class.forName("com.mysql.jdbc.Driver");	
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnnit","root","");
                                st=con.createStatement();
                                String sql=" update repair set address = '"+address+"', state = '"+state+"' , city = '"+city+"' , pincode = "+pincode+" where id = '"+idd+"' ";
                                int res=st.executeUpdate(sql);
                                if(res!=0)
                                    out.println("Request Accepted");
                                else
                                    out.println("Invalid Details");
                            }
                            catch(Exception e){out.println(e.toString());}

                        }
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- gallery section -->\n");
      out.write("<section id=\"gallery\" class=\"gallery section\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"section-header\">\n");
      out.write("                <h2 class=\"wow fadeInDown animated\">Gallery</h2>\n");
      out.write("                <p class=\"wow fadeInDown animated\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent eget risus vitae massa <br> semper aliquam quis mattis quam.</p>\n");
      out.write("            </div>\n");
      out.write("    <div class=\"row no-gutter\">\n");
      out.write("      <div class=\"col-lg-3 col-md-6 col-sm-6 work\"> <a href=\"images/portfolio/01.jpg\" class=\"work-box\"> <img src=\"images/portfolio/01.jpg\" alt=\"\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("          <div class=\"overlay-caption\">\n");
      out.write("             <p><span class=\"icon icon-magnifying-glass\"></span></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- overlay --> \n");
      out.write("        </a> </div>\n");
      out.write("      <div class=\"col-lg-3 col-md-6 col-sm-6 work\"> <a href=\"images/portfolio/02.jpg\" class=\"work-box\"> <img src=\"images/portfolio/02.jpg\" alt=\"\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("          <div class=\"overlay-caption\">\n");
      out.write("            <p><span class=\"icon icon-magnifying-glass\"></span></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- overlay --> \n");
      out.write("        </a> </div>\n");
      out.write("      <div class=\"col-lg-3 col-md-6 col-sm-6 work\"> <a href=\"images/portfolio/03.jpg\" class=\"work-box\"> <img src=\"images/portfolio/03.jpg\" alt=\"\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("          <div class=\"overlay-caption\">\n");
      out.write("            <p><span class=\"icon icon-magnifying-glass\"></span></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- overlay --> \n");
      out.write("        </a> </div>\n");
      out.write("      <div class=\"col-lg-3 col-md-6 col-sm-6 work\"> <a href=\"images/portfolio/04.jpg\" class=\"work-box\"> <img src=\"images/portfolio/04.jpg\" alt=\"\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("          <div class=\"overlay-caption\"> \n");
      out.write("            <p><span class=\"icon icon-magnifying-glass\"></span></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- overlay --> \n");
      out.write("        </a> </div>\n");
      out.write("      <div class=\"col-lg-3 col-md-6 col-sm-6 work\"> <a href=\"images/portfolio/05.jpg\" class=\"work-box\"> <img src=\"images/portfolio/05.jpg\" alt=\"\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("          <div class=\"overlay-caption\">\n");
      out.write("            <p><span class=\"icon icon-magnifying-glass\"></span></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- overlay --> \n");
      out.write("        </a> </div>\n");
      out.write("      <div class=\"col-lg-3 col-md-6 col-sm-6 work\"> <a href=\"images/portfolio/06.jpg\" class=\"work-box\"> <img src=\"images/portfolio/06.jpg\" alt=\"\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("          <div class=\"overlay-caption\">\n");
      out.write("            <p><span class=\"icon icon-magnifying-glass\"></span></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- overlay --> \n");
      out.write("        </a> </div>\n");
      out.write("      <div class=\"col-lg-3 col-md-6 col-sm-6 work\"> <a href=\"images/portfolio/07.jpg\" class=\"work-box\"> <img src=\"images/portfolio/07.jpg\" alt=\"\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("          <div class=\"overlay-caption\">\n");
      out.write("            <p><span class=\"icon icon-magnifying-glass\"></span></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- overlay --> \n");
      out.write("        </a> </div>\n");
      out.write("      <div class=\"col-lg-3 col-md-6 col-sm-6 work\"> <a href=\"images/portfolio/08.jpg\" class=\"work-box\"> <img src=\"images/portfolio/08.jpg\" alt=\"\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("          <div class=\"overlay-caption\">\n");
      out.write("             <p><span class=\"icon icon-magnifying-glass\"></span></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- overlay --> \n");
      out.write("        </a> </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!-- gallery section --> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Contact -->\n");
      out.write("  <section class=\"page-section\" id=\"contact\">\n");
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
      out.write("\n");
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
