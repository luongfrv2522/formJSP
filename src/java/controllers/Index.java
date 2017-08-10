/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.ConnectionFT;
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

/**
 *
 * @author Luong_LAP    
 */
//@WebServlet(name = "Index", urlPatterns = {"/Index"})
public class Index extends HttpServlet {
    
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       
   }

   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      //processRequest(request, response);
      //PrintWriter out = response.getWriter();
      takeForm(request,response);
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       //processRequest(request, response);
       //PrintWriter out = response.getWriter();
       takeForm(request,response);
   }
   protected void takeForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

           String user = request.getParameter("user");
           String pass = request.getParameter("pass");
           
           // HttpSession session= request.getSession();
           String erro="none";
           String a="index";
           if(!(user.equals("admin")&&pass.equals("admin"))){
               
               erro="block";
                request.setAttribute("erro",erro);
                
               // response.sendRedirect("index");
           } else{
                a="HomePage";
                
           }
                request.setAttribute("erro",erro);
                RequestDispatcher rd=request.getRequestDispatcher("/"+a);
                rd.forward(request, response);
               
           
           //Code tam thoi kiem tra dang nhap

       
   }
   @Override
   public String getServletInfo() {
      return "Short description";
   }// </editor-fold>

}
