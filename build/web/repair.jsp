<%-- 
    Document   : repair
    Created on : 26 Jun, 2019, 1:59:27 PM
    Author     : Mayank
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <meta charset="utf-8">
<meta name="description" content="">
<meta name="author" content="webthemez.com">
<meta name="viewport" content="width=device-width, initial-scale=1">

  <title>GET!T - Repair Services</title>

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
<link rel="stylesheet" href="css/animate.min.css">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="css/font-icon.css">
  

<script>
$(document).ready(function()
{
  $("#mainNav").hover(function()
  {

$("#services").show();
});
});
</script>
    </head>
    <body id="page-top">

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
    <div class="container">
<a class="navbar-brand js-scroll-trigger" href="index.jsp">GET!T - Repaired</a>
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
                    if(name != null)

                                            { 
                                        
                                              out.println("<a class='nav-link js-scroll-trigger' href='repair.jsp'>Log out</a>");
                                              name=null;
                                    
                                            }
                    else{
                        
                        
                           out.println("<a class='nav-link js-scroll-trigger' button class='btn btn-primary btn-lg' data-toggle='modal' data-target='#myModal1'>Log in</button></a>"); 
                    }
                %>


          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Header -->
  <section class="banner" role="banner" style="background-image:url(images/repairing.jpg);">
  
  <!-- banner text -->
  <div class="container">
    <div class="col-md-10 col-md-offset-1" style="margin-left: 50px;color:#fec503;font-family:'Kaushan Script' ">
      <div class="banner-text text-center" >
          <h1 style="margin-left: 100px;color:#fec503;font-family:'Kaushan Script'">Welcome To Get!T
        
              
        <%
                    if(session.getAttribute("username")!=null){

                                     name=(String)session.getAttribute("username");       
                                       
                                    out.println(" "+name);
                                            }
                                            
                    %> 
</h1>
        <h1>Best Repair Service in Prayagraj</h1>
        <br></br>
        <p style="color:white;font-size: 18px;">Doorstep repair within 90 mins</br>
Protection Against Damage Upto INR 10,000<br>
30 day post-service guarantee<br/> </p></div>
      <!-- banner text --> 
    </div>
  </div>
</section>
   <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
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
%>

      </div>
    </div>
  </div>
</form>




      </div>
      
    </div>
  </div>
</div>
  
<!-- header section --> 
<!-- intro section -->

<section id="intro" class="section intro">
  <div class="container">
        
        
    
      <h3>Get Repair Service at Home</h3>
      <p>We are the city's leading onsite repairing service provider. We offer world class repairing services for all branded objects like AC,TV, Fridge across Prayagraj through our dedicated repairing service center in Prayagraj</p> 
      <a href="#package" class="btn btn-large" style="align-items:center">Packages</a> 
    </div>
  
</section>
<!-- intro section --> 
<!-- services section -->
<section id="services" class="services service-section">
  <div class="container">
  <div class="section-header">
                <h2 class="wow fadeInDown animated">Repairing Services</h2>
                <p class="wow fadeInDown animated">GetIt is India's most trusted repairing portal</p>
            </div>
    <div class="row">
      <div class="col-md-4 col-sm-6 services text-center"> <span class="icon icon-strategy"></span>
        <div class="services-content">
          <h5>AC Repairing</h5>
          <p>We provide you professionals to work and repaire your things at home easily and fastly</p>
        </div>
      </div>
      <div class="col-md-4 col-sm-6 services text-center"> <span class="icon icon-briefcase"></span>
        <div class="services-content">
          <h5>TV Repairing</h5>
          <p>We provide you professionals to work and repaire your things at home easily and fastly.</p>
        </div>
      </div>
      <div class="col-md-4 col-sm-6 services text-center"> <span class="icon icon-tools"></span>
        <div class="services-content">
          <h5>Fridge Repairing</h5>
          <p>We provide you professionals to work and repaire your things at home easily and fastly.</p>
        </div>
      </div>
      <div class="col-md-4 col-sm-6 services text-center"> <span class="icon icon-genius"></span>
        <div class="services-content">
          <h5>Washing Machine Repair</h5>
          <p>We provide you professionals to work and repaire your things at home easily and fastly.</p>
        </div>
      </div>
      <div class="col-md-4 col-sm-6 services text-center"> <span class="icon icon-megaphone"></span>
        <div class="services-content">
          <h5>Laptop Repairing</h5>
          <p>We provide you professionals to work and repaire your things at home easily and fastly.</p>
        </div>
      </div>
      <div class="col-md-4 col-sm-6 services text-center"> <span class="icon icon-trophy"></span>
        <div class="services-content">
          <h5>Desktop Repairing</h5>
          <p>We provide you professionals to work and repaire your things at home easily and fastly.</p>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- services section --> 
