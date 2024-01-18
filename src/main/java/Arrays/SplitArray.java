package Arrays;

import java.util.Scanner;

public class SplitArray {

    public static void main(String[] args) {
        int[] largeArray = new int[20];
        initializeLargeArray(largeArray);

        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        splitLargeArray(largeArray, smallArray1, smallArray2);

        System.out.println("Second small array:");
        displayArray(smallArray2);
    }

    private static void initializeLargeArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 20 numbers to fill the large array:");

        for (int i = 0; i < 20; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
    }

    private static void splitLargeArray(int[] largeArray, int[] smallArray1, int[] smallArray2) {
        for (int i = 0; i < 10; i++) {
            smallArray1[i] = largeArray[i];
            smallArray2[i] = largeArray[i + 10];
        }
    }

    private static void displayArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }
}

