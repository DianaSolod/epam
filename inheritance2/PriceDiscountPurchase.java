public class PriceDiscountPurchase extends AbstractPurchase {
    private Byn discount;

    public PriceDiscountPurchase(Product product, int amount, Byn discount){
        super(product, amount);
        this.discount = discount;
    }

    public Byn getCost(){
        Byn cost = new Byn(Byn.round(getProduct().getPrice().substract(discount) * getAmount()));
        return cost;
    }

    public String fieldsToString(){
        return String.format("%s;%s", super.fieldsToString(), discount.convert());
    }
}
