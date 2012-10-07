package posbath;

/**
 *
 * @author rbath1
 */
public class LineItem {
    private Product product = new Product();
    private int qty;
    
    public LineItem(Product product, int qty){
        this.product = product;
        this.qty = qty;
    }
    
    public double getOrigPriceSubtotal(){
        double subTotal;
        subTotal = product.getUnitPrice() * qty;
        return subTotal;
    }
    
    public double getLineItemDiscount(){
        return this.getOrigPriceSubtotal() * product.getDiscountPercentage();
    }
    
    public int getQty(){
        return qty;
    }
    public String getProductNumber(){
        return product.getProdId();
    }
    public String getProductDesc(){
        return product.getDescription();
    }
    public double getProductPrice(){
        return product.getUnitPrice();
    } 
}
