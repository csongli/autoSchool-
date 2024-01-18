package ControlStructures.ConditionalStatements;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(20 + 1);

        System.out.println("Guess the number! You have 7 attempts.");

        for (int attempt = 1; attempt <= 7; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == secret) {
                System.out.println("You guessed right :)");
                scanner.close();
                return;
            } else if (guess < secret) {
                System.out.println("Little");
            } else {
                System.out.println("Many");
            }
        }

        System.out.println("I did not guess :(");
        scanner.close();
    }
}

