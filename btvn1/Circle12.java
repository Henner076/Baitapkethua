package btvn1;

public class Circle12 {
    private double radius=1.0;

    public Circle12() {
    }

    public Circle12(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle12[" +
                "radius=" + radius +
                ']';
    }
}
