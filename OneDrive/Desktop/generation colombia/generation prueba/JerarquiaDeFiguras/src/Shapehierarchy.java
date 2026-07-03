
import java.util.ArrayList;
import java.util.List;


public class Shapehierarchy {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        // Caso 1 de la guía
        shapes.add(new Circle(1));
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Triangle(3, 4));

        // Caso 2 de la guía (bordes en 0)
        shapes.add(new Circle(0));
        shapes.add(new Rectangle(0, 5));

        // Caso adicional propio
        shapes.add(new Triangle(-1, 5));
        shapes.add(new Rectangle(4, 4));

        // Recorrido polimórfico: no importa si es Circle, Rectangle o Triangle,
        // todas responden a getArea() porque implementan Shape.
        for (Shape shape : shapes) {
            System.out.println("Área: " + shape.getArea());
        }
    }
}