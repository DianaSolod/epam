package by.epam.lab;

public class Purchase{
    private Priceable item;
    private Number amount;

    public Purchase(Priceable item, Number amount){
        this.item = item;
        this.amount = amount;
    }

    public Priceable getItem() {
        return item;
    }

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }

    public Byn getCost() {
        return item.getPrice().multiply(amount.doubleValue(), RoundMethod.FLOOR, 2);
    }
}
