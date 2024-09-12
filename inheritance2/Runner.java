import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Product product = new Product("Milk", new Byn());
        AbstractPurchase purchases[] = {
                new PriceDiscountPurchase(product, 6, new Byn(50)),
                new PriceDiscountPurchase(product, 10, new Byn(15)),
                new PercentDiscountPurchase(product, 8, 5.5),
                new PercentDiscountPurchase(product, 5, 3),
                new TransportedPurchase(product, 20, new Byn(250)),
                new TransportedPurchase(product, 30, new Byn(400))
        };
        Utils.printPurchases(purchases);
        Arrays.sort(purchases);
        Utils.printPurchases(purchases);
        System.out.println("Minimum cost = " + purchases[purchases.length - 1].getCost().convert());
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
