import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void search() {
        Product milk = new Product("Milk", new Byn());
        AbstractPurchase equalsFive = new PriceDiscountPurchase(milk, 5, new Byn(30));
        AbstractPurchase equalsFour = new PriceDiscountPurchase(milk, 3, new Byn(20));
        AbstractPurchase equalsTen = new PercentDiscountPurchase(milk, 8, 5.5);
        AbstractPurchase equalsNine = new TransportedPurchase(milk, 8, new Byn(150));
        AbstractPurchase equalsThree = new PriceDiscountPurchase(milk, 3, new Byn(30));

        //purchase with cost 5 is in the middle
        AbstractPurchase firstSet[] = {equalsFour, equalsFive, equalsNine, equalsTen};
        assertEquals(Utils.search(firstSet), 1);

        //purchase with cost 5 is the least
        AbstractPurchase secondSet[] = {equalsFive, equalsNine , equalsTen};
        assertEquals(Utils.search(secondSet), 0);

        //purchase with cost 5 is the biggest
        AbstractPurchase thirdSet[] = {equalsThree, equalsFour, equalsFive};
        assertEquals(Utils.search(thirdSet), 2);
    }
}
