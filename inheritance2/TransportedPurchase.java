public class TransportedPurchase extends AbstractPurchase {
    private Byn expenses;

    public TransportedPurchase(Product product, int amount, Byn expenses){
        super(product, amount);
        this.expenses = expenses;
    }

    public Byn getCost(){
        Byn cost = super.getCost();
        return new Byn(Byn.round(cost.add(expenses)));
    }

    public String fieldsToString(){
        return String.format("%s;%s", super.fieldsToString(), expenses.convert());
    }
}
