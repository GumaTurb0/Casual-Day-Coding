package ZadaniaDomoweSQL.constructor;

public class Person {

    private String name;
    private String surname;
    private int age;
    private char gender;

    public Person(String name, String surname, int age, char gender) {
        //dużo mądrego kodu
        this.name = name;
        //jeszcze więcej kodu
        this.surname = surname;
        this.age = age;
        //miliony monet i miliony linii kodu...
        this.gender = gender;
    }

    public Person(String name, String surname) {
        this(name, surname, 0, '\0');
//        this.name = name;
//        this.surname = surname;
    }

    public Person(String name, int age) {
        //wywołanie innego konstruktora MUSI BYC pierwszą linią kodu!
        this(name, null, age, '\0');
//        this.name = name;
//        this.age = age;
    }
}
