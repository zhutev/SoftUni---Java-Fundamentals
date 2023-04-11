package ArraysLab;

import java.sql.Array;
import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            nums[i] = currentNum;
        }
        for (int i = nums.length - 1; i >= 0 ; i--) {
            System.out.printf("%d ", nums[i]);

        }
    }
}
