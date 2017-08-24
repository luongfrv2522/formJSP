/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.ConnectionFT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class ShareConnection{
    protected Connection con= ConnectionFT.getConnection();
    protected ResultSet rs;
    protected PreparedStatement stmt;
    
    public LinkedList setList(){return null;
};
}
