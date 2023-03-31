package ProgrammingFundamentalsJanuary2023.BasicSyntaxLAB;

import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesPlus30 = minutes + 30;
        // int allconvertedInMinutes = (hours * 60) + minutes + 30;
        // int updated hours = allconvertedInMinutes / 60;
        // int updated minutes = allconvertedInMinutes % 60;

        if (minutesPlus30 > 59) {
            hours++;
            minutesPlus30 = minutesPlus30 - 60;

        } if (hours > 23) {
            hours = hours - 24;
        }
        System.out.printf("%01d:%02d", hours, minutesPlus30);
    }
}
