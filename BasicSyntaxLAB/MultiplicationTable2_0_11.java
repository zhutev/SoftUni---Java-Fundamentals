package ProgrammingFundamentalsJanuary2023.BasicSyntaxLAB;

import java.util.Scanner;

public class MultiplicationTable2_0_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        while (true) {
            int result = num * multiplier;
            System.out.printf("%d X %d = %d%n", num, multiplier, result);
            multiplier++;

            if (multiplier > 10) {
                break;

//        // SAME WITH DO/WHILE LOOP :
//
//         do {
//            System.out.printf("%d X %d = %d%n", num, multiplier, num * multiplier);
//             multiplier++;
//         } while (multiplier <= 10 )
            }
        }
    }
}
