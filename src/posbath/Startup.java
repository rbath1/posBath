package posbath;
/**
 *
 * @author Robert Bath
 */
public class Startup {

    public static void main(String[] args) {
       CashRegister register = new CashRegister();
       
       register.addItemToSale("A111", 1);
       

       register.printReceipt();
        
    }
}
