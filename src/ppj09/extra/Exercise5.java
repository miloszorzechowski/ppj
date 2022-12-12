package ppj09.extra;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(pow(2, 2));
    }

    private static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }

    private static void printArrayRec(int[] arr, int startIdx) {
        if (startIdx < arr.length) {
            System.out.print(arr[startIdx] + " ");
            printArrayRec(arr, startIdx + 1);
        }
    }

    private static int countDigits(int num) {
        int digitsCount = 0;

        while (num > 0) {
            digitsCount++;
            num /= 10;
        }

        return digitsCount;
    }

    private static int countDigitsRec(int num) {
        if (num > -10 && num < 10) {
            return 1;
        } else {
            return countDigitsRec(num / 10) + 1;
        }
    }

    private static int pow(int num, int pow) {
        if (num == 0) {
            return 1;
        }

        int result = num;

        for (int i = 1; i < pow; i++) {
            result *= num;
        }

        return result;
    }

    private static int powRec(int num, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return num * powRec(num, pow - 1);
        }
    }
}