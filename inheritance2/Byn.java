public class Byn implements Comparable<Byn>{
    private final int value;

    public Byn(){
        value = 140;
    }

    public Byn(int value){
        this.value = value;
    }

    public String convert(){
        return value / 100 + "." + value / 10 % 10 + value % 10;
    }

    @Override
    public String toString(){
        return String.format("%s", convert());
    }

    @Override
    public int compareTo(Byn byn){
        return value - byn.value;
    }

    public int multiply(double amount){
        return round(value * amount);
    }

    public int divide(int amount){
        return value / amount;
    }

    public int add(Byn amount){
        return value + amount.value;
    }

    public int substract(Byn amount){
        return value - amount.value;
    }

    public static int round(double amount){
        return (int) Math.floor(amount / 100) * 100;
    }
}