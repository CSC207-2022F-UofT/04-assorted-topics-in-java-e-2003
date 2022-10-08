/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

public class DrivableTrader extends Trader<Drivable> {

    public DrivableTrader (List<Drivable> inventory, List<Drivable> wishList, int money) {
        super(inventory, wishList, money);
    }

    public DrivableTrader (int money) {
        super(money);
    }
    @Override
    public int getSellingPrice(Drivable item) {
        int selling_price = super.getSellingPrice(item);
        if (selling_price == Tradable.MISSING_PRICE) {
            return selling_price;
        } else {
            return selling_price + item.getMaxSpeed();
        }
    }
}
