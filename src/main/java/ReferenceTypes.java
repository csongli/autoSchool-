import java.util.Scanner;

public class ReferenceTypes {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Print first, last, and middle characters
        if (!inputString.isEmpty()) {
            System.out.println("First character: " + inputString.charAt(0));

            if (inputString.length() % 2 == 0) {
                System.out.println("Middle characters: " + inputString.substring(inputString.length() / 2 - 1, inputString.length() / 2 + 1));
            } else {
                System.out.println("Middle character: " + inputString.charAt(inputString.length() / 2));
            }

            System.out.println("Last character: " + inputString.charAt(inputString.length() - 1));
        }

        // Print part of the string up to the first dot
        int dotIndex = inputString.indexOf('.');
        if (dotIndex != -1) {
            String partBeforeDot = inputString.substring(0, dotIndex + 1);
            System.out.println("Part up to the first dot: " + partBeforeDot);
        }

        // Count spaces
        int spaceCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Number of spaces: " + spaceCount);

        scanner.close();
    }

    private static void task2() {
        Scanner scanner = new Scanner(System.in);

        // Task 2
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String substringToReplace = scanner.nextLine();

        System.out.print("Enter the new substring: ");
        String newSubstring = scanner.nextLine();

        // Replace specified substring
        String resultString = originalString.replace(substringToReplace, newSubstring);

        System.out.println("Result after replacement: " + resultString);

        scanner.close();
    }

    private static void task3() {
        Scanner scanner = new Scanner(System.in);

        // Task 3
        System.out.print("Enter a string of words separated by spaces: ");
        String inputWords = scanner.nextLine();

        // Find the longest word
        String[] wordsArray = inputWords.split(" ");
        String longestWord = "";

        for (String word : wordsArray) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);

        scanner.close();
    }
}