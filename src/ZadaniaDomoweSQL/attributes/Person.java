package ZadaniaDomoweSQL.attributes;

public class Person {

    public String name = "Jaś";
    public String surname = "Kowalski";
    public int age = 10;
    public char gender = 'M';

    public void printNameWithAge() {
        String info = this.name + " ma " + this.age;
        System.out.println(info);
    }

    public void setGender(char gender) {
        if (gender != 'M' && gender != 'K') {
            throw new IllegalArgumentException("Not yet...");
        }
        this.gender = gender;
//        this.gender = String.valueOf(gender);
    }

    public void setGender(String gender) {
        this.gender = gender.charAt(0);
    }

    public char getGender() {
//        if (Character.isLowerCase(gender)) {
//            return Character.toUpperCase(gender);
//        }
//        return gender;
        return this.getGenderAlwaysAsUpperCase();
    }

    private char getGenderAlwaysAsUpperCase() {
        return Character.toUpperCase(gender);
    }

    @Override
    public String toString() {
        return "pl.coderslab.oop.attributes.Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
