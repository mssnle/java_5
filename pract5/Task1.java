package pract5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle(1.5));
        shapes.add(new Triangle(3, 4, 5));
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(2, 2));

        printAll(shapes);

        double total = 0;
        for (Shape s : shapes) {
            total += s.area();
        }
        System.out.printf("%nСуммарная площадь: %.2f%n", total);

        Collections.sort(shapes);
        printAll(shapes);

        System.out.println("\nСамая большая фигура: " + Collections.max(shapes).getName());
        System.out.println("Самая маленькая фигура: " + Collections.min(shapes).getName());

        Shape one = new Triangle(6, 6, 6);
        System.out.println(one.describe());
    }

    private static void printAll(List<Shape> shapes) {
        for (Shape s : shapes) {
            System.out.println(s.describe());
        }
    }
}
