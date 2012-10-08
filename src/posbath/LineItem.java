package posbath;
/**
 *
 * @author Robert Bath
 * @version 1.11
 * 
 * This class is used for storing items of a sale/receipt and calculating subtotals
 * 
 * @param product -Class calls product object 
 * @param qty - class stores quantity amount for called product
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
        return product.getDiscountAmount(product.getUnitPrice(), qty);
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
