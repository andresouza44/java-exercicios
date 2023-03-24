package ww3.ntu.classes01.testes;

import ww3.ntu.classes01.dominio.Empregado;

public class EmpregadoTeste {
    public static void main(String[] args) {
        // Test constructor and toString()

        Empregado e1 = new Empregado(8, "Peter", "Tan", 2500);
        System.out.println(e1);  // toString();

        // Test Setters and Getters
        e1.setSalario(999);
        System.out.println(e1);  // toString();
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalario());

        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.salarioAnual()); // Test method

        // Test raiseSalary()
        System.out.println(e1.aumentaSalario(10));
        System.out.println(e1);
    }
}
