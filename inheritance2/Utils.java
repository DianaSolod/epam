import java.util.Arrays;

public class Utils {
    public static void printPurchases(AbstractPurchase[] purchases) {
        for(AbstractPurchase purchase : purchases){
            System.out.println(purchase);
        }
        System.out.println();
    }

    public static int search(AbstractPurchase[] purchases){
        AbstractPurchase searchPurchase = new PriceDiscountPurchase(new Product("Milk", new Byn()), 5, new Byn(30));
        return Arrays.binarySearch(purchases, searchPurchase);
    }
}
