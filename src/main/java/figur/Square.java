package figur;

public class Square extends Shape {
    private double sideLength;

    public Square(String name, int[] coordinates, double sideLength) {
        super(name, coordinates);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}
