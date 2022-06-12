import org.junit.Test;

import static org.junit.Assert.*;

public class TransportedPurchaseTest {

    @Test
    public void getFinalCost() {
        Product milk = new Product("Milk", new Byn(140));
        TransportedPurchase test = new TransportedPurchase(milk,9, new Byn(150));
        assertEquals(new Byn(1110), test.getFinalCost(new Byn(1260)));
    }

    @Test
    public void getCost() {
        Product milk = new Product("Milk", new Byn(140));
        TransportedPurchase test = new TransportedPurchase(milk,9, new Byn(150));
        assertEquals(new Byn(1100), test.getCost());
    }
}