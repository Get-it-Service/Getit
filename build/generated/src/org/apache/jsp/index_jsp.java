package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("  <title>GET!T - Get your basic needs at your fingertip</title>\n");
      out.write(" \n");
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
      out.write(" <script language=\"javascript\" type=\"text/javascript\"> \n");
      out.write("\n");
      out.write("</script>\n");
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
      out.write("<script type=\"text/javascipt\">\n");
      out.write("    function openPage()\n");
      out.write("    { \n");
      out.write("       f=1;\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("        \n");
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
      out.write("             ");
String name=(String)session.getAttribute("username");
              String idd=(String)session.getAttribute("userid");
             
              
                    if(session.getAttribute("name") != null)

                                            { 
                                        
                                              out.println("<a class='nav-link js-scroll-trigger' href='index.jsp'>Log out</a>");
                                              session.setAttribute("name", null);
                                              name=null;
                                            }
                    else{
                        
                        
                           out.println("<a class='nav-link js-scroll-trigger' button class='btn btn-primary btn-lg' data-toggle='modal' data-target='#myModal'>Log in</button></a>"); 
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
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
                                if(rs.next()){
                                    session.setAttribute("usrid", request.getParameter("t1"));
                                    
                                    session.setAttribute("username", rs.getString(1));
                                    session.setAttribute("name", rs.getString(1));
                                    session.setAttribute("usraddress", rs.getString(4));
                                    session.setAttribute("usrid", request.getParameter("t1"));
                                    response.sendRedirect("index.jsp");
                                }
                                else{
                                    out.println("invalid username or password");
                                    response.sendRedirect("index.jsp");
                                }
                            }
                            catch(Exception e){out.println(e.toString());}
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Header -->\n");
      out.write("  <header class=\"masthead\" style=\"background-image: url(images/banner1.jpg);\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"intro-text\">\n");
      out.write("        <div class=\"intro-lead-in\"><h1 style=\"margin-left: 100px;color:#fec503;font-family:'Kaushan Script'\">Welcome To GET!T!\n");
      out.write("        ");
String name1=" ";
                    if((name==null)&&(session.getAttribute("username")!= null))

                    { name1=(String)session.getAttribute("username");       
                                       
                                    out.println(" "+name1);
                                            }
                                            
                    
      out.write(" </h1> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"intro-heading text-uppercase\">A helping hand, by your side, onsight!</div>\n");
      out.write("        <a class=\"btn btn-primary btn-xl text-uppercase js-scroll-trigger\" href=\"#services\">How can we Help?</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <!-- services -->\n");
      out.write("  <section class=\"page-section\" id=\"services\" >\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12 text-center\">\n");
      out.write("          <h2 class=\"section-heading text-uppercase\">Services</h2>\n");
      out.write("          <h3 class=\"section-subheading text-muted\">That we may help you deal with ;)</h3>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form method=\"get\" action=\"\">\n");
      out.write("             <input type=\"submit\" value=\"\" class=\"navbar-toggler navbar-toggler-right\" name=\"bn1\" />");

                        if(request.getParameter("bn1")!=null){
                            Connection con=null;
                            Statement st;
                            try{
                                Class.forName("com.mysql.jdbc.Driver");	
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnnit","root","");
                                st=con.createStatement();
                                String sql="select * from getit" ;
                                ResultSet rs=st.executeQuery(sql);
                                if(rs.next()){

                                    session.setAttribute("name", rs.getString(1));
                                   
                                    response.sendRedirect("repair.jsp");
                                    }
                                else{out.println("Invalid User Name or Passwd");}}
                            catch(Exception e){out.println(e.toString());}}
      out.write("\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("          <ul class=\"timeline\">\n");
      out.write("            <li>\n");
      out.write("              <div class=\"timeline-image\">\n");
      out.write("                  \n");
      out.write("                              <img class=\"rounded-circle img-fluid\" src=\"img/about/1.jpg\" alt=\"\">\n");
      out.write("                  \n");
      out.write("                  </button>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("              </div>\n");
      out.write("              <div class=\"timeline-panel\">\n");
      out.write("                <div class=\"timeline-heading\">\n");
      out.write("                    \n");
      out.write("                    ");
if(name1 != " "){out.println("<form method='get' action=''><input type='submit' value='Repair Services' class='navbar-toggler navbar-toggler-right' name='bn1' style='background:transparent; font-size:35px; font-weight: bold'/>");
                        if(request.getParameter("bn1")!=null){
                           try{
                               response.sendRedirect("repair.jsp");}
                           catch(Exception e){out.println(e.toString());}}
                            out.println("</form>");}
                        else{out.println("<a href='repair.jsp'><h4 style='color:black'>Repair services</h4></a>");}
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("                  <h4 class=\"subheading\">briefing</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"timeline-body\">\n");
      out.write("                  <p class=\"text-muted\">details</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <form method=\"get\" action=\"\">\n");
      out.write("             <input type=\"submit\" value=\"\" class=\"navbar-toggler navbar-toggler-right\" name=\"bn2\" />");

                        if(request.getParameter("bn2")!=null){
                            Connection con=null;
                            Statement st;
                            try{
                                Class.forName("com.mysql.jdbc.Driver");	
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnnit","root","");
                                st=con.createStatement();
                                String sql="select * from getit" ;
                                ResultSet rs=st.executeQuery(sql);
                                if(rs.next()){
                                    session.setAttribute("username", rs.getString(1));
                                    session.setAttribute("name", rs.getString(1));
                                    response.sendRedirect("health.jsp");
                                    }
                                else{out.println("Invalid User Name or Passwd");}}
                            catch(Exception e){out.println(e.toString());}}
      out.write("\n");
      out.write("             </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <li class=\"timeline-inverted\">\n");
      out.write("              <div class=\"timeline-image\">\n");
      out.write("                  <img class=\"rounded-circle img-fluid\" src=\"img/about/2.jpg\" alt=\"\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"timeline-panel\">\n");
      out.write("                <div class=\"timeline-heading\">\n");
      out.write("                                   \n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    ");
if(name1!=" "){out.println("<form method='get' action=''><input type='submit' value='Health Services' class='navbar-toggler navbar-toggler-right' name='bn2' style='background:transparent; font-size:35px; font-weight: bold'/>");
                        if(request.getParameter("bn2")!=null){
                             try{response.sendRedirect("health.jsp");}
                             catch(Exception e){out.println(e.toString());}}
                             out.println("</form>");}
                        else{out.println("<a href='health.jsp'><h4 style='color:black'>Health services</h4></a>");}
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                  <h4 class=\"subheading\">brief</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"timeline-body\">\n");
      out.write("                  <p class=\"text-muted\">details</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <form method=\"get\" action=\"\">\n");
      out.write("             <input type=\"submit\" value=\"\" class=\"navbar-toggler navbar-toggler-right\" name=\"bn3\" />");

                        if(request.getParameter("bn3")!=null){
                            Connection con=null;
                            Statement st;
                            try{
                                Class.forName("com.mysql.jdbc.Driver");	
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnnit","root","");
                                st=con.createStatement();
                                String sql="select * from getit" ;
                                ResultSet rs=st.executeQuery(sql);
                                if(rs.next()){
                                    session.setAttribute("username", rs.getString(1));
                                    session.setAttribute("name", rs.getString(1));
                                    response.sendRedirect("tutor.jsp");
                                    }
                                else{out.println("Invalid User Name or Passwd");}}
                            catch(Exception e){out.println(e.toString());}}
      out.write("\n");
      out.write("             </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <li>\n");
      out.write("              <div class=\"timeline-image\">\n");
      out.write("                  <img class=\"rounded-circle img-fluid\" src=\"img/about/3.jpg\" alt=\"\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"timeline-panel\">\n");
      out.write("                <div class=\"timeline-heading\">\n");
      out.write("                                   \n");
      out.write("                    ");
if(name1 != " "){out.println("<form method='get' action=''><input type='submit' value='Tutor Services' class='navbar-toggler navbar-toggler-right' name='bn3' style='background:transparent; font-size:35px; font-weight: bold'>");
                        if(request.getParameter("bn3")!=null){
                          try{response.sendRedirect("tutor.jsp");}
                          catch(Exception e){out.println(e.toString());}}
                          out.println("</form>");}
                        else{out.println("<a href='tutor.jsp'><h4 style='color:black'>Tutor services</h4></a>");}
      out.write("\n");
      out.write("                  <h4 class=\"subheading\">brief</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"timeline-body\">\n");
      out.write("                  <p class=\"text-muted\">details</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("             <form method=\"get\" action=\"\">\n");
      out.write("             <input type=\"submit\" value=\"\" class=\"navbar-toggler navbar-toggler-right\" name=\"bn4\" />");

                        if(request.getParameter("bn4")!=null){
                            Connection con=null;
                            Statement st;
                            try{
                                Class.forName("com.mysql.jdbc.Driver");	
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mnnit","root","");
                                st=con.createStatement();
                                String sql="select * from getit" ;
                                ResultSet rs=st.executeQuery(sql);
                                if(rs.next()){
                                    session.setAttribute("username", rs.getString(1));
                                    session.setAttribute("name", rs.getString(1));
                                    response.sendRedirect("repair.jsp");
                                    }
                                else{out.println("Invalid User Name or Passwd");}}
                                catch(Exception e){out.println(e.toString());}}

      out.write(" </form>\n");
      out.write("            <li class=\"timeline-inverted\">\n");
      out.write("              <div class=\"timeline-image\">\n");
      out.write("                  <a href=\"repair.jsp\"><img class=\"rounded-circle img-fluid\" src=\"img/about/4.jpg\" alt=\"\"></a>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"timeline-panel\">\n");
      out.write("                <div class=\"timeline-heading\">\n");
      out.write("                                   \n");
      out.write("                    ");
if(name1!=" "){out.println("<form method='get' action=''><input type='submit' value='Salon Services' class='navbar-toggler navbar-toggler-right' name='bn4' style='background:transparent; font-size:35px; font-weight: bold'>");
                        if(request.getParameter("bn4")!=null)
                        {try{response.sendRedirect("repair.jsp");}
                         catch(Exception e){out.println(e.toString());}}
                         out.println("</form>");}
                         else{out.println("<a href='repair.jsp'><h4 style='color:black'>Salon services</h4></a>");}
      out.write("\n");
      out.write("                  <h4 class=\"subheading\">brief</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"timeline-body\">\n");
      out.write("                  <p class=\"text-muted\">details</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"timeline-inverted\">\n");
      out.write("              <div class=\"timeline-image\">\n");
      out.write("                <h4>And adding\n");
      out.write("                  <br>more for\n");
      out.write("                  <br>You!</h4>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- Team -->\n");
      out.write("  <section class=\"bg-light page-section\" id=\"team\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12 text-center\">\n");
      out.write("          <h2 class=\"section-heading text-uppercase\">Our Amazing Team</h2>\n");
      out.write("          <h3 class=\"section-subheading text-muted\">Which made it to this much!</h3>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"team-member\">\n");
      out.write("            <img class=\"mx-auto rounded-circle\" src=\"img/team/1.jpg\" alt=\"\">\n");
      out.write("            <h4>Tapan Chitransh</h4>\n");
      out.write("            <p class=\"text-muted\">Lead Designer</p>\n");
      out.write("            <ul class=\"list-inline social-buttons\">\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-twitter\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"team-member\">\n");
      out.write("            <img class=\"mx-auto rounded-circle\" src=\"img/team/2.jpg\" alt=\"\">\n");
      out.write("            <h4>Mudita pandey</h4>\n");
      out.write("            <p class=\"text-muted\">Lead Marketer</p>\n");
      out.write("            <ul class=\"list-inline social-buttons\">\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-twitter\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"team-member\">\n");
      out.write("            <img class=\"mx-auto rounded-circle\" src=\"img/team/3.jpg\" alt=\"\">\n");
      out.write("            <h4>Shatakshi Tripathi</h4>\n");
      out.write("            <p class=\"text-muted\">Lead Developer</p>\n");
      out.write("            <ul class=\"list-inline social-buttons\">\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-twitter\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\t\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"team-member\">\n");
      out.write("            <img class=\"mx-auto rounded-circle\" src=\"img/team/1.jpg\" alt=\"\">\n");
      out.write("            <h4>Sankalp mishra</h4>\n");
      out.write("            <p class=\"text-muted\">Lead Designer</p>\n");
      out.write("            <ul class=\"list-inline social-buttons\">\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-twitter\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"team-member\">\n");
      out.write("            <img class=\"mx-auto rounded-circle\" src=\"img/team/1.jpg\" alt=\"\">\n");
      out.write("            <h4>Mayankesh mishra</h4>\n");
      out.write("            <p class=\"text-muted\">Lead Designer</p>\n");
      out.write("            <ul class=\"list-inline social-buttons\">\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-twitter\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                  <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-8 mx-auto text-center\">\n");
      out.write("          <p class=\"large text-muted\">\"Many ideas grow better when transplanted into another mind than the one where they sprang up.\"</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- Clients -->\n");
      out.write("  <section class=\"py-5\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <img class=\"img-fluid d-block mx-auto\" src=\"img/logos/envato.jpg\" alt=\"\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <img class=\"img-fluid d-block mx-auto\" src=\"img/logos/designmodo.jpg\" alt=\"\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <img class=\"img-fluid d-block mx-auto\" src=\"img/logos/themeforest.jpg\" alt=\"\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3 col-sm-6\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <img class=\"img-fluid d-block mx-auto\" src=\"img/logos/creative-market.jpg\" alt=\"\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- Contact -->\n");
      out.write("  \n");
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
      out.write("        \n");
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
