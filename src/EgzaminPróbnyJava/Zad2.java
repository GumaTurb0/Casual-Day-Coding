package EgzaminPróbnyJava;

public class Zad2 {
    public static void main(String[] args) {
        String result;
        result = Methods.shorten("Naucz się programować od podstaw", 3 );
        System.out.println(result);
    }
}

//W pliku Main02.java umieść metodę o sygnaturze public static String
// shorten(String str, int length).
//
//Uzupełnij ciało metody tak, by dla otrzymanego napisu zwracała jego
// skrót o ilości znaków podanych w parametrze length.
//Przykład dla napisu Naucz się programować od podstaw oraz ilości znaków 2 otrzymamy Na.
