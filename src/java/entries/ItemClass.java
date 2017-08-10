/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entries;

/**
 *
 * @author Admin
 */
public class ItemClass {
    private String Link;
    private String Name;
    private String Cost;
    private String Desn;

    public ItemClass() {
    }

    public ItemClass(String Link, String Name, String Cost, String Desn) {
        this.Link = Link;
        this.Name = Name;
        this.Cost = Cost;
        this.Desn = Desn;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    public void setDesn(String Desn) {
        this.Desn = Desn;
    }

    public String getLink() {
        return Link;
    }

    public String getName() {
        return Name;
    }

    public String getCost() {
        return Cost;
    }

    public String getDesn() {
        return Desn;
    }
    
    //Functions
}
