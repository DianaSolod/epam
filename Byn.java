public class Byn{
    private final int value;

    public Byn(){
        this(0);
    }

    public Byn(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString(){
        return value / 100 + "." + value / 10 % 10 + value % 10;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Byn byn = (Byn) obj;
        return byn.value == this.value;
    }

    public Byn multiply(double amount, RoundMethod roundMethod, int d){
        return new Byn(round(value * amount, roundMethod, d));
    }

    public Byn add(Byn amount){
        return new Byn(value + amount.value);
    }

    public Byn substract(Byn amount){
        return new Byn(value - amount.value);
    }

    public int round(double roundedValue, RoundMethod roundMethod, int d) {
        int[] tenPowD = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
        int tenPow = tenPowD[d];
        int result = (int) roundMethod.roundFunction(roundedValue / tenPow) * tenPow;
        return result;
    }

    public Byn round(RoundMethod roundMethod, int d){
        return new Byn(round(value, roundMethod, d));
    }
}
