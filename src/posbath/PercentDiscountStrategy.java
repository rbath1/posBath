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
 * @param discountPercent set percent amount of the discount
 */
public class PercentDiscountStrategy implements DiscountStrategyInterface {
    private double discountPercent = .15;
    @Override
     public double getDiscountAmount(double price, int qty){
         //validate
         return price * qty * discountPercent;
     }
     
    @Override
     public void setDiscountPercent(double percent){
        //validate
         discountPercent = percent;
         
     }
    
}
