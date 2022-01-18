package EgzaminPróbnyJava;

public class Zad6 {
    public static void main(String[] args) {
        String str = ("Ala ma kota");
        System.out.println(Methods.replaceStr(str, "kota", "psa"));

    }
}

/**  W pliku Main06.java umieść metodę o sygnaturze public static Strin
 g replaceStr(String str, String forReplace, String replacement).
Uzupełnij ciało metody tak aby zwracała napis powstały z zamiany w
 napisie str wszystkich wystąpień napisu forReplace przez napis replacement.*/