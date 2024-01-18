package Arrays;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        String[] linesArray = new String[10];
        initializeArray(linesArray);
        displayArrayInReverse(linesArray);
    }

    private static void initializeArray(String[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 8 lines to fill the array:");

        for (int i = 0; i < 8; i++) {
            array[i] = scanner.nextLine();
        }

        scanner.close();
    }

    private static void displayArrayInReverse(String[] array) {
        System.out.println("Array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
