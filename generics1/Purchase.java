package by.epam.lab;

public class Purchase<T extends Priceable>{
    private T item;
    private Number amount;

    public Purchase(T item, Number amount){
        this.item = item;
        this.amount = amount;
    }

    public T getItem() {
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
