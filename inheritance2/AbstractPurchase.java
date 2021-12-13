public abstract class AbstractPurchase implements Comparable<AbstractPurchase>{
    private final Product product;
    private int amount;

    public AbstractPurchase(){
        product = new Product();
        amount = 0;
    }

    public AbstractPurchase(Product product,int amount){
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    protected abstract Byn getFinalCost(Byn baseCost);

    public Byn getCost() {
        Byn baseCost = product.getPrice().multiply(amount);
        Byn finalCost = getFinalCost(baseCost);
		return finalCost.round(Byn.RoundMethod.FLOOR, 2);
    }

    public String fieldsToString(){
        return String.format("%s;%s",
                product, amount);
    }

    @Override
    public String toString(){
        return String.format("%s;%s;" ,
                fieldsToString(), getCost());
    }

    @Override
    public int compareTo(AbstractPurchase purchase) {
        return purchase.getCost().compareTo(getCost());
    }
}
