package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        // WITH OLD FOR LOOP :
//        for (int i = 0; i < numbersArr.length; i++) {
//            int currentNum = numbersArr[i];

        for (int eachElement: numbersArr) {
            if (eachElement % 2 == 0) {
                evenSum += eachElement;
            } else {
                oddSum += eachElement;
            }
        }
        int difference = evenSum - oddSum;
        System.out.println(difference);
    }
}
