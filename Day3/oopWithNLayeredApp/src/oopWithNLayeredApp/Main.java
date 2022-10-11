package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public abstract class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Product product1 = new Product(1, "iphone xr", 22);
        Logger[] loggers = { new FileLogger(), new DatabaseLogger(), new MailLogger() };
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);

        productManager.add(product1);

        // new HibernateProductDao(), [new MailLogger(), new DatabaseLogger(), new
        // FileLogger()]
    }
}
