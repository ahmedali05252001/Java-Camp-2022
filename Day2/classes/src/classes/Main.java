package classes;

public class Main {

    // explanation of stack and heap concepts
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();

        customerManager = customerManager2;// cm1 is holding the cm2's reference
    }
}
