package ZadaniaDomoweSQL.inheritance;

public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public double getCircuit() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" and I'm also lovely circle with %.2f radius", radius);
//        String parentDesc = super.getDescription();
//        return parentDesc + String.format(" and I'm also lovely circle with %.2f radius", radius);
    }
}
