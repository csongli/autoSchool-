package Arrays;

import java.util.Scanner;

public class ReverseOrderNumbersArray {

    public static void main(String[] args) {
        int[] numbersArray = new int[10];
        initializeNumbersArray(numbersArray);
        reverseOrder(numbersArray);
    }

    private static void initializeNumbersArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers to fill the array:");

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
    }

    private static void reverseOrder(int[] array) {
        System.out.println("Array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

