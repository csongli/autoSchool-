package com.welcome;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        HelloWorld.printHelloName();
        System.out.println("Hello World!");
    }
    public static void printHelloName() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name
        System.out.print("Enter your name: ");

        // Read the entered name from the console
        String name = scanner.nextLine();

        // Display the greeting
        System.out.println("Hello, " + name + "!");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
