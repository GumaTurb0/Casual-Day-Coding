package pl.coderslab.oop.inheritance;

import ZadaniaDomoweSQL.inheritance.Book;
import ZadaniaDomoweSQL.inheritance.Ebook;

public class Main00 {

    public static void main(String[] args) {
        Book book = new Book();
        String info = book.getInfo();
        System.out.println(info);

        Ebook ebook = new Ebook();
        String info1 = ebook.getInfo();
        ebook.sing();

        Book wtf = new Ebook();
//        wtf.sing();

        Ebook wtf2 = (Ebook) wtf;
//        Ebook wtf3 = new Book();
//        wtf3.sing();

        Book b = new Book();
        b.name = "abc";
        System.out.println(b.getName());

        Ebook eb = new Ebook();
        eb.name = "zzz";
        System.out.println(eb.getName());
    }
}
