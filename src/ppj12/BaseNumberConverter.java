package ppj12;

import java.util.Arrays;

public class BaseNumberConverter {
    public static void main(String[] args) {
        int number = 127;

        System.out.println(convertToNBase(127, 2));
        System.out.println(convertToNBase(127, 4));
        System.out.println(convertToNBase(127, 8));
        System.out.println(convertToNBase(127, 16));
    }

    private static double customLog(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }

    private static char[] createFilledArray(int size) {
        char[] array = new char[size];
        Arrays.fill(array, '0');

        return array;
    }

    private static String convertToNBase(int number, int base) {
        int length = (int) (Math.ceil(customLog(base, Integer.MAX_VALUE)));
        char[] result = createFilledArray(length);
        byte bit = 1;

        while (number > 0) {
            result[result.length - bit] = Character.forDigit(number & (base - 1), base);
            number >>= (int) customLog(2, base);
            bit++;
        }

        return String.valueOf(result);
    }
}