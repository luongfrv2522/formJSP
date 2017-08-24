/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.ListItem;
import entity.ItemClass;
import entity.TypeGroup;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;


/**
 *
 * @author Admin
 */
public class ListTypeGroup extends ShareConnection{
    private LinkedList<TypeGroup> ltg1=new LinkedList<TypeGroup>();
    public ListTypeGroup(){
        setListGroup();
    };
    
    private void setListGroup(){
        try {
            String sql= "select * from type_group";
            stmt= con.prepareStatement(sql);
            rs=stmt.executeQuery();
            while(rs.next()){
                TypeGroup item=new TypeGroup(
                    String.valueOf(rs.getInt("MA_TYPE_GROUP")),
                    rs.getNString("NAME_TYPE"),
                    String.valueOf(rs.getInt("GROUP_ITEM"))
                );
                ltg1.add(item);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ListTypeGroup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public LinkedList<TypeGroup> setList() {
        return ltg1;
    }
    
    public LinkedList<TypeGroup> getList(String Ma){
        LinkedList<TypeGroup> ltm=new LinkedList<TypeGroup>();
        for(TypeGroup t: ltg1){
            if(t.getGroupType().equals(Ma)){
                ltm.add(t);
            }
        }
        return ltm;
    }
      public static void main(String[] args) {
        //ListTypeGroup it=new ListTypeGroup();
        ListTypeGroup st= new ListTypeGroup();
        //TypeGroup tg= (TypeGroup) st.getFirst();
//        for(int i=0;i<st.size();i++){
//            TypeGroup tg= (TypeGroup) st.get(i);
//            System.out.println(tg.getMaTypeGroup()+" | "+tg.getNameType()+" | "+tg.getGroupType());
//        };
         // System.out.println(st);
         // System.out.println(st.size());
         ////
//        for(TypeGroup tg:st.setList()){
//             System.out.println(tg.getMaTypeGroup()+" | "+tg.getNameType()+" | "+tg.getGroupType());
//         }
         for(TypeGroup tg:st.getList("5")){
             System.out.println(tg.getMaTypeGroup()+" | "+tg.getNameType()+" | "+tg.getGroupType());
         }
    }
}
