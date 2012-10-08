package posbath;

/**
 *
 * @author Robert Bath
 * @version 1.11
 * 
 * Discount Strategy Inferface creates contract for all Discount objects
 * (percentage/qty)
 */
public interface DiscountStrategyInterface {
    public abstract double getDiscountAmount(double price, int qty);
    
    public abstract void setDiscountPercent(double percent);
    
}
