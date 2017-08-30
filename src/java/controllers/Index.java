/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import db.ConnectionFT;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.catalina.ant.SessionsTask;
import wservice.NewWS;
import wservice.NewWS_Service;




/**
 *
 * @author Luong_LAP    
 */
//@WebServlet(name = "Index", urlPatterns = {"/Index"})
public class Index extends HttpServlet {
    private static final NewWS_Service srv = new NewWS_Service();
    private static final NewWS port = srv.getNewWSPort();
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
            //takeForm(request,response);
            LoginChecker(request,response);
   }

   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      processRequest(request, response);
      //PrintWriter out = response.getWriter();
      
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       processRequest(request, response);
       //PrintWriter out = response.getWriter();
       
   }
   
   @Override
   public String getServletInfo() {
      return "Short description";
   }// </editor-fold>
   
//   protected void takeForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//
//           String user = request.getParameter("user");
//           String pass = request.getParameter("pass");
//           
//           // HttpSession session= request.getSession();
//           String erro="none";
//           String a="index";
//           
//           if(port.checkLoginCtr(user,pass)){
//                response.sendRedirect("HomePage");
//           } else{
//               
//               response.sendRedirect("");
//           }
//                         
//   }
    protected void LoginChecker(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String user= request.getParameter("user");
        String pwd= request.getParameter("pwd");
        //System.out.println(user + "/n"+ pwd);
        
        if(port.checkLoginCtr(user,pwd)){
            response.sendRedirect("Time");
            HttpSession session=request.getSession();
            session.setAttribute("user", user);
        } else{
           response.sendRedirect("?error=0");
        }
        //tạo secssion
        
    };


}
