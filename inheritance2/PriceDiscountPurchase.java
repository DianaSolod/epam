public class PriceDiscountPurchase extends AbstractPurchase {
    private Byn discount;

    public PriceDiscountPurchase(Product product, int amount, Byn discount){
        super(product, amount);
        this.discount = discount;
    }

    protected Byn getFinalCost(Byn baseCost){
       return baseCost.substract(discount.multiply(getAmount()));
    }

    public String fieldsToString(){
        return String.format("%s;%s", super.fieldsToString(), discount);
    }
}
