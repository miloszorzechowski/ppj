import java.util.Arrays;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Change: ");
        double amount = sc.nextDouble();

        double[] denominations = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100, 200, 500};
        long[] counter = new long[denominations.length];

        while (amount > 0) {
            int index = Arrays.binarySearch(denominations, amount);
            index = index < 0 ? index * (-1) - 2 : index;
            counter[index] += (long) (amount / denominations[index]);
            amount = (double) Math.round((amount - counter[index] * denominations[index]) * 100) / 100;
        }

        for (int i = counter.length - 1; i >= 0; i--) {
            if (counter[i] > 0)
                System.out.println(counter[i] + " * " + denominations[i] + (denominations[i] > 1 ? " zl" : " gr"));
        }
    }
}