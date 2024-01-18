package ControlStructures.WhileProblems;

public class SquareOfLettersWhile {

    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

