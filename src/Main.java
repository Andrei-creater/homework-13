public class Main {
    public static void main(String[] args) {
        GeometricShape[] shapes = new GeometricShape[] {
                new Circle(5),      // Коло з радіусом 5
                new Triangle(6, 4), // Трикутник з основою 6 і висотою 4
                new Square(3)       // Квадрат зі стороною 3
        };
        System.out.printf("Сумарна площа всіх фігур: %.2f%n", getTotalArea(shapes));
    }
    public static double getTotalArea(GeometricShape[] shapes) {
        double totalArea = 0;
        for (GeometricShape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
