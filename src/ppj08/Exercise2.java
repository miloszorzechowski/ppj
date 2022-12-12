package ppj08;

public class Exercise2 {
    public static void main(String[] args) {
        float[][] matrix = getRandomMatrix(8);

        printMatrix(matrix);

        System.out.println("Left diagonal: " + sumDiagonalElements(matrix, 'l'));
        System.out.println("Right diagonal: " + sumDiagonalElements(matrix, 'r'));
    }

    private static float[][] getRandomMatrix(int size) {
        float[][] matrix = new float[size][size];

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
            int col = 0;

            for (float[] row : matrix) {
                sum += row[col++];
            }
        } else if (diagonal == 'l') {
            int col = matrix[0].length - 1;

            for (float[] row : matrix) {
                sum += row[col--];
            }
        }

        return sum;
    }

    private static void printMatrix(float[][] matrix) {
        System.out.println('[');

        for (float[] row : matrix){
            System.out.print("    [");

            for (float col : row) {
                System.out.print(col + ", ");
            }

            System.out.println(']');
        }

        System.out.println(']');
    }
}