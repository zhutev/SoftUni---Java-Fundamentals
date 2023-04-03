package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double britishPounds = Double.parseDouble(scanner.nextLine());

        double poundsToDollars = britishPounds * 1.36;

        System.out.printf("%.3f", poundsToDollars);
    }
}
