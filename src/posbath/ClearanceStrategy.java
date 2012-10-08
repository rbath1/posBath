package posbath;

/**
 *
 * @author Robert Bath
 * @version 1.1
 */
public class ClearanceStrategy implements DiscountStrategyInterface {
    private static final double CLRNCE = .5;
    @Override
    public double discountStrategy(){
        return CLRNCE;
    }
    
}
