package tests;

public class Histogram {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 6};
        printHistogram(arr);
    }

    private static void printHistogram(int[] arr) {
        int max = getMaxValue(arr);

        for (int row = 0; row < max; row++) {
            for (int col : arr) {
                System.out.print(col >= max - row ? "* " : "  ");
            }

            System.out.println();
        }
    }

    private static int getMaxValue(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }

        return max;
    }
}