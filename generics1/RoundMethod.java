//package by.epam.lab;

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