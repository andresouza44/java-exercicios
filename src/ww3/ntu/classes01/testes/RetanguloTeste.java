package ww3.ntu.classes01.testes;

import ww3.ntu.classes01.dominio.Retangulo;

public class RetanguloTeste {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(1.2f,3.4f);
        System.out.println(r1);

        Retangulo r2 = new Retangulo();
        System.out.println(r2);

        r1.setComprimento(7.8f);
        r1.setLargura(5.6f);
        System.out.println(r1);
        System.out.println("length is: " + r1.getLargura());
        System.out.println("width is: " + r1.getComprimento());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", r1.CalculaArea());
        System.out.printf("perimeter is: %.2f%n", r1.CalculaPerimetro());
    }
}
