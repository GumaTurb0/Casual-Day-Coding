package ZadaniaDomoweSQL.firstclass;

import ZadaniaDomoweSQL.firstclass.Cat;
import ZadaniaDomoweSQL.firstclass.Dog;

public class Main01 {

    public static void main(String[] args) {
        Cat puszek = new Cat();
        Dog okruszek = new Dog();

//        Błąd kompilacji
//        Cat śmiałek = new Dog();

//        Błąd kompilacji
//        if (puszek == okruszek) {
//            System.out.println("Hacking!!!!!!");
//        }

        Cat śmiałek = new Cat();
        System.out.println("Hura!");

//
        var pupil = new Cat();
        var łobuziak = new Dog();
        System.out.println("Hura!");

//        if (pupil == łobuziak) {
//
//        }
    }
}
