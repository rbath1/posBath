package posbath;

/**
 *
 * @author Robert Bath
 * @version 1.1
 */
public class Customer {
    private String custName;
    private String custID;
    
    
    public Customer(String custName, String custID){
        this.custName = custName;
        this.custID = custID;
    }
    public Customer(String custName){
        this.custName = custName;
    }
    
    public final String getCustName(){
        return custName;
    }
    public final String getCustID(){
        return custID;
    }
    
}
