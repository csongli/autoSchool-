package ControlStructures.WhileProblems;

import java.util.Scanner;

public class RepeatStringWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the number of times to repeat the string: ");
        int n = scanner.nextInt();

        int count = 0;
        while (count < n) {
            System.out.println(inputString);
            count++;
        }

        scanner.close();
    }
}

