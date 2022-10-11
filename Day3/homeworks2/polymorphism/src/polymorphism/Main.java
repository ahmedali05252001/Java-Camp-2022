package polymorphism;

import polymorphism.business.CustomerManager;
import polymorphism.core.logging.BaseLogger;
import polymorphism.core.logging.ConsoleLogger;
import polymorphism.core.logging.DataBaseLogger;
import polymorphism.core.logging.EmailLogger;
import polymorphism.core.logging.FileLogger;

public class Main {
    public static void main(String[] args) {

        // Polymorphism
        // BaseLogger[] Loggers = new BaseLogger[] { new EmailLogger(), new
        // FileLogger(), new DataBaseLogger(),
        // new ConsoleLogger() };

        // for (BaseLogger logger : Loggers) {
        // logger.log("Logged");
        // }

        CustomerManager customer1 = new CustomerManager(new DataBaseLogger());
        customer1.add();
    }
}
