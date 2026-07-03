public class Triangle implements Shape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;


    }

    @Override
    public double getArea() {
        // Validación: base y altura deben ser positivas
        if (base <= 0 || height <= 0) {
            return 0;
        }
        return (base * height) / 2;
    }

        public static void main(String[] args) {
            Triangle t1 = new Triangle(6, 6);
            Triangle t2 = new Triangle(6, 6);
            Triangle t3 = new Triangle(6, 6);
            Triangle t4 = new Triangle(6, 6);


            System.out.println("Triangle(6,6)  -> esperada 18| obtenida: " + t1.getArea());
            System.out.println("Triangle(0,6)  -> esperada 0 | obtenida: " + t2.getArea());
            System.out.println("Triangle(-2,8) -> esperada 0 | obtenida: " + t3.getArea());
            System.out.println("Triangle(10,0) -> esperada 0 | obtenida: " + t4.getArea());
        }
    }
