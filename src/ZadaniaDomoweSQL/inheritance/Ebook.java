package ZadaniaDomoweSQL.inheritance;

public class Ebook extends Book {

    public String name;
    protected String author;
    String price;
    private int pages = 10;
    private int sizeInMB;

    @Override
    public String getName() {
        return name.toUpperCase();
    }

    public void sing() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
        System.out.println(pages);
        System.out.println(sizeInMB);
    }
}
