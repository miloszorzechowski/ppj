package tests;

public class Test {
    public static void main(String[] args) {
        int[] arr = {7, 2, 10, 3, 5};
        System.out.println(maxElem(arr, 3));
    }

    private static int maxElem(int[] arr, int from) {
        if (from > 0 && from < arr.length)
            return Math.max(arr[from], maxElem(arr, from + 1));
        else if (from == arr.length - 1)
            return arr[0];
        return 0;
    }
}