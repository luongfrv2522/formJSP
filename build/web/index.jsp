<%-- 
    Document   : index
    Created on : Jul 3, 2017, 4:17:34 PM
    Author     : Luong_LAP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--tự động chuyển hướng qua web home-->
        <%if(session.getAttribute("asd")==null){response.sendRedirect("HomePage");}%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript">
            
            // $(document).ready(function() {
            //     $.post('https://lienminh.garena.vn/game-info/items',, function(data, textStatus, xhr) {
            //     alert(textStatus);
            //     });
            // });
            // $("#form1").submit(function(e) {
            //  alert(e.preventDefault().toString());
            //  });
        </script>
    </head>
    <body style="text-align: center">
        <div>
            <form id="form1" action="UserPass" method="POST" style="display: block;" >
                
                <input type="text" name="user" autocomplete="off" placeholder="User Name" ><br>
                <input type="password" name="pass" autocomplete="off" placeholder="PassWord" ><br>
                <div style="margin-top: 10px;text-align: ">
                    <input type="submit" value="Đăng nhập" >
                    <input type="reset" value="Đặt lại">
                </div>
                
            </form>
            
            <%  String a="none";
                if(request.getAttribute("erro")!=null){
                   a="block";
                   request.setAttribute("erro",null);
                }
            %>
            
            <h2 style="display: <%=a%>">Sai Username/Password</h2>
        </div>

        
        
    </body>
</html>
