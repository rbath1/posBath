package posbath;

/**
 *
 * @author Robert Bath
 * @version 1.1
 */
public class LineItem {
    private Product product = new Product();
    private int qty;
    
    public LineItem(Product product, int qty){
        this.product = product;
        this.qty = qty;
    }
    
    public final double getOrigPriceSubtotal(){
        double subTotal;
        subTotal = product.getUnitPrice() * qty;
        return subTotal;
    }
    
    public double getLineItemDiscount(){
        return this.getOrigPriceSubtotal() * product.getDiscountPercentage();
    }
    
    public final int getQty(){
        return qty;
    }
    public final String getProductNumber(){
        return product.getProdId();
    }
    public final String getProductDesc(){
        return product.getDescription();
    }
    public final double getProductPrice(){
        return product.getUnitPrice();
    } 
}
