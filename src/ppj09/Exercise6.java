package ppj09;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(calculateSquares(10, 6, 2)));
    }

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
        int horizontalSquares = screenWidth / side;
        int verticalSquares = screenHeight / side;
        int squaresCount = horizontalSquares * verticalSquares;

        int[][] coords = new int[2][squaresCount];

        for (int row = 0, idx = 0, y = 0; row <= screenHeight / verticalSquares; row++, y += 2) {
            for (int col = 0; col < horizontalSquares; col++) {
                coords[0][idx] = col * (screenWidth / horizontalSquares);
                coords[1][idx] = y;
                idx++;
            }
        }

        return coords;
    }
}