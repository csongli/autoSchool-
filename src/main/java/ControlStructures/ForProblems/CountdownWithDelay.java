package ControlStructures.ForProblems;

public class CountdownWithDelay {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100); // delay by one tenth of a second
        }

        System.out.println("Boom!");
    }
}

