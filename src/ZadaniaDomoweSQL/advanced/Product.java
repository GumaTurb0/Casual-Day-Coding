package ZadaniaDomoweSQL.advanced;

public class Product {

    private static int nextId = 1;

    private static final double MIN_PRICE = 0.01;

    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        if (price < 0.01) {
            throw new IllegalArgumentException("Cena nie może być mniejsza od " + MIN_PRICE);
        }
        this.price = price;
        this.id = nextId++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < MIN_PRICE) {
            throw new IllegalArgumentException("Cena nie może być mniejsza od " + MIN_PRICE);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
