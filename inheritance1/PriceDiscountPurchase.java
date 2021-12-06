import java.util.Scanner;

public class PriceDiscountPurchase extends Purchase{
    private Byn discount;

    public PriceDiscountPurchase(String name, Byn price, int amount, Byn discount){
        super(name, price, amount);
        this.discount = discount;
    }
    public PriceDiscountPurchase(Scanner sc) {
        super(sc);
        this.discount = new Byn(sc.nextInt());
    }

    public Byn getCost(){
        Byn cost = new Byn((getPrice().substract(discount)).multiply(getAmount()));
        return cost;
    }

    public String fieldsToString(){
        return String.format("%s;%s", super.fieldsToString(), discount.toString());
    }

    @Override
    public String toString(){
        return String.format("%s;%s;",
                fieldsToString(), getCost().convert());
    }

}
