package ControlStructures.ForProblems;

import java.util.Scanner;

public class RepeatNameFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name + " loves me.");
        }

        scanner.close();
    }
}

