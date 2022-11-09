public class Exercise24 {
    public static void main(String[] args) {
        long n = 9;
        int col_width = String.valueOf(n * n * n * n).length();

        for (int i = 1; i <= n; i++) {
            long power_result = i;

            for (int j = 0; j < 3; j++) {
                power_result *= i;
                System.out.printf("%" + col_width + "d | ", power_result);
            }

            System.out.println();
        }
    }
}