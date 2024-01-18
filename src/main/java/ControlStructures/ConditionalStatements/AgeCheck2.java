package ControlStructures.ConditionalStatements;

import java.util.Scanner;

public class AgeCheck2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 20) {
            System.out.println("And 18 is enough, " + name + "!");
        }

        scanner.close();
    }
}

