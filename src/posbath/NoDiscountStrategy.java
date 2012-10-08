package posbath;

/**
 *
 * @author Robert Bath
 * @version 1.1
 */
public class NoDiscountStrategy implements DiscountStrategyInterface {
    private static final double NONE = 0;
    @Override
    public double discountStrategy(){
        return NONE;
    }
    
}
