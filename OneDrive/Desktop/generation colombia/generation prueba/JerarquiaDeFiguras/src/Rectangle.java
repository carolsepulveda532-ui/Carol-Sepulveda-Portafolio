public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        if (width <= 0 || height <= 0) {
            return 0;
        }
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(0,0);
        Rectangle r3 = new Rectangle(-4, 5);
        Rectangle r4 = new Rectangle(7,2);

        System.out.println("Rectangle(10,10) -> obtenida: " + r1.getArea());
        System.out.println("Rectangle(0,0)   -> esperada 0 | obtenida: " + r2.getArea());
        System.out.println("Rectangle(-4,5)  -> esperada 0 | obtenida: " + r3.getArea());
        System.out.println("Rectangle(7,2)   -> esperada 14| obtenida: " + r4.getArea());
    }
}

