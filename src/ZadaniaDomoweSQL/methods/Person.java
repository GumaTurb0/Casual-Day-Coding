package ZadaniaDomoweSQL.methods;

public class Person {

    private String name = "Jaś";
    private String surname = "Kowalski";
    private int age = 10;
    private char gender = 'M';

    public void increaseAge(Person this) {
        this.age++;
    }

    public static void increaseAge(Person that) {
        that.age++;
    }

    public String getFullName(Person this) {
        return this.name + " "  + this.surname;
    }

    public void setName(Person this, String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "pl.coderslab.oop.methods.Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
