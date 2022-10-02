package classesWithAttributes;

public class Product {

    // constructor overloading
    public Product() {

    }

    public Product(int id, String name, String description, double price, int stock, String color) {
        // this.id = id;
        setId(id);
        setName(name);
        setDescription(description);
        setPrice(price);
        setStock(stock);
        setColor(color);
    }

    // attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // read-only
    public int getId() {
        // other codes
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
