package ww3.ntu.classes01.dominio;



public class Empregado {
    private  int id;
    private String firstName;
    private String lastName;
    private  int salario;

    public Empregado() {
    }

    public Empregado(int id, String firstName, String lastName, int salario) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salario = salario;
    }

    public int aumentaSalario (int porcentagem){
        int novoSalario = this.salario + this.salario*porcentagem/100;
        setSalario(novoSalario);
        return novoSalario;
    }
    public  int salarioAnual(){
        return this.salario*12;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return getFirstName() + " " + getLastName();

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado[" +
                "id=" + id +
                ", Name='" + firstName + ' ' +
                  lastName + ' ' +
                ", salario=" + salario +
                ']';
    }
}



