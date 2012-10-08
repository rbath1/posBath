package posbath;
/**
 *
 * @author Robert Bath
 * @version 1.1
 */
public class Startup {

    /**
     * This start the program
     * @param args 
     */
    public static void main(String[] args) {
       CashRegister register = new CashRegister();
       
       register.addItemToSale("A111", 5);
//     register.addItemToSale("B222", 2);
       register.setCustomerID("003212");
       

       register.printReceipt();
        
    }
}
