/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posbath;

/**
 *
 * @author rbath1
 */
public class Receipt {
    private LineItem[] lineItems = new LineItem[0];
    private double subTotal;
    private double discountInDollars;
    private double total;
    private final double TAX = .051;
    public Receipt(){
    }
      // Here's how to add a purchased product as a LineItem
    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    public double getTotalBeforeDiscount() {
        for(LineItem item : lineItems) {
            subTotal += item.getOrigPriceSubtotal();
        }
        return subTotal;
    }
    
    public double getTotalDiscount(){
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
     public void printProductInfo(){
         
       for (LineItem item : lineItems) {
        System.out.println(item.getProductNumber() + "       " + 
                item.getProductDesc() + "         " + item.getProductPrice() + 
                "         " + item.getQty());
       }  
       
       
   }
}
