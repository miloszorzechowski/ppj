package ppj09;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }

    private static boolean isArmstrongNumber(int num) {
        int assumptionResult = 0;
        int digitsCount = countDigits(num);
        int tmp = num;

        while (tmp > 0) {
            assumptionResult += (int) (Math.pow(tmp % 10, digitsCount));
            tmp /= 10;
        }

        return assumptionResult == num;
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