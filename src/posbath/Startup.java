
package posbath;

/**
 *
 * @author Robert Bath
 */
public class Startup {

    public static void main(String[] args) {
       CashRegister register = new CashRegister();
       
       register.addItemToSale("B222", 3);
       
       System.out.println(register.getSubTotal());
        
    }
}
