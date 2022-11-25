package ppj05;

import java.time.LocalDate;

public class Exercise1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();

        int days_passed = day - 1;

        for (int i = 1; i < month; i++) {
            days_passed += switch (i) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                default -> date.isLeapYear() ? 29 : 28;
            };
        }

        System.out.printf("It has been %d days since the beginning of the year.", days_passed);
    }
}