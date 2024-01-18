package ControlStructures.ConditionalStatements;

import java.util.Scanner;

public class DescendingOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        java.util.Arrays.sort(numbers);

        System.out.println("Numbers in descending order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
