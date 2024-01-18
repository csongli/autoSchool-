package figur;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = generateRandomShapes(10);
        displayShapes(shapes);

        // Sorting shapes by area (ascending order)
        Arrays.sort(shapes, (s1, s2) -> Double.compare(s1.calculateArea(), s2.calculateArea()));

        System.out.println("\nShapes sorted by area in ascending order:");
        displayShapes(shapes);
    }

    private static Shape[] generateRandomShapes(int size) {
        Shape[] shapes = new Shape[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomType = random.nextInt(3); // 0: Circle, 1: Square, 2: Triangle

            switch (randomType) {
                case 0:
                    shapes[i] = new Circle("Circle" + i, new int[]{random.nextInt(100), random.nextInt(100)}, random.nextDouble() * 10);
                    break;
                case 1:
                    shapes[i] = new Square("Square" + i, new int[]{random.nextInt(100), random.nextInt(100)}, random.nextDouble() * 10);
                    break;
                case 2:
                    shapes[i] = new Triangle("Triangle" + i, new int[]{random.nextInt(100), random.nextInt(100)}, random.nextDouble() * 10, random.nextDouble() * 10);
                    break;
            }
        }

        return shapes;
    }

    private static void displayShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.printf("%s, S=%.2f\n", shape.getName(), shape.calculateArea());
        }
    }
}
