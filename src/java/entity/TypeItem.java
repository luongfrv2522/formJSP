/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class TypeItem {
    private String Link;
    private String ItemType;

    public TypeItem() {
    }

    public TypeItem(String Link, String ItemType) {
        this.Link = Link;
        this.ItemType = ItemType;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    public String getLink() {
        return Link;
    }

    public String getItemType() {
        return ItemType;
    }
    
    
}
