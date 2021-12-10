import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("src/in.txt"))) {
            final int PURCHASES_NUMBER = 6;
            Purchase purchases[] = new Purchase[PURCHASES_NUMBER];
            Byn maxCost = new Byn(0);
            int maxInd = 0;
            boolean areEqual = true;
            for (int i = 0; i < purchases.length; i++){
                purchases[i] = PurchasesFactory.getPurchaseFromFactory(sc);
                System.out.println(purchases[i]);
                if(purchases[i].getCost().compareTo(maxCost) > 0){
                    maxCost = purchases[i].getCost();
                    maxInd = i;
                }
                if (areEqual) {
                    areEqual = purchases[i].equals(purchases[0]);
                }
            }
            System.out.println("Purchase with maximum cost: " + purchases[maxInd]);
            if (areEqual){
                System.out.println("All purchases are equal");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Input file is not found");
        }
    }
}
