package ZadaniaDomoweSQL.methods;

public class Car {

    private String brand;
    private String model;
    private double price;

    @Override
    public String toString() {
        return this.brand + ": " + String.format("%.2f", this.price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
