/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public Product getProduct(){
        return product;
    }
    public int getQty(){
        return qty;
    }
}
