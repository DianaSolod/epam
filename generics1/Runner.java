package by.epam.lab;

public class Runner {
    public static void main(String[] args){
        Purchase p1 = new Purchase(new Product("Milk", new Byn(170)), 20);
        PurchaseUtils<Product> pu1 = new PurchaseUtils(p1);
        pu1.printPurchase();

        Purchase p2 = new Purchase(new Product("Sugar", new Byn(300)), 12.5);
        PurchaseUtils<Product> pu2 = new PurchaseUtils(p2);
        pu2.printPurchase();
        pu2.printCostDiff(p1);

        Purchase p3 = new Purchase(new DiscountProduct("Sugar", new Byn(280), new Byn(10)), 60);
        PurchaseUtils<DiscountProduct> pu3 = new PurchaseUtils(p3);
        pu3.printPurchase();

        PurchaseUtils<Service> pu4 = new PurchaseUtils(new Purchase(new Service("Gym", new Byn(7560), 5), 2.25));

        Service i4 = pu4.getPurchase().getItem();

        System.out.println(i4);

        System.out.println("cost of pu4 = " + pu4.getPurchase().getCost());

        Purchase[]purchases = {p1, p3, pu4.getPurchase()};
        pu1.printIsSameCost(purchases);
    }
}
