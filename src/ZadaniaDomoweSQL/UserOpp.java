package ZadaniaDomoweSQL;

import java.util.Arrays;

public class User extends Person {

    private Book[] books = new Book[0];

    public User(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public boolean addBook(Book book) {
        if (book.isAvailable()) {
            books = Arrays.copyOf(books, books.length + 1);
            books[books.length - 1] = book;
            book.setAvailable(false);
            return true;
        }
        return false;
    }
}
