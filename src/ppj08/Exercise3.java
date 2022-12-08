package ppj08;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };

        System.out.println(Arrays.toString(matrixToArray(tab)));
    }

    private static int[] matrixToArray(int[][] matrix) {
        int[] arr = new int[countMatrixElements(matrix)];

        int idx = 0;

        for (int[] row : matrix) {
            for (int col : row) {
                arr[idx++] = col;
            }
        }

        return arr;
    }

    private static int countMatrixElements(int[][] matrix) {
        int elems = 0;

        for (int[] row : matrix) {
            for (int ignored : row) {
                elems++;
            }
        }

        return elems;
    }
}