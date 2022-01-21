package ZadaniaDomoweSQL.attributes;

import static ZadaniaDomoweSQL.attributes.PersonUtils.printNameWithAge;

public class Main03 {

    public static void main(String[] args) {
        Person someone = new Person();
//        String[] array = {"abc","cde","",null};
//        Object[] you = {new Object[] {"Jaś", "Tomek"}, "Kowalski", 10, 'M'};
        System.out.println("someone.name = " + someone.name);
        System.out.println("someone.surname = " + someone.surname);
        System.out.println("someone.age = " + someone.age);
        System.out.println("someone.gender = " + someone.gender);

//      cannot resolve symbol "age"
//      age

//      Niezależna zmienna o tej samej nazwie, żyjąca szczęśliwie tylko w metodzie
        String age = "pięć lat";

        someone.age = 11;
        System.out.println("someone.age = " + someone.age);

        someone.age = someone.age + 1;
        System.out.println("someone.age = " + someone.age);

        someone.printNameWithAge();
        someone.age = 7;
        someone.printNameWithAge();
        someone.printNameWithAge();
        printNameWithAge(someone);

        someone.gender='K';
        someone.setGender('K');

        System.out.println(someone.gender);
        System.out.println(someone.getGender());

        int genderPlus5 = someone.gender + 5;
        int genderPlus4 = someone.getGender() + 4;
//        String str = "abc";
//        String w = str.toUpperCase().trim().repeat(3).replace('a', 'z');
//        String z = replace('a', 'z', repeat(3, trim(toUpperCase(str))));
    }
}
