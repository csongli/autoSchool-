package ControlStructures.ConditionalStatements;

import java.util.Scanner;

public class MaxOfFourNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four numbers:");

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum of the four numbers is: " + max);

        scanner.close();
    }
}
