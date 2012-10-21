package posbath;

import java.text.NumberFormat;
import java.util.*;
/**
 * @author Robert Bath
 * @version 1.11
 * 
 * This class stores and calls receipt information
 * 
 * @param LineItem -class creates and sizes an array of line items
 * @param subTotal - calculated subtotal of all line items
 * @param discountInDollars - dollar amount for all discounts that apply
 * @param TAX - constant for Wisconsin sales tax
 * @param nf - formats output for currency
 */
public class Receipt {
    private List<LineItem> lineItems = new ArrayList<>();
    private double subTotal;
    private double discountInDollars;
    private final double TAX = .051;
    private NumberFormat nf = NumberFormat.getCurrencyInstance();
    Customer customer = null;
    private Customer[] customers = new Customer[]{
       new Customer("Frank Stallone", "001235"),
       new Customer("Abagil Dandy", "002421"),
       new Customer("Annie Oakley", "003212")
   };
    public Receipt(){
    }
    public final void addLineItem(Product product, int qty) {
        //validate
        LineItem item = new LineItem(product, qty);
        addToList(item);
    }
    private void addToList(LineItem item) {
        //validate
        lineItems.add(item);
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
    public final double getGrandTotal(){
        return ((this.getTax() + subTotal) - discountInDollars); 
    }
    public final void setCustomerID(String custID){
       //validate
       for(Customer c : customers) {
           if(custID.equals(c.getCustID())) {
               customer = c;
               break;
           }
               else {
                  customer = new Customer("No History", "N/A");       
           }
       }
   } 
     public void outputReceipt(){
      System.out.println("Customer: " + customer.getCustName() + "       ID#" +
              customer.getCustID());
      System.out.println("----------------------------------------");
      System.out.println("Item#---Description---Price----Quantity");
      System.out.println("----------------------------------------");
      this.outputProductInfo();
      System.out.println("----------------------------------------");
      System.out.println("Subtotal: " + nf.format(this.getTotalBeforeDiscount()));
      System.out.println("Tax:      " + nf.format(this.getTax()));
      System.out.println("Discount: " + nf.format(this.getTotalDiscount()));
      System.out.println("Total:   " + nf.format(this.getGrandTotal()));          
 } 
     // local helper method for outputReceipt
     private void outputProductInfo(){
       for (LineItem item : lineItems) {
        System.out.println(item.getProductNumber() + "       " + 
                item.getProductDesc() + "         " + 
                nf.format(item.getProductPrice()) + 
                "         " + item.getQty());
       }  
   }
}
