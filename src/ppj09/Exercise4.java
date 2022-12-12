package ppj09;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(splitToDigits(34567)));
    }

    private static int[] splitToDigits(int num) {
        int[] arr = new int[countDigits(num)];
        int idx = 0;

        while (num > 0) {
            arr[idx++] = num % 10;
            num /= 10;
        }

        return arr;
    }

    private static int countDigits(int num) {
        int digitsCount = 0;

        while (num > 0) {
            digitsCount++;
            num /= 10;
        }

        return digitsCount;
    }
}