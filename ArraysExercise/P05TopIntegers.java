package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isTop = true;

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNum = numbers[index];

            if (index == numbers.length - 1) {
                System.out.println(currentNum);
                break;
            }

            for (int innerIndex = index + 1; innerIndex <= numbers.length - 1; innerIndex++) {
                int numToTheRight = numbers[innerIndex];

                if (currentNum <= numToTheRight) {
                    isTop = false;
                    break;

                } else {
                    isTop = true;
                }
            }
            if (isTop) {
                System.out.print(numbers[index] + " ");
            }
        }
    }
}
