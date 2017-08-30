/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ConnectionFT {
    private static Connection conn;
    private static String ClassName = "com.mysql.jdbc.Driver";
   // localhost 
//   private static String url = "jdbc:mysql://node182505-hidingme.jelastic.servint.net/dbweblol";
//   private static String user = "root";
//   private static String pass = "OQEaqp34720";
   // web localhost
   private static String url = "jdbc:mysql://localhost:3306/dbli";
   private static String user = "USER1";
   private static String pass = "123456";
    public static Connection getConnection(){
       try {
           Class.forName(ClassName);
          try {
             conn= DriverManager.getConnection(url,user,pass);
             System.out.println("Connect thành công!");
          } catch (SQLException ex) {
             System.out.println("Kết nối Database bị lỗi!");
          }
          
          
       } catch (ClassNotFoundException ex) {
          System.out.println("Name Wrong");
       }
       System.out.println("Kết nối Database thành công!");
       return conn;
    };
    
    public static void main(String[] args) {
          ConnectionFT.getConnection();
   };
    
};

