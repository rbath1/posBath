package posbath;
/**
 * @author Robert Bath
 * @version 1.1
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
    public final double getDiscountPercentage(){
       return discountStrategy.discountStrategy();
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
