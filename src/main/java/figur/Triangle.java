package figur;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, int[] coordinates, double base, double height) {
        super(name, coordinates);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
