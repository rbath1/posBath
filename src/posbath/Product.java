package posbath;
/**
 * @author Robert Bath
 * @version 1.11
 * 
 * Product class stores information of all available products
 * 
 * @param productNumber the product ID number
 * @param description description of the product
 * @param unitPrice price of single product
 * @param discountStrategy discount strategy object for percentage/qty discounts
 */
public class Product {
    private String productID;
    private String description;
    private double unitPrice;
    private DiscountStrategyInterface discountStrategy;
    
    public Product(String productNumber, String productDescription,
            double unitPrice, DiscountStrategyInterface discountStrategy){
        this.productID = productNumber;
        this.description = productDescription;
        this.unitPrice = unitPrice;
        this.discountStrategy = discountStrategy;
    }
    public Product(){
    }
    public final double getDiscountAmount(double price, int qty){
        //validate
       return discountStrategy.getDiscountAmount(price, qty);
    }
    public final String getProdId(){
        return productID;
    }
    public final double getUnitPrice(){
        return unitPrice;
    }
    public final String getDescription(){
        return description;
    }
    
    
    
    
    
    
    
    
    
    
}
