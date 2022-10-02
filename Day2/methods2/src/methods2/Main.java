package methods2;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted.");
    }

    public static void update() {
        System.out.println("Updated.");
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static String giveCity() {
        return "Istanbul";
    }
}
