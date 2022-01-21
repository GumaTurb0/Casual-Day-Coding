package ZadaniaDomoweSQL.inheritance;

public class Book extends Paper {

    public String name;
    protected String author;
    double price;
    private int pages = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getInfo() {
        return String.format("%s (%s, %d): %.2f", name, author, pages, price);
//        return name + " (" + author + ", " + pages + "): " + price;
    }
}