<!-- package section -->
<section id="package" class="packageList">
  <div class="container">
      <div class="section-header">
                <h2 class="wow fadeInDown animated">Package</h2>
                <p class="wow fadeInDown animated"></p>
            </div>
    <div class="row">  
            <div class="col-md-6">
            
              <div class="package wow fadeInLeft animated" data-wow-offset="250" data-wow-delay="200ms">
                  <h5>AC Repairing</h5>
                    <ul class="list-default">
                      <li>Get the service in maximum 90 minute</li>
                      <li>if we don't have free worker we provide you message</li>
                      <li>get the service easily at home</li>
                    </ul>
                    <strong class="price" data-toggle="modal" data-target="#myModal" style="cursor: pointer;"><small>₹</small>500</strong>
                </div><!-- end package -->
                
                <div class="package wow fadeInLeft animated" data-wow-offset="200" data-wow-delay="300m">
                  <h5>TV Repairing</h5>
                    <ul class="list-default">
                      <li>Get the service in maximum 90 minute</li>
                      <li>if we don't have free worker we provide you message</li>
                      <li>get the service easily at home</li>
                    </ul>
                    <strong class="price" data-toggle="modal" data-target="#myModal" style="cursor: pointer;"><small>₹</small>400</strong>
                </div><!-- end package -->
                
                <div class="package no-border wow fadeInLeft animated" data-wow-offset="150" data-wow-delay="400m" >
                  <h5>Washing Machine Repairing</h5>
                    <ul class="list-default">
                      <li>Get the service in maximum 90 minute</li>
                      <li>if we don't have free worker we provide you message</li>
                      <li>get the service easily at home</li>
                    </ul>
                    <strong class="price" data-toggle="modal" data-target="#myModal" style="cursor: pointer;"><small>₹</small>300</strong>
                </div><!-- end package -->
                
            </div><!-- end col-md-6 -->
            <div class="col-md-6">
            
              <div class="package wow fadeInRight animated" data-wow-offset="250" data-wow-delay="500m" >
                  <h5>Laptop Repairing</h5>
                    <ul class="list-default">
                      <li>Get the service in maximum 90 minute</li>
                      <li>if we don't have free worker we provide you message</li>
                      <li>get the service easily at home</li>
                    </ul>
                    <strong class="price" data-toggle="modal" data-target="#myModal" style="cursor: pointer;"><small>₹</small>500</strong>
                </div><!-- end package -->
                
                <div class="package wow fadeInRight animated" data-wow-offset="200" data-wow-delay="600m">
                  <h5>Desktop Repairing</h5>
                    <ul class="list-default">
                      <li>Get the service in maximum 90 minute</li>
                      <li>if we don't have free worker we provide you message</li>
                      <li>get the service easily at home</li>
                    </ul>
                    <strong class="price" data-toggle="modal" data-target="#myModal" style="cursor: pointer;"><small>₹</small>400</strong>
                </div><!-- end package -->
                
                <div class="package no-border wow fadeInRight animated" data-wow-offset="150" data-wow-delay="700m">
                  <h5>Fridge Repairing</h5>
                    <ul class="list-default">
                      <li>Get the service in maximum 90 minute</li>
                      <li>if we don't have free worker we provide you message</li>
                      <li>get the service easily at home</li>
                    </ul>
                    <strong class="price" data-toggle="modal" data-target="#myModal" style="cursor: pointer;"><small>₹</small>300</strong>
                </div><!-- end package -->
                
            </div><!-- end col-md-6 -->
        </div><!-- end row -->    
  </div>
</section>
<!-- package section --> 
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header"style="background-color: #fec503";>
        <h5 class="modal-title" id="myModalLabel" style="text-align: center;">Enter Your Location</h5>
        <button type="" class="close" aria-label="Close" style="outline: none">
  <span aria-hidden="true" class="modal-title" id="myModalLabel" data-dismiss="modal" style="color:yellow;border-style: none;">&times;</span>
</button>
      </div>

      <div class="modal-body">
        
       
        <form class="form-horizontal" role="form">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Address</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name='a1' placeholder="Adress Line 1">
    </div>
    <br>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name='a2' placeholder="Adress Line 2">
    </div>
    <br>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name='a3' placeholder="Adress Line 3">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">City</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputPassword3" name='c' placeholder="City">
    </div>
  </div>
          
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">State</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputPassword3" name='s' placeholder="State">
    </div>
  </div>
    <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Pincode</label>
    <div class="col-sm-10">
      <input type="number" class="form-control" id="inputPassword3" name='p' placeholder="Pincode">
    </div>
  </div>



  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
       <div class="modal-footer">
        <button type="submit" class="btn btn-primary" name="s1">Submit</button>
      
       
       
       
       <% out.println(idd);
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

                        }%>
                        

       
       
       
       
       
       
       
       </div>
    </div>
  </div>
</form>




      </div>
      
    </div>
  </div>
</div>


