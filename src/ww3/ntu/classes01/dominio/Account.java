package ww3.ntu.classes01.dominio;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit( int montante){
        setBalance(this.balance+montante);
        return this.balance;

    }

    public int debit (int montante){
        if (montante <= this.balance){
            setBalance((this.balance-montante));
            return  this.balance;
            }else {
                System.out.println("Saldo Insuficiente");
            }
         return this.balance;
    }

    public int tranferTo (Account conta, int montante){
        if (montante <= this.balance){
            setBalance(this.balance - montante);
            conta.setBalance(conta.getBalance()+montante);
        }else{
            System.out.println("Saldo Insuficiente");
        }
        return this.balance;

    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + ' ' +
                ", name='" + name + ' ' +
                ", balance=" + balance +
                '}';
    }
}


