<%-- 
    Document   : registration
    Created on : 25 Jun, 2019, 7:19:44 PM
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
      <a class="navbar-brand js-scroll-trigger" href="#page-top">GET!T</a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive"  aria-label="Toggle navigation">
        Menu
        <i class="fas fa-bars"></i>
      </button>
     
  </nav>

  <!-- Header -->
  <section class="banner" style="background-image: url(images/banner1.jpg);">
  
  <!-- banner text -->
  <div class="container">
  
      <form class="form-horizontal" role="form">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="t1" required placeholder="Name">
    </div>
  </div>
   <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="inputEmail3" name="t2" required placeholder="Email">
    </div>
  </div>
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">Mobile Number</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="t3" required placeholder="Mob. no.">
    </div>
  </div>
   <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">User Id</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="t4" required placeholder="User Id">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword3" name="t5" required placeholder="Password">
    </div>
  </div>
  
  


  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default" name="b1">Sign up</button>
    </div>
      <%
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
		 String sql2="insert into health(id) values('"+id+"')";
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

		int res2=st.executeUpdate(sql2);
	}
        catch(Exception e)

	{
		
            out.println(e.toString());

	}

}

%>
  </div>
</form>
    
  </div>
</section>
<!-- header section --> 
<!-- intro section -->



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
