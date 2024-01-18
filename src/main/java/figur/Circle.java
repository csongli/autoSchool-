package figur;
public class Circle extends Shape {
    private double radius;

    public Circle(String name, int[] coordinates, double radius) {
        super(name, coordinates);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

