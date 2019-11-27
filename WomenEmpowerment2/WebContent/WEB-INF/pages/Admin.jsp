
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Home Page</title>
<style type="text/css">
@charset "ISO-8859-1";

body{
	height: 100%;
	width: 100%;
	background-color: #add8e6;
	background-position: center;
	background-size: cover;
	position: absolute;
	overflow: hidden;
	clear: both;
}


.header{
	
	    font-family: Arial, Helvetica, sans-serif;
	    font-size: x-large;
	    text-align: center;
	    border: 2px solid black;
		padding: 22px 15px;
}


.topnav {
	background-color: #333;
	overflow: hidden;
  }
  
  
  .topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
  }
  
  
  .topnav a:hover {
	background-color: #ddd;
	color: black;
  }
  
  
  .topnav a.active {
	  background: linear-gradient(to right, #ff105f, #ffad06);
		color: white;
  }

  
.form-box{
	height: 580px;
	width: 300px;
	position: relative;
	margin: 6% auto;
	background: #fff;
	padding: 5px;	
	overflow: hidden;	
		
}

.input_group{
	position: absolute;
	width: 280px;
	
}

.input_field{
	width: 100%;
	padding: 10px 0;
	margin: 5px 0;
	border-left: 0;
	border-right: 0;
	border-top: 0;
	border-bottom: 1px solid #999;
	outline: none;
	background: transparent;
}


.submit_btn{
	width: 85%;
	padding: 10px 30px;
	cursor: pointer;
	display: block;
	margin: auto;
	background: linear-gradient(to right, #ff105f, #ffad06);
	border: 0;
	outline: none;
	border-radius: 30px;
}
  
#logo{

	height: 75px;
	width: 75px;
	float: left;

}
</style>        
        </head>
<body>
            <div class="main">
                <div class="header">
                        <br>
                        Ministry Of Women And Child Development
                </div>
        
                <div class="topnav">
                    
                      <a href="#trainees">Trainees</a>
                      <a href="#ngo">NGOs</a>
                      <a class="active" href="#user">User</a>
                      
                </div>
        
                    <div class="form-box">
                        
                        <p> Admin Dashboard </p>
                        
                        <div id="login" class="input_group">
                            <input type="text"  class="input_field" placeholder="User Id" required>
                            <input type="password" class="input_field" placeholder="Password" required>
                            <br>
                            <br>
                            <button type="submit" class="submit_btn">Log In</button>
                        </div>
                        
                    </div>
                </div>
        
        </body>
        </html>