package figur;

public abstract class Shape {
    private String name;
    private int[] coordinates;

    public Shape(String name, int[] coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public abstract double calculateArea();
}

