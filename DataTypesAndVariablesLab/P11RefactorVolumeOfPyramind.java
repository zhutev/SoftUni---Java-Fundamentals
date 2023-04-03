package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double length = Double.parseDouble(scanner.nextLine());
        Double width = Double.parseDouble(scanner.nextLine());
        Double height = Double.parseDouble(scanner.nextLine());

        double volume = (length * width * height) / 3;

        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
