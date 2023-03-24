package ww3.ntu.classes01.dominio;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";

    }

    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea(){
        this.radius = radius;
        return (Math.PI) * radius*radius;
    }

    public double getCircunferencia(){
        this.radius = radius;
        return 2*Math.PI*radius;

    }
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[ " +
                "radius=" + radius +
                ", color='" + color + '\'' +
                "]";
    }
}
