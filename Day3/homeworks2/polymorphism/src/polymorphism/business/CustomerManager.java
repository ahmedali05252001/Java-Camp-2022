package polymorphism.business;

import polymorphism.core.logging.BaseLogger;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Eklendi.");
        this.logger.log("Loglandi");
    }
}
