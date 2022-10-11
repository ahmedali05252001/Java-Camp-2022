package abstractDemo;

public class CustomerManager {
    private BaseDataBaseManager databaseManager;

    public CustomerManager(BaseDataBaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void getCustomers() {
        System.out.println("Veri dataBaseden aliniyor. ");
        this.databaseManager.getData();
    }

}
