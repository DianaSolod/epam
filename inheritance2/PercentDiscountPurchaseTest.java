import org.junit.Test;

import static org.junit.Assert.*;

public class PercentDiscountPurchaseTest {

    @Test
    public void getFinalCost() {
        Product milk = new Product("Milk", new Byn(140));
        PercentDiscountPurchase test = new PercentDiscountPurchase(milk,10, 10.5);
        assertEquals(new Byn(1253), test.getFinalCost(new Byn(1400)));
    }

    @Test
    public void getCost() {
        Product milk = new Product("Milk", new Byn(140));
        PercentDiscountPurchase test = new PercentDiscountPurchase(milk,10, 10.5);
        assertEquals(new Byn(1200), test.getCost());
    }
}