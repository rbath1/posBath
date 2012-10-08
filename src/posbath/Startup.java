package posbath;
/**
 *
 * @author Robert Bath
 * @version 1.1
 */
public class Startup {

    public static void main(String[] args) {
       CashRegister register = new CashRegister();
       
       register.addItemToSale("A111", 1);
       register.addItemToSale("B222", 2);
       register.findCustomer("Abagil Dandy");
       

       register.printReceipt();
        
    }
}
