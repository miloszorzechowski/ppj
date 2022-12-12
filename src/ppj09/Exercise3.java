package ppj09;

public class Exercise3 {
    private static boolean jestRowna(int[][] jaggedArr1, int[][] jaggedArr2) {
        if (jaggedArr1.length != jaggedArr2.length) {
            return false;
        }

        for (int row = 0; row < jaggedArr1.length; row++) {
            if (jaggedArr1[row].length != jaggedArr2[row].length) {
                return false;
            }

            for (int col = 0; col < jaggedArr1[row].length; col++) {
                if (jaggedArr1[row][col] != jaggedArr2[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }
}