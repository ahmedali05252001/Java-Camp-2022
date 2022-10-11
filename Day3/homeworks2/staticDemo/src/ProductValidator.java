public class ProductValidator {

    static {
        System.out.println("Statik operasyonumuz calisti.");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        }
        return false;
    }

    public static class Deneme {
        static void ad() {
            System.out.println("Helloooo");
        }

        static void ic() {

        }

    }

}
