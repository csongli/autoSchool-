package ControlStructures.WhileProblems;

public class MultiplicationTableWhile {

    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;

        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= cols) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

