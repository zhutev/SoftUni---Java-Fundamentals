package ArraysExercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String firstElementSecondArray : secondArray) {

            for (String firstElementFirstAray : firstArray) {
                if (firstElementSecondArray.equals(firstElementFirstAray)) {
                    System.out.print(firstElementFirstAray + " ");
                    break;
                }
            }
        }
    }
}
