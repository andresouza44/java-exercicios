package ww3.ntu.classes01.testes;

import ww3.ntu.classes01.dominio.Account;

public class AccountTeste {
    public static void main(String[] args) {
        Account conta = new Account("001","Andre");
        System.out.println(conta);
        conta.setBalance(100);
        System.out.println(conta);

        Account conta2 = new Account("002","Maria",300);
        System.out.println(conta2);

        conta.tranferTo(conta2,25);
        System.out.println(conta.getBalance());
        System.out.println(conta2.getBalance());
        System.out.println(conta);
        System.out.println(conta2);

        conta.debit(70);
        System.out.println(conta);
        conta.debit(70);

        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.tranferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);


    }




}
