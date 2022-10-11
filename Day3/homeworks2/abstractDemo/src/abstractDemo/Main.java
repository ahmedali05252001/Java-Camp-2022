package abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager1 = new CustomerManager(new OracleDataBaseManager());
        customerManager1.getCustomers();
    }
}
