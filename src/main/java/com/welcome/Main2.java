package com.welcome;

import com.welcome.Hello;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Hello helloInstance = new Hello();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Set up the name in the Hello class
        helloInstance.setupName(userName);

        // Greet the user
        helloInstance.welcome();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Say goodbye
        helloInstance.byeBye();
    }
}
