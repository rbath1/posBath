/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posbath;

/**
 *
 * @author rbath1
 */
public class CashRegister {
    private Receipt receipt = new Receipt();
    public CashRegister(){
    }
   private Product[] products = new Product[] {
    new Product("A111","Hat",9.99),
    new Product("B222","Bat",29.99),
    new Product("C333","Glove",39.99)
   };
   private Customer[] customer = new Customer[]{
       new Customer("Frank Stallone", 001235),
       new Customer("Abagil Dandy", 002421),
       new Customer("Annie Oakley", 003212)
   };
   public void addItemToSale(String prodId, int qty) {
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
 public double getSubTotal(){
    return receipt.getTotalBeforeDiscount();
 }
   
    
}
