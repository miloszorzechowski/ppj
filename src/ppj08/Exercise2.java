package ppj08;

public class Exercise2 {
    public static void main(String[] args) {
        float[][] matrix = getRandomMatrix(8, 8);

        printMatrix(matrix);

        System.out.println("Left diagonal: " + sumDiagonalElements(matrix, 'r'));
        System.out.println("Right diagonal: " + sumDiagonalElements(matrix, 'l'));
    }

    private static float[][] getRandomMatrix(int rows, int cols) {
        float[][] matrix = new float[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (float) (Math.random() * 10);
            }
        }

        return matrix;
    }

    private static float sumDiagonalElements(float[][] matrix, char diagonal) {
        float sum = 0;

        if (diagonal == 'r') {
            byte col = 0;

            for (float[] row : matrix) {
                sum += row[col++];
            }
        } else if (diagonal == 'l') {
            byte col = (byte) (matrix[0].length - 1);

            for (float[] row : matrix) {
                sum += row[col--];
            }
        }

        return sum;
    }

    private static void printMatrix(float[][] matrix) {
        System.out.println("[");

        for (int row = 0; row < matrix.length; row++){
            System.out.print("    [");

            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(col < matrix[row].length - 1 ? matrix[row][col] + ", " : matrix[row][col]);
            }

            System.out.println(row < matrix.length - 1 ? "], " : ']');
        }

        System.out.println(']');
    }
}