package ZadaniaDomoweSQL;

public class D1SqlExe3Book {
    public static void main(String[] args) {
        Author onOn = new Author("X_1", "On", "Onowy", "OnOn");
        Author onaOna = new Author("X_2", "Ona", "Onowa", "OnaOna");
        Author onoOno = new Author("X_3", "Ono", "Onowo", "OnoOno");

        Book book1 = new Book(1, "Siła nawyku");
        Book book2 = new Book(2, "Coś tam", onOn);
        Book book3 = new Book(3, "Bla bla", onaOna, new Author[]{onOn, onoOno});

    }
}
