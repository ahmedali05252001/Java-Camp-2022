package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager = new ProductManager();

        Product product2 = new Product(4, "denem", "son denemem", 342.4, 5, "red");

        System.out.println(product2.getColor());
        // fields type is private/No access
        // product.name = "Laptop";
        // product.id = 534535;
        // product.description = "Lenovo laptop i5 cpu last model";
        // product.price = 700.60;
        // product.stock = 20;

        // fields type is private/No access
        // product.setName("Laptop");
        // product.setId(87492);
        // product.setDescription("Lenovo laptop i5 cpu last model");
        // product.setPrice(700.32);
        // product.setStock(20);

        // Insert to database using JDBC(by ussing ProductManager class)

        productManager.Add(product);

        productManager.Add2(1, "", "", 43, 3);
    }
}
