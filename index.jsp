<%-- 
    Document   : index
    Created on : 25 Jun, 2019, 9:49:13 AM
    Author     : Mayank
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>GET!T - Get your basic needs at your fingertip</title>
 

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom fonts for this template -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
  <link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>

  <!-- Custom styles for this template -->
  <link href="css/agency.min2.css" rel="stylesheet">
 <script language="javascript" type="text/javascript"> 

</script>

<script>
$(document).ready(function()
{
  $("#mainNav").hover(function()
  {

$("#services").show();
});
});
</script>
<script type="text/javascipt">
    function openPage()
    { 
       f=1;
    }
    </script>

        
    </head>
    <body id="page-top">

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll-trigger" href="#page-top">GET!T</a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        Menu
        <i class="fas fa-bars"></i>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav text-uppercase ml-auto">
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#services">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#team">Team</a>
          </li>
          <li class="nav-item">
            <a class="nav-link js-scroll-trigger" href="#contact">Contact</a>
          </li>
          <li class="nav-item">
             <%String name=(String)session.getAttribute("username");
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
                %>

          </li>
        </ul>
      </div>
    </div>
  </nav>



 <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header"style="background-color: #fec503";>
        <h5 class="modal-title" id="myModalLabel" text-center >Log in</h5>
      </div>
      <div class="modal-body">
        
       
        <form class="form-horizontal" role="form">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">User ID</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="t1" placeholder="user id">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword3" name="t2" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox"> Remember me
        </label>
      </div>
    </div>
  </div>
        <br><h4>              Not registered yet?
            <u style="color:#fec503"><a href="registration.jsp" >Register now!</a></u></h4><br><p>It is easy and done in 1 minute and gives you access to special discounts and more!!!<p>

  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
       <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary" name="b1">Log in</button>
        <%
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
                        }%>

      </div>
    </div>
  </div>
</form>




      </div>
      
    </div>
  </div>
