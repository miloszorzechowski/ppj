package ppj12;

import java.util.Arrays;

public class BaseNumberConverter {
    private static double customLog(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }

    private static char[] createFilledArray(int size, char fillValue) {
        char[] array = new char[size];
        Arrays.fill(array, fillValue);

        return array;
    }

    public static String convertToAnotherBase(int number, int base) {
        int length = (int) (Math.ceil(customLog(base, Integer.MAX_VALUE)));
        char[] result = createFilledArray(length, '0');
        byte bit = 1;

        while (number > 0) {
            result[result.length - bit] = Character.forDigit(number & (base - 1), base);
            number >>= (int) customLog(2, base);
            bit++;
        }

        return String.valueOf(result);
    }
}