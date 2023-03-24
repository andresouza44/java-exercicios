package classes.metodos.composition.teste;

import classes.metodos.composition.dominio.Author;
import classes.metodos.composition.dominio.Book;

public class AuthorTeste {
    public static void main(String[] args) {
        // Test constructor and toString()
        Author ahTeck = new Author("Tan Ah Teck", "teck@nowhere.com", 'm');

        System.out.println(ahTeck);  // Author's toString()
        //Tan Ah Teck (m) at ahTeck@somewhere.com

        // Test Book's constructor and toString()
        Book dummyBook = new Book("Java for dummies", ahTeck, 9.99, 99);
        System.out.println(dummyBook);  // Book's toString()
        //'Java for dummies' by Tan Ah Teck (m) at ahTeck@somewhere.com

        // Test Setters and Getters
        dummyBook.setPrice(8.88);
        dummyBook.setQty(88);
        System.out.println("name is: " + dummyBook.getName());
        //name is: Java for dummies
        System.out.println("price is: " + dummyBook.getPrice());
        //price is: 8.88
        System.out.println("qty is: " + dummyBook.getQty());
        //qty is: 88
        System.out.println("author is: " + dummyBook.getAuthor());  // invoke Author's toString()
        //author is: Tan Ah Teck (m) at ahTeck@somewhere.com
        System.out.println("author's name is: " + dummyBook.getAuthor().getName());
        //author's name is: Tan Ah Teck
        System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
        //author's email is: ahTeck@somewhere.com
        System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
        //author's gender is: m

        // Using an anonymous Author instance to create a Book instance
        Book moreDummyBook = new Book("Java for more dummies",
                new Author("Peter Lee", "peter@nowhere.com", 'm'), // an anonymous Author's instance
                19.99, 8);
        System.out.println(moreDummyBook);  // Book's toString()
        //'Java for more dummies' by Peter Lee (m) at peter@nowhere.com

    }


}
