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
    private DiscountStrategyInterface discountStrategy;
    //discount strat.
    
    public Product(String productNumber, String productDescription,
            double unitPrice, DiscountStrategyInterface discountStrategy){
        this.productID = productNumber;
        this.description = productDescription;
        this.unitPrice = unitPrice;
        this.discountStrategy = discountStrategy;
        //include what discount strategy
    }
    public Product(){
    }
    public double getDiscountPercentage(){
       return discountStrategy.discountStrategy();
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
