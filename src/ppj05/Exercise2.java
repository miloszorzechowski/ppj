package ppj05;

public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (i % 2 == 0 ? 5 : 4); j++)
                System.out.print("* ");

            System.out.print('\n' + (i % 2 == 0 ? " " : ""));
        }
    }
}