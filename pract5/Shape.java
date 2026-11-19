package pract5;

public abstract class Shape implements Comparable<Shape> {

    private final String name;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String describe() {
        return String.format("%-28s площадь = %.2f; периметр = %.2f",
                name, area(), perimeter());
    }

    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.area(), other.area());
    }
}

class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super("Круг (r=" + radius + ")");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super("Прямоугольник (" + width + "x" + height + ")");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {

    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        super("Треугольник (" + a + ", " + b + ", " + c + ")");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
