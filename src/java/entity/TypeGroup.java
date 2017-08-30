/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import dao.ListTypeGroup;
import db.ConnectionFT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TypeGroup{
    private String MaTypeGroup;
    private String NameType;
    private String GroupType;

    public TypeGroup() {
    }
    public TypeGroup(String MaTypeGroup, String NameType, String GroupType) {
        this.MaTypeGroup = MaTypeGroup;
        this.NameType = NameType;
        this.GroupType = GroupType;
    }

   

    public String getMaTypeGroup() {
        return MaTypeGroup;
    }

    public String getNameType() {
        return NameType;
    }

    public String getGroupType() {
        return GroupType;
    }

    public void setMaTypeGroup(String MaTypeGroup) {
        this.MaTypeGroup = MaTypeGroup;
    }

    public void setNameType(String NameType) {
        this.NameType = NameType;
    }

    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }
    
    public static void main(String[] args) {
        TypeGroup iic=new TypeGroup("1234","sda","sd");
        Connection con= ConnectionFT.getConnection();
        ResultSet rs;
        PreparedStatement stmt;
        LinkedList<TypeGroup> ltg=new LinkedList<TypeGroup>();
        try {
            
            String sql= "select * from type_group";
            stmt= con.prepareStatement(sql);
            rs=stmt.executeQuery();
            while(rs.next()){
                TypeGroup item=new TypeGroup(
                    rs.getString("MA_TYPE_GROUP"),
                    rs.getNString("NAME_TYPE"), 
                    rs.getString("GROUP_ITEM")
                );
                ltg.add(item);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListTypeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(ltg.size());
    }
}
