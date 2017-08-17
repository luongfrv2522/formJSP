<%-- 
    Document   : Home
    Created on : Jul 10, 2017, 2:21:41 PM
    Author     : UserAdmin
--%>

<%@page import="entries.ItemClass"%>
<%@page import="dao.ListItem"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        
        <link rel="stylesheet" href="css/Home.css">
        <title>Home Page</title>
        <link rel="stylesheet" href="css/Header.css">
        <link rel="icon" href="http://icons.iconarchive.com/icons/hopstarter/halloween-avatars/64/Red-Skull-icon.png">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.css">
        
        <script type="text/javascript">
            $(document).ready(function() {
                 var X,Y;
                $('.item').hover(function(event) {
                    X=event.pageX;
                    Y=event.pageY;
                });
                
            });
                
               
            

        </script>
        <script src="js/main.js"></script>
        <style type="text/css">
            .item .info{
                background: none rgba(20, 20, 22, 0.96);
                padding: 7px;
                border: 3px solid;
                position: absolute;
                z-index: 1;
                color: #69699c;
                text-align: left;
                min-width: 250px;
                max-width: 280px;
                min-height: 150px;
                display: none;
                
            }
            
            .item:hover .info{
                 top:50%;
                 left:50%;
                
                display: block;
            }
            .affix {
            top: 10px;
            width: 25%;

            background-color: cyan;
            }
            .header{
                margin-top: 65px;
            }
        </style>
    </head>
    <body>
        <%ListItem st= new ListItem(true);%>
        <%@include file="/common/Navbar.jsp"%>
        <%@include file="/common/Header.jsp"%>
        
        <div class="container-fluid" >
            <div class="section-wrapper-top"></div>
            <div class="section-wrapper-content">
                <div class="container-item">
                    <div class="ul">
                        <%for(ItemClass IC:st){%>
                        <ul class="item">
                            <li><a href=""><img src="https://lienminh.garena.vn/images/item/<%=IC.getLink()%>.png"></a></li>
                            <li class="info">
                                 <a href=""><img src="https://lienminh.garena.vn/images/item/<%=IC.getLink()%>.png"></a>
                                 <p class="name"><%=IC.getName()%></p>
                                 <%=IC.getDesn()%>
                                 <p class="cost">Cost: <%=IC.getCost()%></p>
                            </li>
                        </ul>
                       
                        <%};%>
                    </div>

                </div>
            </div>
            <div class="section-wrapper-bottom"></div>
        </div>
        <p></p>
        
        <!-- Các file js -->

        <script src="js/bootstrap.js"></script>
        
    </body>
</html>
