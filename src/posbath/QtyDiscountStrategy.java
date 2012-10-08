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
 * @param MIN_AMT -constant variable for minimum quantity for discount
 * @param MAX_AMT -constant variable for maximum quantity for discount
 */
public class QtyDiscountStrategy implements DiscountStrategyInterface{
    private final int MIN_AMT = 5;
    private final int MAX_AMT = 10;
    private double percent = 0;
    
    @Override
    public double getDiscountAmount(double price, int qty){
        //validate
        if (qty >= MIN_AMT){
            this.setDiscountPercent(.2);
        } else if (qty >= MAX_AMT){
            this.setDiscountPercent(.3);
        } else {
            this.setDiscountPercent(0);
        }
         return price * qty * percent;
    }
    
    @Override
    public void setDiscountPercent(double percent){
        this.setDiscountPercent(percent);
        
    }
    
}
