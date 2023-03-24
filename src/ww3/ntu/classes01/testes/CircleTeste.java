package ww3.ntu.classes01.testes;

import ww3.ntu.classes01.dominio.Circle;

public class CircleTeste {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(6);
        Circle c3 = new Circle();
        c3.setRadius(2);
        System.out.printf("\nThe circle has radius of "
                + c1.getRadius() + " and area of %.2f", c1.getArea());

        System.out.println("\b");
        System.out.println(c3);
        System.out.println(c2);
        c3.setColor("AZUL");
        System.out.println(c1);
        System.out.println(c3.getArea());

        System.out.println("________________________________________");
        Circle c4 = new Circle();
        c4.setRadius(2.2);
        System.out.printf("\nRaio:" + c4.getRadius() + " \narea: %.2f",c4.getArea());
        System.out.printf("\nCircunferência: %.2f" , c4.getCircunferencia() );

    }
}
