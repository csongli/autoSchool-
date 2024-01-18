package Arrays;

import java.util.Scanner;

public class MaxNumberInArray {

    public static void main(String[] args) {
        int[] numbers = initializeArray();
        int maxNumber = findMax(numbers);
        System.out.println("Maximum number in the array: " + maxNumber);
    }

    private static int[] initializeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 20 numbers to fill the array:");
        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        return array;
    }

    private static int findMax(int[] array) {
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
