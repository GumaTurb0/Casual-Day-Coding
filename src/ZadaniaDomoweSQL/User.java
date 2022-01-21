package ZadaniaDomoweSQL;

import java.util.Arrays;

public class User {

    private String id;
    private String firstName;
    private String lastName;
    private Book[] books = new Book[0];

    public User(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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
