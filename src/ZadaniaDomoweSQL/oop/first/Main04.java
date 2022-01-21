package ZadaniaDomoweSQL.oop.first;

public class Main04 {

    public static void main(String[] args) {
        User someUser = new User("X_1", "Jaś", "Fasola");
        Book book = new Book(1, "Fajna", new Author("X_1", "John", "Travolta", "Lala"));

        boolean added = someUser.addBook(book);
        System.out.println("Added? " + added);

        User user2 = new User("X_2", "Ziemowit", "Ziemski");
        added = user2.addBook(book);
        System.out.println("Added? " + added);
    }
}
