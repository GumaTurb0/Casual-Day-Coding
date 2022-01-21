package ZadaniaDomoweSQL.oop.first;

import pl.coderslab.homeworks.oop.second.Person;

public class Author extends Person {

    private String pseudonym;

    public Author(String id, String firstName, String lastName, String pseudonym) {
        super(id, firstName, lastName);
        this.pseudonym = pseudonym;
    }
}
