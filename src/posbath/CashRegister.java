/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posbath;

/**
 *
 * @author Robert Bath
 * @version 1.11
 * 
 * This class acts as a virtual cash register.
 * 
 * @param receipt - class creates a new receipt
 */
public class CashRegister {
    private Receipt receipt = new Receipt();
    Customer customer = null;
   private Product[] products = new Product[] {
    new Product("A111","Hat",9.99,new QtyDiscountStrategy()),
    new Product("B222","Bat",29.99, new PercentDiscountStrategy()),
    new Product("C333","Glove",39.99, new PercentDiscountStrategy())
   };
   public final void addItemToSale(String prodId, int qty) {
       //validate
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProdId())) {
                product = p;
                if(product != null) {
            receipt.addLineItem(product, qty);
                }
            }    
        }
   }
   public final void endSale(){
       receipt.outputReceipt();
   }
   
   
    
   public void setCustomerID(String custID){
       //validate
       receipt.setCustomerID(custID);
   }   
}
