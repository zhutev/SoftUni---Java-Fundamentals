package DataTypesAndVariablesLab;

import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (letter >= 65 && letter <= 90) {
            /// letter == 'A' && letter <= 'Z'
            /// Character.isUppercase(letter)
            System.out.println("upper-case");
        } else {
            /// else if (letter == 'a' ** letter <= 'z')
            /// else if (Character.isUppercase(letter))
            System.out.println("lower-case");
        }
    }
}
