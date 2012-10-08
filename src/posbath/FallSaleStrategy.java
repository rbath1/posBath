package posbath;

/**
 *
 * @author Robert Bath
 * @version 1.1
 */
public class FallSaleStrategy implements DiscountStrategyInterface {
    private static final double FALL = .2;
    @Override
    public double discountStrategy(){
        return FALL;
        
    }
    
}
