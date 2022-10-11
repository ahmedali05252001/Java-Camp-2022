package oopChallenge.business;

public class StudentCreditManager implements CreditManager {

    @Override
    public void calculate() {
        System.out.println("Student credits was calculated.");

    }

    @Override
    public void save() {
        System.out.println("Saved.");

    }

}
