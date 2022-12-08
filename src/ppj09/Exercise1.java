package ppj09;

public class Exercise1 {
    public static void main(String[] args) {
        printMonth(11, 2022);
    }

    private static void printMonth(int m, int y) {
        int firstDay = getWeekDay(1, m, y);
        int lastDay = switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 -> getWeekDay(31, m, y);
            case 2 -> (y % 4 == 0 && y % 100 > 0) || y % 400 == 0 ? getWeekDay(29, m, y) : getWeekDay(28, m, y);
            default -> getWeekDay(30, m, y);
        };

        for (int row = 0, day = 1; row <= 4; row++) {
            for (int col = 1; col <= 7; col++) {
                if ((row == 0 && col < firstDay) || (row == 4 && col > lastDay)) {
                    System.out.print("   ");
                } else if (day > 9){
                    System.out.print(day++ + " ");
                } else {
                    System.out.print(" " + day++ + " ");
                }
            }

            System.out.println();
        }
    }

    private static int getWeekDay(int day, int month, int year) {
        month -= 2;

        if (month < 1) {
            month += 12;
            year -= 1;
        }

        int century = year / 100;
        year %= 100;

        return ((26 * month - 2) / 10 + day + year + year / 4 + century / 4 + 5 * century) % 7;
    }
}