</div>




  <!-- Header -->
  <header class="masthead" style="background-image: url(images/banner1.jpg);">
    <div class="container">
      <div class="intro-text">
        <div class="intro-lead-in"><h1 style="margin-left: 100px;color:#fec503;font-family:'Kaushan Script'">Welcome To GET!T!
        <%String name1=" ";
                    if((name==null)&&(session.getAttribute("username")!= null))

                    { name1=(String)session.getAttribute("username");       
                                       
                                    out.println(" "+name1);
                                            }
                                            
                    %> </h1> 
        </div>
        <div class="intro-heading text-uppercase">A helping hand, by your side, onsight!</div>
        <a class="btn btn-primary btn-xl text-uppercase js-scroll-trigger" href="#services">How can we Help?</a>
      </div>
    </div>
  </header>

  
  <!-- services -->
  <section class="page-section" id="services" >
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h2 class="section-heading text-uppercase">Services</h2>
          <h3 class="section-subheading text-muted">That we may help you deal with ;)</h3>
        </div>
      </div>
        
        
        
        
        
        
        
        
        
        <form method="get" action="">
             <input type="submit" value="" class="navbar-toggler navbar-toggler-right" name="bn1" /><%
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
                            catch(Exception e){out.println(e.toString());}}%>
        </form>
        
       
        
     
        
        
       <div class="row">
        <div class="col-lg-12">
          <ul class="timeline">
            <li>
              <div class="timeline-image">
                  
                              <img class="rounded-circle img-fluid" src="img/about/1.jpg" alt="">
                  
                  </button>
                
              
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                    
                    <%if(name1 != " "){out.println("<form method='get' action=''><input type='submit' value='Repair Services' class='navbar-toggler navbar-toggler-right' name='bn1' style='background:transparent; font-size:35px; font-weight: bold'/>");
                        if(request.getParameter("bn1")!=null){
                           try{
                               response.sendRedirect("repair.jsp");}
                           catch(Exception e){out.println(e.toString());}}
                            out.println("</form>");}
                        else{out.println("<a href='repair.jsp'><h4 style='color:black'>Repair services</h4></a>");}%>
                    
                    
                   
                  
                  <h4 class="subheading">briefing</h4>
                </div>
                <div class="timeline-body">
                  <p class="text-muted">details</p>
                </div>
              </div>
            </li>
            
            
             <form method="get" action="">
             <input type="submit" value="" class="navbar-toggler navbar-toggler-right" name="bn2" /><%
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
                            catch(Exception e){out.println(e.toString());}}%>
             </form>
            
            
            <li class="timeline-inverted">
              <div class="timeline-image">
                  <img class="rounded-circle img-fluid" src="img/about/2.jpg" alt="">
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                                   

                    
                    <%if(name1!=" "){out.println("<form method='get' action=''><input type='submit' value='Health Services' class='navbar-toggler navbar-toggler-right' name='bn2' style='background:transparent; font-size:35px; font-weight: bold'/>");
                        if(request.getParameter("bn2")!=null){
                             try{response.sendRedirect("health.jsp");}
                             catch(Exception e){out.println(e.toString());}}
                             out.println("</form>");}
                        else{out.println("<a href='health.jsp'><h4 style='color:black'>Health services</h4></a>");}%>
                    
                    
                    
                    
                  <h4 class="subheading">brief</h4>
                </div>
                <div class="timeline-body">
                  <p class="text-muted">details</p>
                </div>
              </div>
            </li>
            
            
             <form method="get" action="">
             <input type="submit" value="" class="navbar-toggler navbar-toggler-right" name="bn3" /><%
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
                            catch(Exception e){out.println(e.toString());}}%>
             </form>
            
            
            
            <li>
              <div class="timeline-image">
                  <img class="rounded-circle img-fluid" src="img/about/3.jpg" alt="">
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                                   
                    <%if(name1 != " "){out.println("<form method='get' action=''><input type='submit' value='Tutor Services' class='navbar-toggler navbar-toggler-right' name='bn3' style='background:transparent; font-size:35px; font-weight: bold'>");
                        if(request.getParameter("bn3")!=null){
                          try{response.sendRedirect("tutor.jsp");}
                          catch(Exception e){out.println(e.toString());}}
                          out.println("</form>");}
                        else{out.println("<a href='tutor.jsp'><h4 style='color:black'>Tutor services</h4></a>");}%>
                  <h4 class="subheading">brief</h4>
                </div>
                <div class="timeline-body">
                  <p class="text-muted">details</p>
                </div>
              </div>
            </li>
             <form method="get" action="">
             <input type="submit" value="" class="navbar-toggler navbar-toggler-right" name="bn4" /><%
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
%> </form>
            <li class="timeline-inverted">
              <div class="timeline-image">
                  <a href="repair.jsp"><img class="rounded-circle img-fluid" src="img/about/4.jpg" alt=""></a>
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                                   
                    <%if(name1!=" "){out.println("<form method='get' action=''><input type='submit' value='Salon Services' class='navbar-toggler navbar-toggler-right' name='bn4' style='background:transparent; font-size:35px; font-weight: bold'>");
                        if(request.getParameter("bn4")!=null)
                        {try{response.sendRedirect("repair.jsp");}
                         catch(Exception e){out.println(e.toString());}}
                         out.println("</form>");}
                         else{out.println("<a href='repair.jsp'><h4 style='color:black'>Salon services</h4></a>");}%>
                  <h4 class="subheading">brief</h4>
                </div>
                <div class="timeline-body">
                  <p class="text-muted">details</p>
                </div>
              </div>
            </li>
            <li class="timeline-inverted">
              <div class="timeline-image">
                <h4>And adding
                  <br>more for
                  <br>You!</h4>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </section>

  <!-- Team -->
  <section class="bg-light page-section" id="team">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h2 class="section-heading text-uppercase">Our Amazing Team</h2>
          <h3 class="section-subheading text-muted">Which made it to this much!</h3>
        </div>
      </div>
      <div class="row">
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src="img/team/1.jpg" alt="">
            <h4>Tapan Chitransh</h4>
            <p class="text-muted">Lead Designer</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-twitter"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-facebook-f"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-linkedin-in"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src="img/team/2.jpg" alt="">
            <h4>Mudita pandey</h4>
            <p class="text-muted">Lead Marketer</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-twitter"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-facebook-f"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-linkedin-in"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src="img/team/3.jpg" alt="">
            <h4>Shatakshi Tripathi</h4>
            <p class="text-muted">Lead Developer</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-twitter"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-facebook-f"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-linkedin-in"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
	
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src="img/team/1.jpg" alt="">
            <h4>Sankalp mishra</h4>
            <p class="text-muted">Lead Designer</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-twitter"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-facebook-f"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-linkedin-in"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
        <div class="col-sm-4">
          <div class="team-member">
            <img class="mx-auto rounded-circle" src="img/team/1.jpg" alt="">
            <h4>Mayankesh mishra</h4>
            <p class="text-muted">Lead Designer</p>
            <ul class="list-inline social-buttons">
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-twitter"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-facebook-f"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fab fa-linkedin-in"></i>
                </a>
              </li>
            </ul>
          </div>
        </div>
        



      </div>
      <div class="row">
        <div class="col-lg-8 mx-auto text-center">
          <p class="large text-muted">"Many ideas grow better when transplanted into another mind than the one where they sprang up."</p>
        </div>
      </div>
    </div>
  </section>

  <!-- Clients -->
  <section class="py-5">
    <div class="container">
      <div class="row">
        <div class="col-md-3 col-sm-6">
          <a href="#">
            <img class="img-fluid d-block mx-auto" src="img/logos/envato.jpg" alt="">
          </a>
        </div>
        <div class="col-md-3 col-sm-6">
          <a href="#">
            <img class="img-fluid d-block mx-auto" src="img/logos/designmodo.jpg" alt="">
          </a>
        </div>
        <div class="col-md-3 col-sm-6">
          <a href="#">
            <img class="img-fluid d-block mx-auto" src="img/logos/themeforest.jpg" alt="">
          </a>
        </div>
        <div class="col-md-3 col-sm-6">
          <a href="#">
            <img class="img-fluid d-block mx-auto" src="img/logos/creative-market.jpg" alt="">
          </a>
        </div>
      </div>
    </div>
  </section>

  <!-- Contact -->
  


  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Contact form JavaScript -->
  <script src="js/jqBootstrapValidation.js"></script>
  <script src="js/contact_me.js"></script>

  <!-- Custom scripts for this template -->
  <script src="js/agency.min.js"></script>
        
    </body>
</html>
