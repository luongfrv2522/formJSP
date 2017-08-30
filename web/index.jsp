<%-- 
    Document   : index
    Created on : Jul 31, 2017, 12:28:58 PM
    Author     : Admin
    --%>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <%
        if(session.getAttribute("user")!=null){
        response.sendRedirect("HomePage");
        }
    %>
<head>
    <link rel="shortcut icon" href="http://static.appstore.vn/a/uploads/thumbnails/122015/devo-icon-pack_icon.png" type="favicon/ico" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
</head>
<body>
    <%@include file="common/Navbar.jsp"%>
    <div class="container" style="margin: 80px 0px 0px 10px; width: 100%;">
        <div class="row">
            <div class="col-sm-6 col-md-4 col-md-offset-4">
                <h1 class="text-center login-title">Sign in to website</h1>
                <div class="account-wall">
                    
                    <form class="form-signin" action="UserPass" method="post">
                       <% if(request.getParameter("error")!=null){
                       out.print("<h6 class='erro' style='color: red'>Sai tên đăng nhập/mật khẩu.</h6>");
                   } %>
                   <input type="text" name="user" class="form-control" placeholder="User" required autofocus>
                   <input type="password" name="pwd" class="form-control" placeholder="Password" required>
                   <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                   <label class="checkbox pull-left">
                    <input type="checkbox" value="remember-me">
                    Remember me
                </label>
                <a href="#" class="pull-right need-help">Need help? </a><span class="clearfix"></span>
            </form>
        </div>
        <a href="#" class="text-center new-account">Create an account </a>
    </div>
</div>
</div>
</body>
</html>
