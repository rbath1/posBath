/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posbath;

/**
 *
 * @author Bob
 */
public class NoDiscountStrategy implements DiscountStrategyInterface {
    @Override
    public double discountStrategy(){
        return 0;
    }
    
}