<!-- gallery section -->
<section id="gallery" class="gallery section">
  <div class="container">
    <div class="section-header">
                <h2 class="wow fadeInDown animated">Gallery</h2>
                <p class="wow fadeInDown animated">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent eget risus vitae massa <br> semper aliquam quis mattis quam.</p>
            </div>
    <div class="row no-gutter">
      <div class="col-lg-3 col-md-6 col-sm-6 work"> <a href="images/portfolio/01.jpg" class="work-box"> <img src="images/portfolio/01.jpg" alt="">
        <div class="overlay">
          <div class="overlay-caption">
             <p><span class="icon icon-magnifying-glass"></span></p>
          </div>
        </div>
        <!-- overlay --> 
        </a> </div>
      <div class="col-lg-3 col-md-6 col-sm-6 work"> <a href="images/portfolio/02.jpg" class="work-box"> <img src="images/portfolio/02.jpg" alt="">
        <div class="overlay">
          <div class="overlay-caption">
            <p><span class="icon icon-magnifying-glass"></span></p>
          </div>
        </div>
        <!-- overlay --> 
        </a> </div>
      <div class="col-lg-3 col-md-6 col-sm-6 work"> <a href="images/portfolio/03.jpg" class="work-box"> <img src="images/portfolio/03.jpg" alt="">
        <div class="overlay">
          <div class="overlay-caption">
            <p><span class="icon icon-magnifying-glass"></span></p>
          </div>
        </div>
        <!-- overlay --> 
        </a> </div>
      <div class="col-lg-3 col-md-6 col-sm-6 work"> <a href="images/portfolio/04.jpg" class="work-box"> <img src="images/portfolio/04.jpg" alt="">
        <div class="overlay">
          <div class="overlay-caption"> 
            <p><span class="icon icon-magnifying-glass"></span></p>
          </div>
        </div>
        <!-- overlay --> 
        </a> </div>
      <div class="col-lg-3 col-md-6 col-sm-6 work"> <a href="images/portfolio/05.jpg" class="work-box"> <img src="images/portfolio/05.jpg" alt="">
        <div class="overlay">
          <div class="overlay-caption">
            <p><span class="icon icon-magnifying-glass"></span></p>
          </div>
        </div>
        <!-- overlay --> 
        </a> </div>
      <div class="col-lg-3 col-md-6 col-sm-6 work"> <a href="images/portfolio/06.jpg" class="work-box"> <img src="images/portfolio/06.jpg" alt="">
        <div class="overlay">
          <div class="overlay-caption">
            <p><span class="icon icon-magnifying-glass"></span></p>
          </div>
        </div>
        <!-- overlay --> 
        </a> </div>
      <div class="col-lg-3 col-md-6 col-sm-6 work"> <a href="images/portfolio/07.jpg" class="work-box"> <img src="images/portfolio/07.jpg" alt="">
        <div class="overlay">
          <div class="overlay-caption">
            <p><span class="icon icon-magnifying-glass"></span></p>
          </div>
        </div>
        <!-- overlay --> 
        </a> </div>
      <div class="col-lg-3 col-md-6 col-sm-6 work"> <a href="images/portfolio/08.jpg" class="work-box"> <img src="images/portfolio/08.jpg" alt="">
        <div class="overlay">
          <div class="overlay-caption">
             <p><span class="icon icon-magnifying-glass"></span></p>
          </div>
        </div>
        <!-- overlay --> 
        </a> </div>
    </div>
  </div>
</section>
<!-- gallery section --> 



  <!-- Contact -->
  <section class="page-section" id="contact">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h2 class="section-heading text-uppercase">Contact Us</h2>
          <h3 class="section-subheading text-muted">Lorem ipsum dolor sit amet consectetur.</h3>
        </div>
      </div>
      <div class="row">
        <div class="col-lg-12">
          <form id="contactForm" name="sentMessage" novalidate="novalidate">
            <div class="row">
              <div class="col-md-6">
                <div class="form-group">
                  <input class="form-control" id="name" type="text" placeholder="Your Name *" required="required" data-validation-required-message="Please enter your name.">
                  <p class="help-block text-danger"></p>
                </div>
                <div class="form-group">
                  <input class="form-control" id="email" type="email" placeholder="Your Email *" required="required" data-validation-required-message="Please enter your email address.">
                  <p class="help-block text-danger"></p>
                </div>
                <div class="form-group">
                  <input class="form-control" id="phone" type="tel" placeholder="Your Phone *" required="required" data-validation-required-message="Please enter your phone number.">
                  <p class="help-block text-danger"></p>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-group">
                  <textarea class="form-control" id="message" placeholder="Your Message *" required="required" data-validation-required-message="Please enter a message."></textarea>
                  <p class="help-block text-danger"></p>
                </div>
              </div>
              <div class="clearfix"></div>
              <div class="col-lg-12 text-center">
                <div id="success"></div>
                <button id="sendMessageButton" class="btn btn-primary btn-xl text-uppercase" type="submit">Send Message</button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </section>

  <!-- Footer -->
  <footer class="footer">
    <div class="container">
      <div class="row align-items-center" style="text-align: center;">
        <div class="col-md-4">
          <span class="copyright">Copyright &copy; Getit 2019</span>
        </div>
        <div class="col-md-4">
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
        <div class="col-md-4">
          <ul class="list-inline quicklinks">
            <li class="list-inline-item">
              <a href="#">Privacy Policy</a>
            </li>
            <li class="list-inline-item">
              <a href="#">Terms of Use</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </footer>


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
