package posbath;

import java.text.NumberFormat;
/**
 * @author Robert Bath
 * @version 1.1
 */
public class Receipt {
    private LineItem[] lineItems = new LineItem[0];
    private double subTotal;
    private double discountInDollars;
    private final double TAX = .051;
    private NumberFormat nf = NumberFormat.getCurrencyInstance();
    public Receipt(){
    }
    public final void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    public final double getTotalBeforeDiscount() {
        for(LineItem item : lineItems) {
            subTotal += item.getOrigPriceSubtotal();
        }
        return subTotal;
    }
    
    public final double getTotalDiscount(){
        for(LineItem item : lineItems){
            discountInDollars += item.getLineItemDiscount();
        }
        return discountInDollars;
    }
    
    public double getTax(){
        return subTotal * TAX;
    }
    
    public double getGrandTotal(){
        return ((this.getTax() + subTotal) - discountInDollars); 
    }
    
     public final void printProductInfo(){
         
       for (LineItem item : lineItems) {
        System.out.println(item.getProductNumber() + "       " + 
                item.getProductDesc() + "         " + 
                nf.format(item.getProductPrice()) + 
                "         " + item.getQty());
       }  
       
       
   }
}
