import java.util.Scanner;
import java.lang.Integer;

public class Purchase {
    private String name;
    private Byn price;
    private int amount;

    public Purchase(){
        name = "";
        price = new Byn(0);
        amount = 0;
    }

    public Purchase(String name, Byn price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Purchase(Scanner sc) {
        name = sc.next();
        price = new Byn(sc.nextInt());
        amount = sc.nextInt();
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public Byn getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(Byn price) {
        this.price = price;
    }

    public Byn getCost(){
        Byn cost = new Byn(price.multiply(amount));
        price.divide(amount);
        return cost;
    }

    public String fieldsToString(){
        return String.format("%s;%s;%d",
                name, price.convert(), amount);
    }

    @Override
    public String toString(){
        return String.format("%s;%s;",
                fieldsToString(), getCost().convert());
    }

    @Override
    public boolean equals(Object obj){
        if (! (obj instanceof Purchase)) {
            return false;
        }
        else {
            Purchase purchase = (Purchase) obj;
            return name.equals(purchase.name) & price.compareTo(purchase.price) == 0;
        }
    }

}
