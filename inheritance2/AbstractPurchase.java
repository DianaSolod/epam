public abstract class AbstractPurchase implements Comparable<AbstractPurchase>{
    private Product product;
    private int amount;

    public AbstractPurchase(){
    }

    public AbstractPurchase(Product product, int amount){
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Byn getCost(){
        return new Byn(product.getPrice().multiply(amount));
    }

    public String fieldsToString(){
        return String.format("%s;%s",
                product, amount);
    }

    @Override
    public String toString(){
        return String.format("%s;%s;" ,
                fieldsToString(), getCost().convert());
    }

    @Override
    public int compareTo(AbstractPurchase purchase) {
        return purchase.getCost().substract(getCost());
    }

}
