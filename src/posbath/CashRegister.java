/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posbath;

import java.text.NumberFormat;

/**
 *
 * @author rbath1
 */
public class CashRegister {
    private Receipt receipt = new Receipt();
    private NumberFormat nf = NumberFormat.getCurrencyInstance();
    private Customer customer = null;
    
   public CashRegister(){
   }
   
   private Product[] products = new Product[] {
    new Product("A111","Hat",9.99,new NoDiscountStrategy()),
    new Product("B222","Bat",29.99, new FallSaleStrategy()),
    new Product("C333","Glove",39.99, new ClearanceStrategy())
   };
   
   private Customer[] customers = new Customer[]{
       new Customer("Frank Stallone", "001235"),
       new Customer("Abagil Dandy", "002421"),
       new Customer("Annie Oakley", "003212")
   };
   
   public final void addItemToSale(String prodId, int qty) {
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProdId())) {
                product = p;
                //break;
                if(product != null) {
            receipt.addLineItem(product, qty);
                }
            }    
        }
   }
   public void findCustomer(String custName){
       //Customer customer = null;
       for(Customer c : customers) {
           if(custName.equals(c.getCustName())) {
               customer = c;
               break;
           }
               else {
                  customer = new Customer("No History", "N/A");       
           }
       }
   }
     public void printReceipt(){
      System.out.println("Customer: " + customer.getCustName() + "       ID#" +
              customer.getCustID());
      System.out.println("----------------------------------------");
      System.out.println("Item#---Description---Price----Quantity");
      System.out.println("----------------------------------------");
      receipt.printProductInfo();
      System.out.println("----------------------------------------");
      System.out.println("Subtotal: " + nf.format(receipt.getTotalBeforeDiscount()));
      System.out.println("Tax:      " + nf.format(receipt.getTax()));
      System.out.println("Discount: " + nf.format(receipt.getTotalDiscount()));
      System.out.println("Total:   " + nf.format(receipt.getGrandTotal()));
             
 }
   
    
}
