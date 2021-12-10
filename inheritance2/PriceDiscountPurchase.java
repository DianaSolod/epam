public class PriceDiscountPurchase extends AbstractPurchase {
    private Byn discount;

    public PriceDiscountPurchase(Product product, int amount, Byn discount){
        super(product, amount);
        this.discount = discount;
    }

    public Byn getCost(){
        return new Byn(Byn.round(getProduct().getPrice().substract(discount) * getAmount()));
    }

    public String fieldsToString(){
        return String.format("%s;%s", super.fieldsToString(), discount.convert());
    }
}
