package ZadaniaDomoweSQL.constructor;

public class Burger {

    private String size;
    private double price;

    public Burger(String size, double price) {
//        if (size == null) {
//            throw new IllegalArgumentException("Non possumus");
//        }
        this.size = size;
//        if (price < 9.99 || price > 50.00) {
//            throw new IllegalArgumentException("Non possumus");
//        }
        this.price = price;
    }

    public Burger() {

    }
//
//    public void setSize(String size) {
//        this.size = size;
//    }
}
