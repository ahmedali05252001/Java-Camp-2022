public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(543, "bread", 4);
        ProductManager productManager = new ProductManager();
        productManager.add(product1);

        DataBaseHelper.Crud.create();
        DataBaseHelper.Crud.read();
        DataBaseHelper.Crud.update();
        DataBaseHelper.Crud.delete();
        DataBaseHelper.Connection.createConnection();

    }
}
