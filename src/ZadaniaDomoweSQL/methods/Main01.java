package ZadaniaDomoweSQL.methods;

import static ZadaniaDomoweSQL.methods.Person.increaseAge;

public class Main01 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(61);
        person.setGender('M');
        person.setName("Józef");
        person.setSurname("Konstantyn");

        System.out.println(person);

        System.out.println("person.getFullName() = " + person.getFullName());

        person.increaseAge();
        System.out.println(person);

        Person guyToIncrementAge = new Person();
        guyToIncrementAge.increaseAge();

        Person richLady = new Person();
        richLady.increaseAge();
        increaseAge(richLady);
    }
}
