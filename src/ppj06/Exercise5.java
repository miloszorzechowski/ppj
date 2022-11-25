package ppj06;

public class Exercise5 {
    public static void main(String[] args) {
        int size = 4;
        int width = 2 * size + 1;

        for(int i = 1; i <= width; i++){
            int stars = i <= width / 2 + 1 ? 2 * i - 1 : 2 * (width - i + 1) - 1;
            int dots = (width - stars) / 2;

            for(int j = 0; j < dots; j++) System.out.print(". ");

            for(int j = 0; j < stars; j++) System.out.print("* ");

            for(int j = 0; j < dots; j++) System.out.print(". ");

            System.out.println();
        }

    }

}