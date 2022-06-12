import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Product milk = new Product("Milk", new Byn(140));
        AbstractPurchase purchases[] = {
                new PriceDiscountPurchase(milk,5, new Byn(30)),
                new PriceDiscountPurchase(milk,10, new Byn(15)),
                new PercentDiscountPurchase(milk,8, 5.5),
                new PercentDiscountPurchase(milk,5, 3),
                new TransportedPurchase(milk,20, new Byn(250)),
                new TransportedPurchase(milk,30, new Byn(400))
        };
        Utils.printPurchases(purchases);
        Arrays.sort(purchases);
        Utils.printPurchases(purchases);
        System.out.println("Minimum cost = " + purchases[purchases.length - 1].getCost());
        System.out.println();
        int searchIndex = Utils.search(purchases);
        if (searchIndex >= 0) {
            System.out.println("Purchase with cost = 5:");
            System.out.println(purchases[searchIndex]);
        }
        else{
            System.out.println("No purchase with cost = 5");
        }
    }
}
