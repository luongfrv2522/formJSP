<%-- 
    Document   : Navbar
    Created on : Aug 9, 2017, 10:11:11 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        
        <title>Navigation Bar</title>
        <style type="text/css">
        	nav{
        		z-index: 5;
        	}
        </style>
    </head>
        <nav class="navbar navbar-inverse navbar-fixed-top">
        
        	<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#menu">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
        		<a class="navbar-brand" href=""><span class="glyphicon glyphicon-home"></span></a>
        	</div>
        	
			<div class="collapse navbar-collapse" id="menu">
				<ul class="nav navbar-nav">
					<li><a href="#">GIỚI THIỆU</a></li>
					<li><a href="#">TIN TỨC</a></li>
					<li><a href="#">GIẢI ĐẤU</a></li>
					<li><a href="#">CỘNG ĐỒNG</a></li>
					<li><a href="#">DIỄN ĐÀN</a></li>
					<li><a href="#">HỖ TRỢ</a></li>
				</ul>
			</div>        	
       
        </nav>
