package ProgrammingFundamentalsJanuary2023.BasicSyntaxLAB;

import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int times = 1;

        while (times <= 10) {
            System.out.printf("%d X %d = %d%n", number, times, number * times);

            times++;

//      SAME EXAMPLE WITH FOR LOOP :
//
//            int num = Integer.parseInt(scanner.nextLine());
//
//            for (int i = num; i == num; i++) {
//                for (int j = 1; j <= 10; j++) {
//                    int result = i * j;
//                    System.out.printf("%d X %d = %d%n", i, j, result);
        }
    }
}

