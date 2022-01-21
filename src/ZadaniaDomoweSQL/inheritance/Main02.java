package ZadaniaDomoweSQL.inheritance;

import ZadaniaDomoweSQL.inheritance.Circle;

public class Main02 {

    public static void main(String[] args) {
        Shape shape1 = new Shape(0, 0, "black");
        System.out.println(shape1.getDescription());

        Shape shape2 = new Shape(5, 5, "red");
        System.out.println(shape2.getDescription());

        double distance = shape1.getDistance(shape2);
        System.out.println("distance = " + distance);

        Circle circle1 = new Circle(0, 0, "blue", 5);
        System.out.println(circle1.getDescription());
        System.out.println("circle1.getCircuit() = " + circle1.getCircuit());
        System.out.println("circle1.getArea() = " + circle1.getArea());

        Circle circle2 = new Circle(10, 2, "black", 10);
        double distance1 = circle1.getDistance(circle2);
        System.out.println(distance1);

        circle1.getDistance(shape1);
        shape1.getDistance(circle1);
    }
}
