public class PurchaseUtils {
    private final Purchase purchase;

    public PurchaseUtils(Purchase purchase){
        this.purchase = purchase;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void printPurchase(){
        System.out.printf("%s;%s;%s%n",
                purchase.getItem(), purchase.getAmount(), purchase.getCost());
    }

    public void printCost(){
        System.out.printf("cost = %s BYN", purchase.getItem());
    }

    public void printCostDiff(Purchase p) {
        Byn costDiff;
        if (this.purchase.getCost().getValue() >= p.getCost().getValue()) {
            costDiff = this.purchase.getCost().substract(p.getCost());
            if (costDiff.getValue() > 0) {
                System.out.print("positive ");
            }
        }
        else {
            costDiff = p.getCost().substract(this.purchase.getCost());
            System.out.print("negative ");
        }
        System.out.printf("diff = %s BYN %n %n", costDiff);
    }

    public void printIsSameCost(Purchase[]purchases) {
        boolean areEqual = false;
        for (int i = 0; i < purchases.length; i++){
            areEqual = purchases[i].equals(this.purchase);
            if (areEqual) {
                break;
            }
        }
        if (areEqual){
            System.out.println("There is purchase among array with the same cost like this purchase");
        }
        else {
            System.out.println("There are no purchases among array with the same cost like this purchase");
        }
    }

}
