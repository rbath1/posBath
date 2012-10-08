package posbath;

/**
 *
 * @author Robert Bath
 * @version 1.11
 * 
 * Customer class stores and calls customer information
 * 
 * @param custName -customer name
 * @param custID -customer ID number
 */
public class Customer {
    private String custName;
    private String custID;

    public Customer(String custName, String custID){
        //validate
        this.custName = custName;
        this.custID = custID;
    }
    public Customer(String custName){
        //validate
        this.custName = custName;
    }
    
    public final String getCustName(){
        return custName;
    }
    public final String getCustID(){
        return custID;
    }
    
}
