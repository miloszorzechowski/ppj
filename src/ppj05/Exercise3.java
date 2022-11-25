package ppj05;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /*
         * >= 90% - 5
         * 84%-89% - 4+
         * 76%-84% - 4
         * 68%-83% - 3+
         * 50%-67% - 3
         * <= 49% - 2
         */


        Scanner sc = new Scanner(System.in);

        System.out.print("Points: ");
        float points = sc.nextFloat();

        System.out.print("Max points: ");
        float maxPoints = sc.nextFloat();

        byte percentage = (byte) (points / maxPoints * 100);

        System.out.println("Grade: " + (percentage >= 90 ? "5" : percentage >= 84 ? "4+" : percentage >= 76 ? "4" : percentage >= 68 ? "3+" : percentage >= 50 ? 3 : 2));
    }
}
