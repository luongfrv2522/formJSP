/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import entity.TypeItem;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ListTypeItem extends ShareConnection{
    private LinkedList<TypeItem> listTG1=new LinkedList<TypeItem>();
    public ListTypeItem() {
        setListItem();
    };
    private void setListItem(){
        try {
            String sql="select * from type_item";
            stmt= con.prepareStatement(sql);
            rs=stmt.executeQuery();
            while(rs.next()){
                TypeItem ti=new TypeItem(
                rs.getString("LINK"),
                rs.getString("ITEM_TYPE")
                );
                listTG1.add(ti);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListTypeItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public LinkedList<TypeItem> setList() {
        return listTG1;
    }
    
    public String getTypeItem(String Link){
        String a=" ";
        for(TypeItem ti:listTG1){
            if(ti.getLink().equals(Link))
                a+= ti.getItemType()+" ";
        }
        
        return a;
    }
    public static void main(String[] args) {
        //ListTypeGroup it=new ListTypeGroup();
        ListTypeItem listTI= new ListTypeItem();
        //TypeGroup tg= (TypeGroup) st.getFirst();
//        for(int i=0;i<listTI.size();i++){
//            TypeItem TI= (TypeItem) listTI.get(i);
//            System.out.println(TI.getLink()+" | "+TI.getItemType());
//        };
         // System.out.println(st);
         // System.out.println(st.size());
         for(TypeItem TI1:listTI.setList()){
             System.out.println(TI1.getLink()+" | "+TI1.getItemType());
         }
    }
}
