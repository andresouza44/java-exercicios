package classes.metodos.composition.teste;

import classes.metodos.composition.dominio.Point;

public class Circle {
    private Point center = new Point(0,0);
    private double radius = 0;

    public Circle() {
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(int xCenter, int yCenter, double radius){
        center.setX(xCenter);
        center.setY(yCenter);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getCenterX (){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterY (){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int [] getCenterXY (){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }


    @Override
    public String toString() {
        return ("Centro do círculo " + center.toString() + " raio =" + radius);
    }

    public double getArea(){
        return Math.PI * radius * radius;

    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public double distance(Circle circulo2){
        return center.distance(circulo2.center);
    }
}





