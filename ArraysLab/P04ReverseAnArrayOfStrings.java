package ArraysLab;

import java.util.Scanner;

public class P04ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        // SOLUTION WITH NEW METHODS AND PRINCIPLES :
        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldElement = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", inputArr));
    }
}
// SOLUTION WITH AN OLD METHODS AND PRINCIPLES:
//        for (int i = inputArr.length - 1 ; i >= 0 ; i--) {
//            System.out.printf("%s ", inputArr[i]);

