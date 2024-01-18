package Arrays;

import java.util.Scanner;

public class TwoArrays {

    public static void main(String[] args) {
        String[] stringArray = new String[10];
        int[] numberArray = new int[10];

        initializeArrays(stringArray, numberArray);
        displayNumberArray(numberArray);
    }

    private static void initializeArrays(String[] stringArray, int[] numberArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 lines to fill the string array:");

        for (int i = 0; i < 10; i++) {
            stringArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            numberArray[i] = stringArray[i].length();
        }

        scanner.close();
    }

    private static void displayNumberArray(int[] numberArray) {
        System.out.println("Array of numbers:");
        for (int num : numberArray) {
            System.out.println(num);
        }
    }
}

