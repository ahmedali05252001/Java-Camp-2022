package oop1;

public class Main {
    public static void main(String[] args) {
        String message = "Hello Niga";
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        // // set Value
        // product1.name = "Delonghi Kahve Makinesi";
        // product1.unitPrice = 7500;
        // product1.discount = 7;
        // product1.unitsStock = 3;
        // product1.imageUrl = "unknownimg.jpg";

        // product2.name = "Smeng Kahve Makinesi";
        // product2.unitPrice = 3500;
        // product2.discount = 9;
        // product2.unitsStock = 7;
        // product2.imageUrl = "unknownimg.jpg";

        // product3.name = "Neptun Kahve Makinesi";
        // product3.unitPrice = 8500;
        // product3.discount = 15;
        // product3.unitsStock = 2;
        // product3.imageUrl = "unknownimg.jpg";

        product1.setName("Product name");
        System.out.println(product1.getName());

        // Product[] products = { product1, product2, product3 };

        // // forEach
        // for (Product product : products) {
        // System.out.println(
        // "Name: " + product.name + "\nUnit Price:" + product.unitPrice + "\nDiscount:
        // " + product.discount
        // + "\nUnits in stock: " + product.unitsStock + "\nImage URL: " +
        // product.imageUrl);
        // System.out.println("\n");
        // }

        // get
        // System.out.println(product1.name);

        // In the Bank
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05343534534");
        individualCustomer.setCustomerNumber("543");
        individualCustomer.setName("Ahmed");
        individualCustomer.setSurname("Ali");

        CorporateCustomer corporateCustomer = new CorporateCustomer();

        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Trendmarket");
        corporateCustomer.setCustomerNumber("3456");
        corporateCustomer.setPhone("0434543453");
        corporateCustomer.setTaxNumber("987654321");

        Customer[] customers = { individualCustomer, corporateCustomer };
    }
}
