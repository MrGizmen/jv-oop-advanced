package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius , String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public void draw() {
        System.out.println("Figure: circle" + ", area: " + getArea() + " sq. units, radius: " + radius + " units, color: " + getColor());
    }
}
