/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posbath;

/**
 *
 * @author rbath1
 */
public class Product {
    private String productID;
    private String description;
    private double unitPrice;
    //discount strat.
    
    public Product(String productNumber, String productDescription, double unitPrice){
        this.productID = productNumber;
        this.description = productDescription;
        this.unitPrice = unitPrice;
        //include what discount strategy
    }
    public Product(){
    }
    
    
    //NEEDS WORK
    public String getProdId(){
        return productID;
    }
    
    //needs work
    public double getUnitPrice(){
        return unitPrice;
    }
    
    public String getDescription(){
        return description;
    }
    
    
    
    
    
    
    
    
    
    
}
