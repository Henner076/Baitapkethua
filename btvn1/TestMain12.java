package btvn1;

public class TestMain12 {
    public static void main(String[] args) {
        // Test Constructors and toString()
        Circle12 c1 = new Circle12(1.1);
        System.out.println(c1);   // toString()
        Circle12 c2 = new Circle12(); // default constructor
        System.out.println(c2);

        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1);      // toString()
        System.out.println("radius is: " + c1.getRadius());

        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
