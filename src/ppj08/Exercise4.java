package ppj08;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printMatrixSpiral(tab);
    }

    private static void printMatrixSpiral(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int right = cols - 1;
        int bottom = rows - 1;
        int left = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right]+ " ");
            }
            right--;

            for (int i = right; i >= left; i--) {
                System.out.print(matrix[bottom][i]+ " ");
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][left]+ " ");
            }
            left++;
        }
    }
}