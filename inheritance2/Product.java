public class Product {
    private String name;
    private Byn price;

    public Product(){
        name = "";
        price = new Byn(0);
    }

    public Product(String name, Byn price){
        this.name = name;
        this.price = price;
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

    public void setPrice(Byn price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("%s;%s",
                name, price.convert());
    }
}
