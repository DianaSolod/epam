//package by.epam.lab;

public class DiscountProduct extends Product{
    private Byn discount;

    public DiscountProduct(String name, Byn price, Byn discount){
        super(name, price);
        this.discount = discount;
    }

    public Byn getPrice() {
        return super.getPrice().substract(discount);
    }

    public String fieldsToString(){
        return String.format("%s;%s",
                super.fieldsToString(), discount);
    }
}