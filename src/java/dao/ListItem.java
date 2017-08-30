/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ConnectionFT;
import entity.ItemClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UserAdmin
 */
public class ListItem extends LinkedList<ItemClass>{
    private Connection con= ConnectionFT.getConnection();
    private ResultSet rs;
    private PreparedStatement stmt;
    
    public ListItem(){};
    public ListItem(boolean n){ //có tự động lấy list item hay không?
        if(n==true){
           this.setListItem();
        }
    }
    private void setListItem() {
        try {
            String sql="select * from infomation_item";
            stmt= con.prepareStatement(sql);
            rs=stmt.executeQuery();
            while(rs.next()){
                ItemClass item=new ItemClass(
                    rs.getString("LINK"),
                    rs.getNString("NAME"), 
                    rs.getString("COST"),
                    rs.getNString("DESCRIPTION")
                );
                this.add(item);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) {
        //ListItem it=new ListItem();
        ListItem st= new ListItem(true);
        System.out.println(st.size());
       // System.out.println(st.get(1).getLink()+" | "+st.get(1).getName()+" | "+st.get(1).getDesn());
    }
}
