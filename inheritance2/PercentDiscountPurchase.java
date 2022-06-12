public class PercentDiscountPurchase extends AbstractPurchase{
    private final static int MINIMUM = 3;
    private double discount;

    public PercentDiscountPurchase(Product product, int amount, double discount){
        super(product, amount);
        this.discount = discount;
    }

    protected Byn getFinalCost(Byn baseCost){
        if (getAmount() >= MINIMUM) {
            return baseCost.multiply(1 - discount / 100);
        }
        else return baseCost;
    }

    public String fieldsToString(){
        return String.format("%s;%.2f", super.fieldsToString(), discount);
    }
}
