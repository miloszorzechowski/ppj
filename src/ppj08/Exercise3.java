package ppj08;

public class Exercise3 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };

        printArray(jaggedArrayToArray(tab));
    }

    private static int[] jaggedArrayToArray(int[][] jaggedArr) {
        int[] arr = new int[countJaggedArrayElements(jaggedArr)];

        int idx = 0;

        for (int[] row : jaggedArr) {
            for (int col : row) {
                arr[idx++] = col;
            }
        }

        return arr;
    }

    private static int countJaggedArrayElements(int[][] jaggedArr) {
        int elems = 0;

        for (int[] row : jaggedArr) {
            elems += row.length;
        }

        return elems;
    }

    private static void printArray(int[] arr) {
        System.out.print('[');

        for (int i : arr) {
            System.out.print(i + ", ");
        }

        System.out.println(']');
    }
}