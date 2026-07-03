public class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius <= 0) {
            return 0;
        }
        return Math.PI * radius * radius;
    }


    public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(0);
    Circle c3 = new Circle(-5);
    Circle c4 = new Circle(1);

        System.out.println("Circle(3)  -> área esperada ≈28.27  | obtenida: " + c1.getArea());
        System.out.println("Circle(0)  -> área esperada 0       | obtenida: " + c2.getArea());
        System.out.println("Circle(-5) -> área esperada 0       | obtenida: " + c3.getArea());
        System.out.println("Circle(1)  -> área esperada ≈3.14159| obtenida: " + c4.getArea());
    }
}