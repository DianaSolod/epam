import java.util.Arrays;

public class Utils {
    public static void printPurchases(AbstractPurchase[] purchases) {
        for(AbstractPurchase purchase : purchases){
            System.out.println(purchase);
        }
        System.out.println();
    }

    public static int search(AbstractPurchase[] purchases){
        Product milk = new Product("Milk", new Byn(140));
        AbstractPurchase searchPurchase = new PriceDiscountPurchase(milk, 5, new Byn(30));
        return Arrays.binarySearch(purchases, searchPurchase);
    }
}
