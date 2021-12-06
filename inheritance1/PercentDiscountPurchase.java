import java.util.Scanner;

public class PercentDiscountPurchase extends Purchase{
    private final static int MINIMUM_AMOUNT = 3;
    private double discount;

    public PercentDiscountPurchase(String name, Byn price, int amount, double discount){
        super(name, price, amount);
        this.discount = discount;
    }
    public PercentDiscountPurchase(Scanner sc) {
        super(sc);
        this.discount = sc.nextDouble();
    }

    public Byn getCost(){
        Byn cost = super.getCost();;
        if (getAmount() >= MINIMUM) {
            cost.multiply(1 - discount / 100, Byn.RoundMethod.ROUND, 3);
        }
        return cost;
    }

    public String fieldsToString(){
        return String.format("%s;%.3f", super.fieldsToString(), discount);
    }

    @Override
    public String toString(){
        return String.format("%s;%s;",
                fieldsToString(), getCost().convert());
    }
}
