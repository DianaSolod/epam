import org.junit.Test;

import static org.junit.Assert.*;

public class PriceDiscountPurchaseTest {

    @Test
    public void getFinalCost() {
        Product milk = new Product("Milk", new Byn(140));
        PriceDiscountPurchase test = new PriceDiscountPurchase(milk,9, new Byn(10));
        assertEquals(new Byn(1170), test.getFinalCost(new Byn(1260)));
    }

    @Test
    public void getCost() {
        Product milk = new Product("Milk", new Byn(140));
        PriceDiscountPurchase test = new PriceDiscountPurchase(milk,9, new Byn(10));
        assertEquals(new Byn(1100), test.getCost());
    }
}