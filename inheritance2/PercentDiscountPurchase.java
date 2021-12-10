public class PercentDiscountPurchase extends AbstractPurchase{
    private final static int MINIMUM = 3;
    private double discount;

    public PercentDiscountPurchase(Product product, int amount, double discount){
        super(product, amount);
        this.discount = discount;
    }

    public Byn getCost(){
        Byn cost = super.getCost();
        if (getAmount() >= MINIMUM) {
            return new Byn(cost.multiply(1 - discount / 100));
        }
        else return cost;
    }

    public String fieldsToString(){
        return String.format("%s;%.3f", super.fieldsToString(), discount);
    }
}
