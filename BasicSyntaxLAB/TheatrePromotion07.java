package ProgrammingFundamentalsJanuary2023.BasicSyntaxLAB;

import java.util.Scanner;

public class TheatrePromotion07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfTheWeek = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketCost = 0;

        if (age >= 0 && age <= 18) {
            switch (dayOfTheWeek) {
                case "Weekday" : {
                    ticketCost = 12;
                    System.out.println(ticketCost + "$");
                    break;
                }
                case "Weekend" : {
                    ticketCost = 15;
                    System.out.println(ticketCost + "$");
                    break;
                }
                case "Holiday" : {
                    ticketCost = 5;
                    System.out.println(ticketCost + "$");
                    break;
                }
            }
        } else if (age > 18 && age <= 64) {
            switch (dayOfTheWeek) {
                case "Weekday" : {
                    ticketCost = 18;
                    System.out.println(ticketCost + "$");
                    break;
                }
                case "Weekend" : {
                    ticketCost = 20;
                    System.out.println(ticketCost + "$");
                    break;
                }
                case "Holiday" : {
                    ticketCost = 12;
                    System.out.println(ticketCost + "$");
                    break;
                }
            }
        } else if (age > 64 && age <= 122) {
            switch (dayOfTheWeek) {
                case "Weekday" : {
                    ticketCost = 12;
                    System.out.println(ticketCost + "$");
                    break;
                }
                case "Weekend" : {
                    ticketCost = 15;
                    System.out.println(ticketCost + "$");
                    break;
                }
                case "Holiday" : {
                    ticketCost = 10;
                    System.out.println(ticketCost + "$");
                    break;
                }
            }
        } else {
            System.out.println("Error!");
        }
    }
}
