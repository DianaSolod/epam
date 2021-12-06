public class Byn implements Comparable<Byn>{
    private int value;

    public Byn(){
    }

    public Byn(int value){
        this.value = value;
    }

    public Byn(int rubs, int coins){
        this(rubs * 100 + coins);
    }

    public Byn(Byn byn){
        this(byn.value);
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

    public Byn multiply(int amount){
        this.value *= amount;
        return this;
    }

    public Byn divide(int amount){
        this.value /= amount;
        return this;
    }

    public Byn add(Byn amount){
        this.value += amount.value;
        return this;
    }

    public Byn substract(Byn amount){
        this.value = value - amount.value;
        return this;
    }

    public enum RoundMethod {
        FLOOR {
            double roundFunction(double d) {
                return Math.floor(d);
            }
        },
        ROUND {
            double roundFunction(double d) {
                return Math.round(d);
            }
        },
        CEIL {
            double roundFunction(double d) {
                return Math.ceil(d);
            }
        };

        abstract double roundFunction(double value);
        int round(double roundedValue, RoundMethod roundMethod, int d) {
            int[] tenPowD = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
            int tenPow = tenPowD[d];
            int result = (int) roundMethod.roundFunction(roundedValue / tenPow) * tenPow;
            return result;
        }
    }

    private static int round(double roundedValue, RoundMethod roundMethod, int d) {
        int[] tenPowD = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
        int tenPow = tenPowD[d];
        int result = (int) roundMethod.roundFunction(roundedValue / tenPow) * tenPow;
        return result;
    }

    public Byn multiply(double k, RoundMethod roundMethod, int d){
        value = round(value * k, roundMethod, d);
        return this;
    }

    public Byn round(RoundMethod roundMethod, int d){
        value = round(value, roundMethod, d);
        return this;
    }
}
