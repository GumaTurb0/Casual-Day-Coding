package ZadaniaDomoweSQL.oop.first;

import pl.coderslab.homeworks.oop.second.Person;

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
            book.setPopularity(book.getPopularity() + 1);
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        int toReturnIndex = -1;
        for (int i = 0; i < books.length; i++) {
            if (book.equals(books[i])) {
                toReturnIndex = i;
                break;
            }
        }
        if (toReturnIndex == -1) {
            return false;
        }
        books[toReturnIndex] = books[books.length - 1];
        books = Arrays.copyOf(books, books.length - 1);
        book.setAvailable(true);
        return true;

    }

    public void returnAll() {
        for (Book book : books) {
            book.setAvailable(true);
        }
        books = new Book[0];
    }
}
