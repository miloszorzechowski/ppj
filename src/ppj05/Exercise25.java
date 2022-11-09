public class Exercise25 {
    public static void main(String[] args) {
        int size = 4;

        for (int i = 0; i < 2 * size + 1; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(". ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < size - i; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}
