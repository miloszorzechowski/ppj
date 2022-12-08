package ppj08;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr1 = getRandomArray();
        int[] arr2 = getRandomArray();
        int[] arr3 = getRandomArray();

        int[][] matrix = {arr1, arr2, arr3};

        printMatrix(matrix);
    }

    private static int[] getRandomArray() {
        int[] arr = new int[(int) (Math.random() * 10 + 1)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }

        return arr;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.print("[");

        for (int row = 0; row < matrix.length; row++){
            System.out.print('[');

            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(col < matrix[row].length - 1 ? matrix[row][col] + ", " : matrix[row][col]);
            }

            System.out.print(row < matrix.length - 1 ? "], " : ']');
        }

        System.out.println(']');
    }
}