public class Exercise4 {
    public static void main(String[] args) {
        int n = 5;
        int size = 2 * n + 1;

        for (int i = 0; i < size; i++) {
            int stars = i < size / 2 + 1 ? 2 * i + 1 : 2 * (size - i) - 1;

            for (int j = 0; j < size - stars; j++)
                System.out.print(" ");

            for (int j = 0; j < stars; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}