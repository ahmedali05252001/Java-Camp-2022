package methods;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 3, 5, 2, 6, 8, 9 };
        findNumber(numbers, 5);
    }

    public static void findNumber(int[] numbers, int number) {
        boolean state = false;
        for (int num : numbers) {
            if (num == number) {
                state = true;
                break;
            }
        }

        if (state) {
            System.out.println("The number is found.");
        } else {
            System.out.println("The number is not found.");
        }
    }

}
