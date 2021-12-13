public class TransportedPurchase extends AbstractPurchase {
    private Byn expenses;

    public TransportedPurchase(Product product, int amount, Byn expenses){
        super(product, amount);
        this.expenses = expenses;
    }

    protected Byn getFinalCost(Byn baseCost){
        return baseCost.add(expenses).round(Byn.RoundMethod.FLOOR,2);
    }

    public String fieldsToString(){
        return String.format("%s;%s", super.fieldsToString(), expenses);
    }
}
