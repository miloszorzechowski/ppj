package ppj05;

import java.time.LocalDate;

public class Exercise1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();

        int howManyDays = day - 1;

        for (int i = 1; i < month; i++) {
            howManyDays += switch (i) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                default -> 28;
            };
        }

        System.out.println(howManyDays);
    }
}