package ZadaniaDomoweSQL.inheritance;

public class Shape {

    private double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        return String.format("I'm a shape at (%.2f,%.2f) with beautiful %s color", x, y, color);
    }

    public double getDistance(Shape this, Shape shape) {
//        double x1 = this.x;
//        double x2 = shape.x;
//        double y1 = this.y;
//        double y2 = shape.y;
//        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));

        return Math.sqrt(Math.pow((shape.x - this.x), 2) + Math.pow((shape.y - this.y),2));
    }
}
